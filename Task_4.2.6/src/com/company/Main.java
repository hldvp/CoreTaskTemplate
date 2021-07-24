package com.company;

public class Main {

    public static void main(String[] args) {

    }
    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (ProblemWithLawException e) {
            return false;
        }
         catch (BadCreditHistoryException e) {
             System.out.println("Проблемы с банковской историей");
             return false;
        }
    }
}
