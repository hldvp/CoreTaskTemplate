package com.company;

public class BankWorkerClass implements BankWorker {


    @Override
    public boolean checkClientForCredit(BankClient bankClient) {
        if (bankClient.getS().isEmpty()) return false;
        return true;
    }
}
