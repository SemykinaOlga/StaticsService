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
//    @Test
//    void shouldfindMax() {
//        StaticsService service = new StaticsService();
//        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//        long expected = 20;
//        //вызываем целевой метод
//        long actual = service.findMaxSum(purchases);
//
//        //производим проверку (сравниваем ожидаемый и фактический)
//        assertEquals(expected, actual);
//    }
    @Test
    void shouldfindMax() {
        StaticsService service = new StaticsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;
        //вызываем целевой метод
        long actual = service.findMaxSum(purchases);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
    @Test
    void shouldfindMin() {
        StaticsService service = new StaticsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        //вызываем целевой метод
        long actual = service.findMinSum(purchases);

        //производим проверку (сравниваем ожидаемый и фактический)
        assertEquals(expected, actual);
    }
}