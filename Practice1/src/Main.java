public class Main {
    public static void main(String[] args) {

        Rectangle shap_rectangle = new Rectangle(1.5,5.7);
        System.out.println("Perimeter of Rectangle : "+shap_rectangle.getArea());
        System.out.println("Perimeter of Rectangle : "+shap_rectangle.getPerimeter());

        Circle shap_circle = new Circle(6);
        System.out.println("Perimeter of Circle : "+shap_circle.getArea());
        System.out.println("Perimeter of Circle : "+shap_circle.getPerimeter());

    }
}