import java.time.LocalDate;

public class Food extends Category {

    public Food(String code, String name, int quantity, int price, LocalDate manufacture_date, LocalDate expiration_date, String supplier) {
        super(code, name, quantity, price);
        this.manufacture_date = manufacture_date;
        this.expiration_date = expiration_date;
        this.Supplier = supplier;
    }
    private LocalDate  manufacture_date;
    private  LocalDate expiration_date;
    private String Supplier;


}
