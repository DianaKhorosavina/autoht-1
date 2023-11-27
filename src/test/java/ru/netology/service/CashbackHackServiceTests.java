package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTests {

    @Test
    public void purchaseWithMaxPriceTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void purchaseWithMaxPriceOnBorderTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void zeroPurchasePriceTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void purchaseWithLowPriceOnBorderTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

}
