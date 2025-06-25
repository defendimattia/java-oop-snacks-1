package org.lessons.java.oop.snacks;

import java.math.BigDecimal;

public class ContoBancario {
    private String bankAccount;
    private BigDecimal balance;

    public ContoBancario(String bankAccount) {
        this.bankAccount = bankAccount;
        this.balance = BigDecimal.ZERO;
    }

}
