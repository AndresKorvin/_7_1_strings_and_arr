package ru.netology.stats;

public class StatsService {

    //1. Сумму всех продаж.
    public int sumSales(long[] sales) {
        int sumAllMonth = 0;
        for (long sale : sales) {
            sumAllMonth += sale;
        }
        return sumAllMonth;
    }

    //2. Среднюю сумму продаж в месяц.
    public int meanSales(long[] sales) {
        int sumAllMonth = sumSales(sales);
        return sumAllMonth / 12;
    }

    //3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
    public int maxSales(long[] sales) {
        int indexMaxMonth = 0;
        int indexMonth = 0;
        for (long sale : sales) {
            if (sale >= sales[indexMaxMonth]) {
                indexMaxMonth = indexMonth;
            }
            indexMonth++;
        }
        return indexMaxMonth + 1;
    }

    //4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*.
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

//5.Количество месяцев, в которых продажи были ниже среднего (см. п.2).
    public int belowAverageSales(long [] sales) {
        int meanSum = meanSales(sales);
        int countMonth = 0;
        for (long sale:
             sales) {
            if (sale < meanSum) countMonth++;
        }
        return countMonth;
    }

    //6.Количество месяцев, в которых продажи были выше среднего (см. п.2).
    public int aboveAverageSales(long [] sales) {
        int meanSum = meanSales(sales);
        int countMonth = 0;
        for (long sale :
                sales) {
            if (sale > meanSum) countMonth++;
        }
        return countMonth;
    }
}