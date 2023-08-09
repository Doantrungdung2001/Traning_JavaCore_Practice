public class Electrical extends Category{

    public Electrical(String code, String name, int quantity, int price, int warranty_period, int capacity) {
        super(code, name, quantity, price);
        this.warranty_period = warranty_period;
        this.capacity = capacity;
    }

    private int warranty_period; // how many months warranty period

    private int capacity;// how much capacity KW

}
