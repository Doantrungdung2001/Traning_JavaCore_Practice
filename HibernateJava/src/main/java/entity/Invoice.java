package entity;

public class Invoice {
    private String id;
    private String content;
    private int totalAmount;
    private String rentBikeId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getRentBikeId() {
        return rentBikeId;
    }

    public void setRentBikeId(String rentBikeId) {
        this.rentBikeId = rentBikeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Invoice invoice = (Invoice) o;

        if (totalAmount != invoice.totalAmount) return false;
        if (id != null ? !id.equals(invoice.id) : invoice.id != null) return false;
        if (content != null ? !content.equals(invoice.content) : invoice.content != null) return false;
        if (rentBikeId != null ? !rentBikeId.equals(invoice.rentBikeId) : invoice.rentBikeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + totalAmount;
        result = 31 * result + (rentBikeId != null ? rentBikeId.hashCode() : 0);
        return result;
    }
}
