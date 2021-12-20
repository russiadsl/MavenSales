package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        int[] yearSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calcSum(yearSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAvg() {
        StatsService service = new StatsService();
        int[] yearSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAvg(yearSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() {
        StatsService service = new StatsService();
        long[] yearSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findMaxMonth(yearSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] yearSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findMinMonth(yearSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindSumLessAvgMonth() {
        StatsService service = new StatsService();
        int[] yearSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findSumLessAvgMonths(yearSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindSumMoreAvgMonths() {
        StatsService service = new StatsService();
        int[] yearSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findSumMoreAvgMonths(yearSales);

        assertEquals(expected, actual);
    }
}

