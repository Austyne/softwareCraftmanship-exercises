package be.ucll.craft;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Demonstrating Lazy Evaluation in Streams
        // before running this, try to predict the output order

        System.out.println("proving lazy evaluation of streams");
        List<String> lazyNames = List.of("Alice", "Bob", "Charlie");

        System.out.println("1. Creating stream...");
        // We define a stream with print statements inside the logic
        Stream<String> lazyStream = lazyNames.stream()
                .filter(n -> {
                    System.out.println("   Filter checking: " + n);
                    return n.length() > 3;
                })
                .map(n -> {
                    System.out.println("   Map converting: " + n);
                    return n.toUpperCase();
                });

        System.out.println("2. Stream created.");
        System.out.println("3. Invoking terminal operation...");

        long count = lazyStream.count();

        System.out.println("4. Stream execution complete. Count: " + count);
    }

}
