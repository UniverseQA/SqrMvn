package ru.netology.SqrMvn.services;

public class SQRService {
    int i;
    int result;

    public int calcSumSqr(int a, int b) {
        for (i = 1; i * i <= b; i++) {
            if (i * i >= a) {
                result += i / i;
            }
        }
        return result;
    }
}