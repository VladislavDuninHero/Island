package org.island.service.island;

import java.util.Map;

public class PrintIslandService {

    private StringBuilder builder = new StringBuilder();

    public void printStatistic(Map<String, Integer> statistic) {
        for (Map.Entry<String, Integer> organism : statistic.entrySet()) {
            builder.append(organism.getKey().toUpperCase());
            builder.append(": ");
            builder.append(organism.getValue());
            builder.append("\n");
        }

        System.out.println(builder.toString());
        builder.delete(0, builder.length());
    }
}
