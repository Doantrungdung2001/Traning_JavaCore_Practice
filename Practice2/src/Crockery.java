import com.sun.jdi.Value;

import java.security.Key;
import java.time.LocalDate;
import java.util.Map;

public class Crockery extends  Category{
    public Crockery(String code, String name, int quantity, int price, Map<Key, Value> manufacturer, LocalDate date_arrival) {
        super(code, name, quantity, price);
        this.manufacturer = manufacturer;
        this.date_arrival = date_arrival;
    }

    private Map<Key, Value> manufacturer;
    private LocalDate date_arrival;
}
