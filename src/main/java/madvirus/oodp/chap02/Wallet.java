package madvirus.oodp.chap02;

public class Wallet {
    private int money;

    public boolean haveEnoughMoney(int payment) {
        return money >= payment;
    }
    public void substractMoney(int debit) {
        money -= debit;
    }
}
