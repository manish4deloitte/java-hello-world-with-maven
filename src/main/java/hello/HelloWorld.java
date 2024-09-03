package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        // Register a shutdown hook to handle graceful shutdown
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down...");
        }));

        Greeter greeter = new Greeter();

        System.out.println("Application started. Press Ctrl+C to stop.");

        // Continuous loop to keep the application running
        while (true) {
            LocalTime currentTime = new LocalTime();
            System.out.println("The current local time is: " + currentTime);
            System.out.println(greeter.sayHello());

            try {
                // Sleep for a while before printing the time again
                Thread.sleep(10000); // Sleep for 10 seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted, Failed to complete operation");
            }
        }
    }
}
