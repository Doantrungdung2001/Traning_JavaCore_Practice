package entity;

public class Bike {
    public Bike(String id, String idDock, String licensePlate, String barcode, Integer status, Integer type, Integer value) {
        this.id = id;
        this.idDock = idDock;
        this.licensePlate = licensePlate;
        this.barcode = barcode;
        this.status = status;
        this.type = type;
        this.value = value;
    }

    private String id;
    private String idDock;
    private String licensePlate;
    private String barcode;
    private Integer status;
    private Integer type;
    private Integer value;

    public Bike() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdDock() {
        return idDock;
    }

    public void setIdDock(String idDock) {
        this.idDock = idDock;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bike bike = (Bike) o;

        if (id != null ? !id.equals(bike.id) : bike.id != null) return false;
        if (idDock != null ? !idDock.equals(bike.idDock) : bike.idDock != null) return false;
        if (licensePlate != null ? !licensePlate.equals(bike.licensePlate) : bike.licensePlate != null) return false;
        if (barcode != null ? !barcode.equals(bike.barcode) : bike.barcode != null) return false;
        if (status != null ? !status.equals(bike.status) : bike.status != null) return false;
        if (type != null ? !type.equals(bike.type) : bike.type != null) return false;
        if (value != null ? !value.equals(bike.value) : bike.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idDock != null ? idDock.hashCode() : 0);
        result = 31 * result + (licensePlate != null ? licensePlate.hashCode() : 0);
        result = 31 * result + (barcode != null ? barcode.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id='" + id + '\'' +
                ", idDock='" + idDock + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", barcode='" + barcode + '\'' +
                ", status=" + status +
                ", type=" + type +
                ", value=" + value +
                '}';
    }
}
