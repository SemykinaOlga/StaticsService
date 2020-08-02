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

        public long findMaxSum(long[] purchases) {
            long currentMax = purchases[0]; // начинаем с нуля
            for (long purchase : purchases) {
                // аналог sum = sum + purchase;
                // каждый раз прибавляем к текущей сумме новый элемент
                if(currentMax < purchase){
                    currentMax = purchase;
                }
            }
            return currentMax;
        }
        public long findMinSum(long[] purchases) {
            long currentMin = purchases[0]; // начинаем с нуля
            for (long purchase : purchases) {
                // аналог sum = sum + purchase;
                // каждый раз прибавляем к текущей сумме новый элемент
                if(currentMin > purchase){
                    currentMin = purchase;
                }
            }
            return currentMin;
        }
    }


