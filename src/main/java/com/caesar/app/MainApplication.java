package com.caesar.app;

import com.caesar.app.controller.IController;
import com.caesar.app.controller.controllerImpl.Controller;
import com.caesar.app.decryption.decryptionImpl.DecryptImpl;
import com.caesar.app.encryption.encryptionImpl.EncryptImpl;

public class MainApplication {
    public static void main(String[] args) {
        IController iController = new Controller(
                new DecryptImpl(),
                new EncryptImpl()
        );
        iController.controller();
    }
}
