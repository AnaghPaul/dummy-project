import com.tw.models.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1,2);
        int area = rectangle.area();
        System.out.println(area);
    }
}