package com.company;

public class Max {
    static int findMaxMoreTwo(int[][] array) {
        int row = array.length;
        int col = array[0].length;

        int answer= 0;
        int temp = 0;
        int temp1 = 0;
        int counter = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp1 = array[i][j];
                array[i][j] = 0;

                for (int m = 0; m < row; m++) {
                    for (int n = 0; n < col; n++) {
                        if (temp1 == array[m][n])
                        {
                            answer = array[m][n];
                        } else
                            counter++;
                    }

                    if (temp > answer)
                        answer = temp;
                }

                temp = answer;
               array[i][j] = temp1;

            }
        }
        double kof;
        kof = Math.pow((double) row, 4);

            return answer;
    }
}

