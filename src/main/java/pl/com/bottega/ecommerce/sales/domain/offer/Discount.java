package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Objects;

public class Discount {
    private String cause;
    private Money amount;

    public Discount(String cause, Money amount) {
        this.cause = cause;
        this.amount = amount;
    }

    public String getCause() {
        return cause;
    }

    public Money getAmount() {
        return amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cause, amount);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Discount other = (Discount) obj;
        return Objects.equals(cause, other.cause)
               && Objects.equals(amount, other.amount);
    }
}
