package com.linkedin.javacodechallenges;

import java.util.List;

public class App {
    public static double calculateAverageChangeInvested(List<Double> purchases) {
        double investment = 0;
        for (Double purchase : purchases) {
            investment = investment + (Math.ceil(purchase) - purchase);
        }
        return purchases.size() != 0 ? investment / purchases.size() : 0;

        //using streams
//        return purchases.stream()
//                .mapToDouble(x -> Math.ceil(x) - x)
//                .average().orElse(0);
    }

    public static void main(String[] args) {
        List<Double> purchases = List.of(12.38, 38.29, 5.27, 3.21);
        System.out.println(calculateAverageChangeInvested(purchases));
    }
}
