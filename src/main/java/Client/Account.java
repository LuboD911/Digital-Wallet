package Client;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Account {

    private Long id;
    private String currency;
    private BigDecimal amount;
    private LocalDateTime lastTimeUpdated;

    public Account(Long id, String currency, BigDecimal amount) {
        this.id = id;
        this.currency = currency;
        this.amount = amount;
        this.lastTimeUpdated = LocalDateTime.now();
    }


    public String getCurrency() {
        return currency;
    }

    public Account setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Account setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public LocalDateTime getLastTimeUpdated() {
        return lastTimeUpdated;
    }

    public Account setLastTimeUpdated(LocalDateTime lastTimeUpdated) {
        this.lastTimeUpdated = lastTimeUpdated;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Account setId(Long id) {
        this.id = id;
        return this;
    }
}
