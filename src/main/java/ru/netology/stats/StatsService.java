package ru.netology.stats;

public class StatsService {
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAvg(int[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int findMaxMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMinMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int findSumLessAvgMonths(int[] sales) {
        int avg = findAvg(sales);
        int sumLessAvgMonth = 0;
        for (long sale : sales) {
            if (sale < avg) {
                sumLessAvgMonth++;
            }
        }
        return sumLessAvgMonth;
    }

    public int findSumMoreAvgMonths(int[] sales) {
        int avg = findAvg(sales);
        int sumMoreAvgMonth = 0;
        for (long sale : sales) {
            if (sale > avg) {
                sumMoreAvgMonth++;
            }
        }
        return sumMoreAvgMonth;
    }
}
