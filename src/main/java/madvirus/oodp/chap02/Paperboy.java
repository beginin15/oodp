package madvirus.oodp.chap02;

import java.util.List;

public class Paperboy {
    public List<Customer> customers;

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void collectMoney() {
        for (Customer customer : customers) {
            int payment = 10000;
            try {
                int paidAmount = customer.pay(payment);
            } catch (NotEnoughMoneyException e) {
                // 다음에 요금 받으러 오는 처리
            }
        }
    }
}
