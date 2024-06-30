package org.island.service.threadsService;

import org.island.service.plants.GrowService;

public class GrowTask implements Runnable {

    private final GrowService growService = new GrowService();
    @Override
    public void run() {
        growService.grow();
    }
}
