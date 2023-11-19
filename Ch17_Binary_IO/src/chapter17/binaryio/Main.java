package chapter17.binaryio;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- File Operation Menu ---");
            System.out.println("1. Test FileStream");
            System.out.println("2. Test DataStream");
            System.out.println("3. Detect End Of File");
            System.out.println("4. Copy File");
            System.out.println("5. Test ObjectOutputStream");
            System.out.println("6. Test ObjectInputStream");
            System.out.println("7. Test ObjectStream For Array");
            System.out.println("8. Test RandomAccessFile");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        TestFileStream.main(args);
                        break;
                    case 2:
                        TestDataStream.main(args);
                        break;
                    case 3:
                        DetectEndOfFile.main(args);
                        break;
                    case 4:
                        // Example args for Copy: {"source.txt", "destination.txt"}
                        Copy.main(new String[]{"source.txt", "destination.txt"});
                        break;
                    case 5:
                        TestObjectOutputStream.main(args);
                        break;
                    case 6:
                        TestObjectInputStream.main(args);
                        break;
                    case 7:
                        TestObjectStreamForArray.main(args);
                        break;
                    case 8:
                        TestRandomAccessFile.main(args);
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 0 and 8.");
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } while (choice != 0);

        scanner.close();
    }
}

