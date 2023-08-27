package entity;

import java.util.Collection;

public class Dock {
    public Dock(String id, String name, int numEmptyDockPoint, int numAvailableBike, int area, String address, Collection<Bike> bikesById) {
        this.id = id;
        this.name = name;
        this.numEmptyDockPoint = numEmptyDockPoint;
        this.numAvailableBike = numAvailableBike;
        this.area = area;
        this.address = address;
        this.bikesById = bikesById;
    }

    private String id;
    private String name;
    private int numEmptyDockPoint;
    private int numAvailableBike;
    private int area;
    private String address;
    private Collection<Bike> bikesById;

    public Dock() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumEmptyDockPoint() {
        return numEmptyDockPoint;
    }

    public void setNumEmptyDockPoint(int numEmptyDockPoint) {
        this.numEmptyDockPoint = numEmptyDockPoint;
    }

    public int getNumAvailableBike() {
        return numAvailableBike;
    }

    public void setNumAvailableBike(int numAvailableBike) {
        this.numAvailableBike = numAvailableBike;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dock dock = (Dock) o;

        if (numEmptyDockPoint != dock.numEmptyDockPoint) return false;
        if (numAvailableBike != dock.numAvailableBike) return false;
        if (area != dock.area) return false;
        if (id != null ? !id.equals(dock.id) : dock.id != null) return false;
        if (name != null ? !name.equals(dock.name) : dock.name != null) return false;
        if (address != null ? !address.equals(dock.address) : dock.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + numEmptyDockPoint;
        result = 31 * result + numAvailableBike;
        result = 31 * result + area;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    public Collection<Bike> getBikesById() {
        return bikesById;
    }

    public void setBikesById(Collection<Bike> bikesById) {
        this.bikesById = bikesById;
    }

    @Override
    public String toString() {
        return "Dock{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", numEmptyDockPoint=" + numEmptyDockPoint +
                ", numAvailableBike=" + numAvailableBike +
                ", area=" + area +
                ", address='" + address + '\'' +
                ", bikesById=" + bikesById +
                '}';
    }
}
