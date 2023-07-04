package com.appdeveloperblog.web.animalapp.utils;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

@Component
public class RandomCode {

    private final Random RANDOM = new SecureRandom();
    private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVXZabcdefghijklmnopqrstuvxz";

    public String generateUserId(int lenght) {
        StringBuilder returnValue = new StringBuilder(lenght);

        for (int i = 0; i < lenght; i++) {
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return new String(returnValue);
    }
}
