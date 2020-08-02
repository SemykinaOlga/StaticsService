package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticsServiceTest {

    @Test
    void shouldcalculateAverageSum() {
        StaticsService service = new StaticsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        //вызываем целевой метод
        long actual = service.calculateAverageSum(purchases);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
    @Test
    void shouldcalculateSum() {
        StaticsService service = new StaticsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        //вызываем целевой метод
        long actual = service.calculateSum(purchases);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }

    @Test
    void shouldfindMaxMonth() {
        StaticsService service = new StaticsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        //вызываем целевой метод
        long actual = service.findMaxMonth(purchases);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
    @Test
    void shouldfindMinMonth() {
        StaticsService service = new StaticsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        //вызываем целевой метод
        long actual = service.findMinMonth(purchases);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
    @Test
    void findAmountMonthOverAverage() {
        StaticsService service = new StaticsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        //вызываем целевой метод
        long actual = service.findAmountMonthOverAverage(purchases);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
    @Test
    void findAmountMonthLowAverage() {
        StaticsService service = new StaticsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        //вызываем целевой метод
        long actual = service.findAmountMonthLowAverage(purchases);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
}