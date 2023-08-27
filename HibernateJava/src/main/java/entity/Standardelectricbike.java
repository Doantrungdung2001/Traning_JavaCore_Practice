package entity;

public class Standardelectricbike {
    private String id;
    private Integer bateryPercent;
    private Bike bikeById;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getBateryPercent() {
        return bateryPercent;
    }

    public void setBateryPercent(Integer bateryPercent) {
        this.bateryPercent = bateryPercent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Standardelectricbike that = (Standardelectricbike) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bateryPercent != null ? !bateryPercent.equals(that.bateryPercent) : that.bateryPercent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bateryPercent != null ? bateryPercent.hashCode() : 0);
        return result;
    }

    public Bike getBikeById() {
        return bikeById;
    }

    public void setBikeById(Bike bikeById) {
        this.bikeById = bikeById;
    }
}
