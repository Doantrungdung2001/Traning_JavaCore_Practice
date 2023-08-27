package entity;

public class Standardbike {
    private String id;
    private Bike bikeById;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Standardbike that = (Standardbike) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public Bike getBikeById() {
        return bikeById;
    }

    public void setBikeById(Bike bikeById) {
        this.bikeById = bikeById;
    }
}
