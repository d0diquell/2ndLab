package com.company;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter dimension of your 2D array(1st number of rows then columns!)");
            int row = in.nextInt();
            if (row < 0) {
                throw new Exception("Error!!! Number of rows have to be > 0");
            }
            int col = in.nextInt();
            if (col < 0) {
                throw new Exception("Error!!! Number of columns have to be > 0");
            }
            System.out.println("Fill your 2D array");
            int array[][] = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    array[i][j] = in.nextInt();
                }
            }


            System.out.println("Your max more then 2 times in this array is: " + Max.findMaxMoreTwo(array));

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        }
    }


