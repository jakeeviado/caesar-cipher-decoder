package com.caesar.app;

public class Encrypt {

    Alphabet alphabet = new Alphabet();

    public String encrypt(String message, int shiftKey) {
        message = message.toLowerCase();
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            int characterPosition = alphabet.alpha.indexOf(message.charAt(i));
            int keyValue = (shiftKey + characterPosition) % 26;
            char replaceValue = alphabet.alpha.charAt(keyValue);
            cipherText.append(replaceValue);
        }
        return cipherText.toString();
    }
}
