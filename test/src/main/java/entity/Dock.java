package entity;

public class Dock {

    public Dock(int id, String name, int numEmptyDockPoint, int numAvailableBike, int area, String address) {
        this.id = id;
        this.name = name;
        this.numEmptyDockPoint = numEmptyDockPoint;
        this.numAvailableBike = numAvailableBike;
        this.area = area;
        this.address = address;
    }

    private int id;
    private String name;
    private int numEmptyDockPoint;
    private int numAvailableBike;
    private int area;
    private String address;

    public Dock() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

        if (id != dock.id) return false;
        if (numEmptyDockPoint != dock.numEmptyDockPoint) return false;
        if (numAvailableBike != dock.numAvailableBike) return false;
        if (area != dock.area) return false;
        if (name != null ? !name.equals(dock.name) : dock.name != null) return false;
        if (address != null ? !address.equals(dock.address) : dock.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + numEmptyDockPoint;
        result = 31 * result + numAvailableBike;
        result = 31 * result + area;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dock{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numEmptyDockPoint=" + numEmptyDockPoint +
                ", numAvailableBike=" + numAvailableBike +
                ", area=" + area +
                ", address='" + address + '\'' +
                '}';
    }
}
