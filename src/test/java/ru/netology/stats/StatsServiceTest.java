package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    // 1
    @Test
    public void shouldSumSales() {
        long [] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = new StatsService().sumSales(arr);
        int expected = 180;
        Assertions.assertEquals(actual, expected);
    }

    // 2
    @Test
    public void shouldMeanSales() {
        long [] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = new StatsService().meanSales(arr);
        int expected = 15;
        Assertions.assertEquals(actual, expected);
    }

    // 3
    @Test
    public void  shouldShowTheLastMonthWithTheHighestSales() {
        long [] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = new StatsService().maxSales(arr);
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    //4
    @Test
    public void  shouldShowTheLastMonthWithTheMinimaltSales() {
        long [] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = new StatsService().minSales(arr);
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    //5
    @Test
    public void  shouldShowTheNumberOfMonthsWithBelowAverageSales() {
        long [] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = new StatsService().belowAverageSales(arr);
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    //6
    @Test
    public void  shouldShowTheNumberOfMonthsWithAboveAverageSales() {
        long [] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = new StatsService().aboveAverageSales(arr);
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }
}
