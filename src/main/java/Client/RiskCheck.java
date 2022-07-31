package Client;

import Client.Enums.RiskCheckEnum;

public class RiskCheck {
    private Long transactionId;
    private RiskCheckEnum status;

    public RiskCheck(Long transactionId, RiskCheckEnum status) {
        this.transactionId = transactionId;
        this.status = status;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public RiskCheck setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public RiskCheckEnum getStatus() {
        return status;
    }

    public RiskCheck setStatus(RiskCheckEnum status) {
        this.status = status;
        return this;
    }
}
