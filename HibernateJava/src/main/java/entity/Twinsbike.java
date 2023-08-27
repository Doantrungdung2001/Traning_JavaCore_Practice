package entity;

public class Twinsbike {
    private String id;
    private Integer seatNumber;
    private Bike bikeById;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Twinsbike twinsbike = (Twinsbike) o;

        if (id != null ? !id.equals(twinsbike.id) : twinsbike.id != null) return false;
        if (seatNumber != null ? !seatNumber.equals(twinsbike.seatNumber) : twinsbike.seatNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (seatNumber != null ? seatNumber.hashCode() : 0);
        return result;
    }

    public Bike getBikeById() {
        return bikeById;
    }

    public void setBikeById(Bike bikeById) {
        this.bikeById = bikeById;
    }
}
