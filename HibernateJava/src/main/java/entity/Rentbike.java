package entity;

import java.sql.Timestamp;
import java.util.Collection;

public class Rentbike {
    private String id;
    private String idBike;
    private int deposit;
    private Integer totalUpToNow;
    private Timestamp startAt;
    private Timestamp endAt;
    private Integer status;
    private String userId;
    private Collection<Invoice> invoicesById;
    private Bike bikeByIdBike;
    private User userByUserId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdBike() {
        return idBike;
    }

    public void setIdBike(String idBike) {
        this.idBike = idBike;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public Integer getTotalUpToNow() {
        return totalUpToNow;
    }

    public void setTotalUpToNow(Integer totalUpToNow) {
        this.totalUpToNow = totalUpToNow;
    }

    public Timestamp getStartAt() {
        return startAt;
    }

    public void setStartAt(Timestamp startAt) {
        this.startAt = startAt;
    }

    public Timestamp getEndAt() {
        return endAt;
    }

    public void setEndAt(Timestamp endAt) {
        this.endAt = endAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rentbike rentbike = (Rentbike) o;

        if (deposit != rentbike.deposit) return false;
        if (id != null ? !id.equals(rentbike.id) : rentbike.id != null) return false;
        if (idBike != null ? !idBike.equals(rentbike.idBike) : rentbike.idBike != null) return false;
        if (totalUpToNow != null ? !totalUpToNow.equals(rentbike.totalUpToNow) : rentbike.totalUpToNow != null)
            return false;
        if (startAt != null ? !startAt.equals(rentbike.startAt) : rentbike.startAt != null) return false;
        if (endAt != null ? !endAt.equals(rentbike.endAt) : rentbike.endAt != null) return false;
        if (status != null ? !status.equals(rentbike.status) : rentbike.status != null) return false;
        if (userId != null ? !userId.equals(rentbike.userId) : rentbike.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idBike != null ? idBike.hashCode() : 0);
        result = 31 * result + deposit;
        result = 31 * result + (totalUpToNow != null ? totalUpToNow.hashCode() : 0);
        result = 31 * result + (startAt != null ? startAt.hashCode() : 0);
        result = 31 * result + (endAt != null ? endAt.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }

    public Collection<Invoice> getInvoicesById() {
        return invoicesById;
    }

    public void setInvoicesById(Collection<Invoice> invoicesById) {
        this.invoicesById = invoicesById;
    }

    public Bike getBikeByIdBike() {
        return bikeByIdBike;
    }

    public void setBikeByIdBike(Bike bikeByIdBike) {
        this.bikeByIdBike = bikeByIdBike;
    }

    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }
}
