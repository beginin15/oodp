package madvirus.oodp.chap02;

public class Customer {
    private Wallet wallet;
    public Wallet getWallet() {
        return wallet;
    }
    public int pay(int payment) {
        if (wallet == null) {
            throw new NotEnoughMoneyException();
        }
        if (wallet.haveEnoughMoney(payment)) {
            wallet.substractMoney(payment);
            return payment;
        }
        throw new NotEnoughMoneyException();
    }
}
