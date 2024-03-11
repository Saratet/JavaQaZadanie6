package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public int sumOfSales(long[] sales) {
        int sum = 0;
        for (long value : sales) {
            sum += value;
        }
        return sum;
    }

    public int averageOfSales(long[] sales) {
        int sum = sumOfSales(sales);
        int average = sum / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numberOfSalesLessThanAverage(long[] sales) {
        int salesLess = 0;
        int average = averageOfSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                salesLess++;
            }
        }
        return salesLess;
    }

    public int numberOfSalesMoreThanAverage(long[] sales) {
        int salesLess = 0;
        int average = averageOfSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                salesLess++;
            }
        }
        return salesLess;
    }
}

