package com.codersbay;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char[] bingo = {'B', 'I', 'N', 'G', 'O'};
        int[][] numbers = new int[5][5];
        ArrayList<Integer> list = new ArrayList<>();
        boolean used = false;
        Random num = new Random();
        int res;
        int offset = 1;
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo.length; j++) {
                while (!used) {
                    res = offset + num.nextInt(15);
                    numbers[i][j] = res;
                    if (!list.contains(res)) {
                        used = true;
                        list.add(res);
                    }

                }
                used = false;
            }
            offset += 15;
        }

        System.out.println("B  | I  | N  | G  | O  |");
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == 2 && j == 2) {
                    System.out.print("   | ");

                } else {
                    System.out.print(String.format("%02d", numbers[j][i]));
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }
}
