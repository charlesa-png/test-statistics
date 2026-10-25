package com.pluralsight;

import java.util.Arrays;

public class TestStats {
    public static void main(String[] args) {
        int[] testScores = {100,65,98,88,72,95,92,98,78,93};
        int sumOfScores=0;

        int highest=testScores[0];
        int lowest=testScores[0];
        for (int i = 0; i < testScores.length; i++){
            sumOfScores += testScores[i];
            if(testScores[i] > highest){
                highest = testScores[i];
            }
            if(testScores[i] < lowest){
                lowest = testScores[i];
            }
        }
        double average = (double) sumOfScores/testScores.length;

        System.out.printf("Average: %.2f\n", average);
        System.out.println("Highest Score:" + highest);
        System.out.println("Lowest Score:" + lowest);
    }
}
