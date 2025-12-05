package com.caesar.app.controller.controllerImpl;


import com.caesar.app.controller.IController;
import com.caesar.app.decryption.IDecryption;
import com.caesar.app.encryption.IEncryption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller implements IController {

    private final IDecryption _decryption;
    private final IEncryption _encryption;

    public Controller(IDecryption IDecryption, IEncryption IEncryption) {
        _decryption = IDecryption;
        _encryption = IEncryption;
    }

    @Override
    public void controller() {
        Scanner scanner = new Scanner(System.in);
        String message;
        int key;

        while (true) {
            try {
                System.out.println("Select operation:");
                System.out.println("1. encrypt");
                System.out.println("2. decrypt");

                int select = scanner.nextInt();

                switch (select) {
                    case 1:
                        System.out.println("Enter STRING for encryption:");
                        message = scanner.next();

                        System.out.println("Enter KEY:");
                        key = scanner.nextInt();

                        String encrypted = _encryption.encrypt(message, key);
                        System.out.println("Encrypted: " + encrypted);
                        break;

                    case 2:
                        System.out.println("Enter STRING for decryption:");
                        message = scanner.next();

                        System.out.println("Enter KEY:");
                        key = scanner.nextInt();

                        String decrypted = _decryption.decrypt(message, key);
                        System.out.println("Decrypted: " + decrypted);
                        break;
                    default:
                        System.out.println("only choose 1 or 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("invalid input" + e);
                scanner.next();
            }
        }
    }
}
