package Client;

import Client.Enums.TransactionEnum;

import java.math.BigDecimal;

public class Transaction {

    private Long id;
    private BigDecimal amount;
    private String currency;
    private String direction;
    private TransactionEnum status;
    private String comment;
    private Customer customer;
    private Account account;

    public Transaction(Long id, BigDecimal amount, String currency, String direction,
                       TransactionEnum status, String comment, Customer customer,
                       Account account) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
        this.direction = direction;
        this.status = status;
        this.comment = comment;
        this.customer = customer;
        this.account = account;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public Transaction setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public Transaction setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public Transaction setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public TransactionEnum getStatus() {
        return status;
    }

    public Transaction setStatus(TransactionEnum status) {
        this.status = status;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Transaction setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Transaction setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public Account getAccount() {
        return account;
    }

    public Transaction setAccount(Account account) {
        this.account = account;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Transaction setId(Long id) {
        this.id = id;
        return this;
    }


}
