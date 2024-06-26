package org.island2.controllers;

import java.util.Random;

public class GenerateRandomService {
    public int random(int from, int to) {
        int randomNumber = new Random().nextInt(from, to);

        return randomNumber;
    }
}
