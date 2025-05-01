package Homework20;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args){
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Future<List<String>>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Callable<List<String>> task = new FileGeneratorTask(i + 1);
            Future<List<String>> future = executor.submit(task);
            futures.add(future);
        }

        for (Future<List<String>> future : futures) {
            try {
                List<String> fileNames = future.get();
                System.out.println("Файлы, созданные задачей: " + fileNames);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}



