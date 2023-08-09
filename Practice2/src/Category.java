public abstract class Category {
    public Category(String code, String name, int quantity, int price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;

    }
    public String code;
    public String name;
    public int quantity;
    public int price;
}
