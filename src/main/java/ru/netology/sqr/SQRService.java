package ru.netology.sqr;

public class SQRService {

    public int numberOfSquares(int minLimit, int maxLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minLimit && i * i <= maxLimit) {
                counter++;
            }
        }
        return counter;
    }
}