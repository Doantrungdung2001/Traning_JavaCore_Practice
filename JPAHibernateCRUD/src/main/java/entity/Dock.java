package entity;

import javax.persistence.*;

@Entity
public class Dock {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "numEmptyDockPoint")
    private int numEmptyDockPoint;
    @Basic
    @Column(name = "numAvailableBike")
    private int numAvailableBike;
    @Basic
    @Column(name = "area")
    private int area;
    @Basic
    @Column(name = "address")
    private String address;

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
