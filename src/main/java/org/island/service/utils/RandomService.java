package org.island.service.utils;

import java.util.concurrent.ThreadLocalRandom;

public class RandomService {
    public int random(int from, int to) {
        int random = ThreadLocalRandom.current().nextInt(from, to);

        return random;
    }
}
