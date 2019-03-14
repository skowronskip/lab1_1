package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;
import java.util.Objects;

public class Product {
    private String id;

    private Money price;

    private String name;

    private Date snapshotDate;

    private String type;

    public Product(String id, Money price, String name, Date snapshotDate, String type) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.snapshotDate = snapshotDate;
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, snapshotDate, type);
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
        Product other = (Product) obj;
        return Objects.equals(id, other.id)
               && Objects.equals(name, other.name)
               && Objects.equals(price, other.price)
               && Objects.equals(snapshotDate, other.snapshotDate)
               && Objects.equals(type, other.type);
    }

    public String getId() {
        return id;
    }

    public Money getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }

    public String getType() {
        return type;
    }
}


