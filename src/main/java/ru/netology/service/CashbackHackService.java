package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }

    public String checkingBuyAmount(int amount) {
        int remainder = remain(amount);
        String result = null;
        if (remainder == 1000){
        } else {
            result = ("Для начисления кэшбека не хватает " + remainder + " рублей");
        }
        return result;
    }
}
