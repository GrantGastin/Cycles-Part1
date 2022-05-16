package ru.netology.srq;

public class SQRService {
    public int rangeNumbers(int lowerRange, int upperRange) {

        int count = 0;
        for (int i = 10; i <= 99; i++) { /* Перебирает числа от 10 до 99  где int i = 10; это начальное значение переменной
                                                                              i<=99; условие,  при котором будет выполняться цикл
                                                                              i++ - шаг с которым будет выполняться цикл.*/
            if (i * i >= lowerRange && i * i <= upperRange) {
                count = count + 1;

            }
        }
        System.out.println("Расчет окончен");
        return count;
    }
}