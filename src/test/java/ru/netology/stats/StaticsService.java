package ru.netology.stats;
    public class StaticsService {
        public long calculateSum(long[] purchases) {
            long sum = 0; // начинаем с нуля
            for (long purchase : purchases) {
                // аналог sum = sum + purchase;
                // каждый раз прибавляем к текущей сумме новый элемент
                sum += purchase;
            }
            return sum;
        }
        public long calculateAverageSum(long[] purchases) {
            long averageSum = 0; // начинаем с нуля
            for (long purchase : purchases) {
                // аналог sum = sum + purchase;
                // каждый раз прибавляем к текущей сумме новый элемент
                averageSum += purchase;
            }
            averageSum = averageSum / 12;
            return averageSum;
        }
        public long findMaxMonth(long[] purchases) {
            int i = 0; //счетчик
            int maxMonth = 0;
            long maxNumber = purchases[0]; // начинаем с нуля
            for (long purchase : purchases) {
                i = i + 1;
                // аналог sum = sum + purchase;
                // каждый раз прибавляем к текущей сумме новый элемент
                if(maxNumber <= purchase){
                    maxNumber = purchase;
                    maxMonth = i;
                }
            }
            return maxMonth;
        }
        public long findMinMonth(long[] purchases) {
            int i = 0; //счетчик
            int minMonth = 0;
            long minNumber = purchases[0]; // начинаем с нуля
            for (long purchase : purchases) {
                i = i + 1;
                // аналог sum = sum + purchase;
                // каждый раз прибавляем к текущей сумме новый элемент
                if(minNumber >= purchase){
                    minNumber = purchase;
                    minMonth = i;
                }
            }
            return minMonth;
        }
        public long findAmountMonthOverAverage(long[] purchases) {
            long averageSum = 0; // начинаем с нуля
            for (long purchase : purchases) {
                // аналог sum = sum + purchase;
                // каждый раз прибавляем к текущей сумме новый элемент
                averageSum += purchase;
            }
            averageSum = averageSum / 12;
            int i = 0; //счетчик
            for (long purchase1 : purchases) {
                // аналог sum = sum + purchase;
                // каждый раз прибавляем к текущей сумме новый элемент
                if(purchase1 > averageSum){
                    i = i + 1;
                }
            }
            return i;
        }
        public long findAmountMonthLowAverage(long[] purchases) {
            long averageSum = 0; // начинаем с нуля
            for (long purchase : purchases) {
                // аналог sum = sum + purchase;
                // каждый раз прибавляем к текущей сумме новый элемент
                averageSum += purchase;
            }
            averageSum = averageSum / 12;
            int i = 0; //счетчик
            for (long purchase1 : purchases) {
                // аналог sum = sum + purchase;
                // каждый раз прибавляем к текущей сумме новый элемент
                if(purchase1 < averageSum){
                    i = i + 1;
                }
            }
            return i;
        }
    }


