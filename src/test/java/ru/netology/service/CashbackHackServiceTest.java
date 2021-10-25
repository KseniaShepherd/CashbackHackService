package ru.netology.service;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldCheckRemainder() {
        int expected = 100;

        int actual = service.remain(900);
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldAdviseBuyWhenCheckingBuyAmount() {
        String expected = "Для начисления кэшбека не хватает 100 рублей";
        String actual = service.checkingBuyAmount(900);
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldcheckingBuyAmountWithoutAdviseBuy() {
        String expected = null;
        String actual = service.checkingBuyAmount(3000);
        assertEquals(actual, expected);
    }
}