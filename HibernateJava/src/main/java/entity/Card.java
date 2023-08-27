package entity;

import java.sql.Timestamp;

public class Card {
    private String cardCode;
    private String name;
    private String cvvCode;
    private Timestamp expiration;

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCvvCode() {
        return cvvCode;
    }

    public void setCvvCode(String cvvCode) {
        this.cvvCode = cvvCode;
    }

    public Timestamp getExpiration() {
        return expiration;
    }

    public void setExpiration(Timestamp expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (cardCode != null ? !cardCode.equals(card.cardCode) : card.cardCode != null) return false;
        if (name != null ? !name.equals(card.name) : card.name != null) return false;
        if (cvvCode != null ? !cvvCode.equals(card.cvvCode) : card.cvvCode != null) return false;
        if (expiration != null ? !expiration.equals(card.expiration) : card.expiration != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cardCode != null ? cardCode.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (cvvCode != null ? cvvCode.hashCode() : 0);
        result = 31 * result + (expiration != null ? expiration.hashCode() : 0);
        return result;
    }
}
