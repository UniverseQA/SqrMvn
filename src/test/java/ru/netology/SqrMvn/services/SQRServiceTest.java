package ru.netology.SqrMvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalcInHomeworkTask1() {
        SQRService service = new SQRService();

        int expected = 6;
        int actual = service.calcSumSqr(10, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcSumInHomeworkTask2() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSumSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcSumInHundreds() {
        SQRService service = new SQRService();

        int expected = 22;
        int actual = service.calcSumSqr(100, 999);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInThousands() {
        SQRService service = new SQRService();

        int expected = 968;
        int actual = service.calcSumSqr(1000, 999_999);

        Assertions.assertEquals(expected, actual);
    }
}

