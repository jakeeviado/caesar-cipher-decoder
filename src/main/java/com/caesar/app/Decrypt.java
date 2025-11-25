package com.caesar.app;

public class Decrypt {

    Alphabet alphabet =  new Alphabet();

    public String decrypt(String cipherText, int shiftKey) {
        cipherText = cipherText.toLowerCase();
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < cipherText.length(); i++) {
            int characterPosition =  alphabet.alpha.indexOf(cipherText.charAt(i));
            int keyValue = (characterPosition - shiftKey) % 26;
            if (keyValue < 0) {
                keyValue = alphabet.alpha.length() + keyValue;
            }
            char replaceValue =  alphabet.alpha.charAt(keyValue);
            message.append(replaceValue);
        }
        return message.toString();
     }
}
