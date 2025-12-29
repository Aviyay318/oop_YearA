import java.io.StringReader;

public class Store {

    private Order [] orders;
    private CityDelivery [] cityDeliveries;


//    הוסיפו אל המחלקה Store את המתודה
//    String mostExpensiveCityDelivery()
//    המתודה מחזירה את שמה של העיר שעלות המשלוח אליה היא היקרה ביותר.


    //1)  למצוא את עלות ההגעה לעיר
    //2) כמות המשלוחים לאותה עיר -> פונקציית עזר


public String mostExpensiveCityDelivery(){
    double max = 0;
    String mostExpensiveCityDelivery = "";
    for (int i = 0; i < this.cityDeliveries.length; i++) {

        CityDelivery cityDelivery = this.cityDeliveries[i];

        double kilometer = cityDelivery.getKilometer() * 4.5; // עלות ההגעה לעיר
        double countOfCityName = getCountOfCityName(cityDelivery.getCityName());
        double deliveryCost = kilometer / countOfCityName;
        if (deliveryCost > max){
            max = deliveryCost;
            mostExpensiveCityDelivery = cityDelivery.getCityName();
        }
    }
    return mostExpensiveCityDelivery;
}

    //2) כמות המשלוחים לאותה עיר -> פונקציית עזר
public int getCountOfCityName(String cityName){
    int count = 0;
    for (int i = 0; i < this.orders.length; i++) {
        Order order = this.orders[i];
        if (cityName.equals(order.getCityNameWithSplit())){
            count++;
        }
    }
  return count;
}


}
