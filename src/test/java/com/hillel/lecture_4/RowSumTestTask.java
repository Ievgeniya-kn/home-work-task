package com.hillel.lecture_4;

/**
 * Написать программу, которая считает сумму двух колонок. Если
 * одна из колонок больше, вывести, какая именно больше. Если
 * колонки одинаковы - вывести результат в виде:
 * | row_1 | row_2 | sum |
 * | 2 | 5 | 7 |
 */
public class RowSumTestTask {

    public static void main(String[] args) {
        int[][] table = {{2, 4, 7, 13},
                {5, 12, 7, 14}};

        int m = table[0].length;
        int sum;
        String Number = "";
        System.out.println("| Row_1 | Row_2 | Sum | More");

        for (int i = 0; i < m; i++) {
            sum = table[0][i] + table[1][i];
            if (table[0][i] == table[1][i]) {
                Number = "Equals";
            } else if (table[0][i] > table[1][i]) {
                Number = "First";
            } else Number = "Second";
            System.out.println("| " + table[0][i] + " \t| " + table[1][i] + " \t| " + sum + " \t| " + Number);
        }
    }


}
