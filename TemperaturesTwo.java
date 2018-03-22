package com.company;

public class TemperaturesTwo {
    public static void main(String[] args) {
        int temps[][] = {{68, 70, 76, 70, 68, 71, 75},
                {76, 76, 87, 84, 82, 75, 83},
                {73, 72, 81, 78, 76, 73, 77},
                {64, 65, 69, 68, 70, 74, 72}};
        display(temps);

        int sundayColumnTotal = 0;
        int mondayColumnTotal = 0;
        int tuesdayColumnTotal = 0;
        int wednesdayColumnTotal = 0;
        int thursdayColumnTotal = 0;
        int fridayColumnTotal = 0;
        int saturdayColumnTotal = 0;

        for (int i = 0; i < temps.length; i++) {
            sundayColumnTotal += temps[i][0];
            mondayColumnTotal += temps[i][1];
            tuesdayColumnTotal += temps[i][2];
            wednesdayColumnTotal+=temps[i][3];
            thursdayColumnTotal += temps[i][4];
            fridayColumnTotal += temps[i][5];
            saturdayColumnTotal += temps[i][6];
            }
        double sundayAverage = sundayColumnTotal/4;
        double mondayAverage = mondayColumnTotal/4;
        double tuesdayAverage = tuesdayColumnTotal/4;
        double wednesdayAverage = wednesdayColumnTotal/4;
        double thursdayAverage = thursdayColumnTotal/4;
        double fridayAverage = fridayColumnTotal/4;
        double saturdayAverage = saturdayColumnTotal/4;

        int sevenAmRowTotal = 0;
        int threePmRowTotal = 0;
        int sevenPmRowTotal = 0;
        int threeAmRowTotal = 0;
        for (int i = 0; i < temps.length; i++) {
            sevenAmRowTotal += temps[0][i];
            threePmRowTotal += temps [1][i];
            sevenPmRowTotal += temps [2][i];
            threeAmRowTotal += temps [3][i];
            }

            double sevenAmAverage = sevenAmRowTotal/4;
            double threePmAverage = threePmRowTotal/4;
            double sevenPmAverage = sevenPmRowTotal/4;
            double threeAmAverage = threeAmRowTotal/4;

        int total=sum(temps);

        double totalAverage = total/28;

        System.out.println("Temperature Calculator\n");
        System.out.println("The data provided are: \n");
        System.out.println("7 AM: 68, 70, 76, 70, 68, 71, 75");
        System.out.println("3 PM: 76, 76, 87, 84, 82, 75, 83");
        System.out.println("7 PM: 73, 72, 81, 78, 76, 73, 77");
        System.out.println("3 AM: 64, 65, 69, 68, 70, 74, 72");

        System.out.println("\nBased on that data, the following are the average temperatures for the week.\n");

        System.out.println("Sun: " + sundayAverage);
        System.out.println("Mon: " + mondayAverage);
        System.out.println("Tue: " + tuesdayAverage);
        System.out.println("Wed: " + wednesdayAverage);
        System.out.println("Thu: " + thursdayAverage);
        System.out.println("Fri: " + fridayAverage);
        System.out.println("Sat: " + saturdayAverage);
        System.out.println();

        System.out.println("7 AM: " + sevenAmAverage);
        System.out.println("3 PM: " + threePmAverage);
        System.out.println("7 PM: " + sevenPmAverage);
        System.out.println("3 AM " + threeAmAverage);

        System.out.println("The final average temperature for the week was\n\n");

        System.out.println("Overall: " + totalAverage);

        }

    public static void display(int temps[][]) {
        for (int row = 0; row < temps.length; row++) {
            for (int column = 0; column < temps[row].length; column++) {
                System.out.print(temps[row][column] + " \t ");
            }
            System.out.println();
        }

    }

    public static int sum(int[][] values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                total += values[i][j];
            }
        }

        return total;

    }

}

