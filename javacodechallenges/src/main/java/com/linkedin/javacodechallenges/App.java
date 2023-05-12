package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        double oneCCF = 748;
        double minCharge = 18.84;
        double additionalChargePerCCF=3.9;
        if(gallonsUsage > 2*oneCCF){
            double extraUsage = gallonsUsage - 2*oneCCF;
            return minCharge + Math.ceil(extraUsage/oneCCF) * additionalChargePerCCF;
        }
        else{
            return minCharge;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
