package org.lessons.java.oop.snacks;

import java.math.BigDecimal;

public class ContoBancario {
    private String bankAccount;
    private BigDecimal balance;

    public ContoBancario(String bankAccount) {
        this.bankAccount = bankAccount;
        this.balance = BigDecimal.ZERO;
    }

    public void setWithdrawMoney(BigDecimal money) {
        if (money != null && money.compareTo(BigDecimal.ZERO) > 0 && this.balance.compareTo(money) >= 0) {
            this.balance = this.balance.subtract(money);
        }
    }

    public void setDepositMoney(BigDecimal money) {
        if (money != null && money.compareTo(BigDecimal.ZERO) > 0) {
            this.balance = this.balance.add(money);
        }
    }
}
