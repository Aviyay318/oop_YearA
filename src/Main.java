import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);
        Date date2 = new Date();
        System.out.println(date1.getTime()-date2.getTime());

        CityDelivery cityDelivery = new CityDelivery("as",50);
    }
}