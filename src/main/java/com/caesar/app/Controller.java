package com.caesar.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {

    Encrypt encryption = new Encrypt();
    Decrypt decryption =  new Decrypt();

    public void controller() {
        Scanner scanner = new Scanner(System.in);
        String message;
        int shiftKey;

        do {
            try {
                System.out.println("Select operation:");
                System.out.println("1. encrypt");
                System.out.println("2. decrypt");

                while (!scanner.hasNextInt()) {
                    scanner.next();
                }

                int select;
                select = scanner.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("Enter STRING for encryption");
                        message = scanner.next();

                        System.out.println("\nEnter KEY:");
                        shiftKey = scanner.nextInt();

                        encryption.encrypt(message, shiftKey);
                        System.out.println("\nEncrypted message:" + encryption.encrypt(message, shiftKey));
                    case 2:
                        System.out.println("Enter STRING for decryption");
                        message = scanner.next();

                        System.out.println("\nEnter KEY:");
                        shiftKey = scanner.nextInt();

                        decryption.decrypt(message, shiftKey);
                        System.out.println("\nDecrypted message:" + decryption.decrypt(message, shiftKey));
                    default:
                        System.out.println("only choose from range of 1 to 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("input mismatch"+ e);
                scanner.close();
            }
        } while (true);
    }
}
