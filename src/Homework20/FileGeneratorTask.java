package Homework20;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class FileGeneratorTask implements Callable<List<String>> {

        private static final Random RANDOM = new Random();
        private int taskId;

    public FileGeneratorTask(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public List<String> call() throws Exception {
            List<String> fileNames = new ArrayList<>();
            String threadName = Thread.currentThread().getName();

            System.out.println("Задача " + taskId + " выполняется в потоке: " + threadName);

            for (int i = 0; i < 10; i++) {
                String fileName = "file_task" + taskId + "_file" + i + ".txt";
                writeRandomLinesToFile(fileName);
                fileNames.add(fileName);

                int sleepTime = RANDOM.nextInt(3) + 1;
                System.out.println("Поток " + threadName + " засыпает на " + sleepTime + " секунд...");
                Thread.sleep(sleepTime * 1000L);
            }

            System.out.println("Задача " + taskId + " завершена в потоке: " + threadName);
            return fileNames;
        }

        private void writeRandomLinesToFile(String fileName) throws IOException {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (int i = 0; i < 10; i++) {
                    writer.write(generateRandomString());
                    writer.newLine();
                }
            }
        }

        private String generateRandomString() {
            String letters = "ABCDEFGHIJKLMNOPQRSTUVWXY";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                int index = RANDOM.nextInt(letters.length());
                sb.append(letters.charAt(index));
            }
            return sb.toString();
        }
    }