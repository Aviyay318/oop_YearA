import java.io.StringReader;

public class Store {
//
//    כתבו את המחלקה Store המייצגת את החנות. במחלקה יהיו השדות
//    Order[] – רשימת ההזמנות שאמורות לצאת מהחנות.
//            CityDelivery[] – רשימת הערים והמרחקים שלהן מהחנות.

    private Order [] orders;
    private CityDelivery [] cityDeliveries;


//    הוסיפו אל המחלקה Store את המתודה
//    String mostExpensiveCityDelivery()
//    המתודה מחזירה את שמה של העיר שעלות המשלוח אליה היא היקרה ביותר.


    //פונקציה מחזירה את עלות המשלוח לעיר
    private double getDeliveryCostForCity(String cityName){
        double kilometer = 0;
        for (int i = 0; i < this.cityDeliveries.length; i++) {
            String nameOfCity = this.cityDeliveries[i].getCityName();
            if (nameOfCity.equals(cityName)){
                kilometer = this.cityDeliveries[i].getKilometer();
                break;
            }
        }
        double costOfGettingCity = kilometer * 4.5; //עלות ההגעה לעיר
        //כמות המשלוחים שיש לאותה העיר.
        int count = 0;
        for (int i = 0; i < this.orders.length; i++) {
            if (this.orders[i].getCityNameWithSplit().equals(cityName)){
                count++;
            }
        }
        return costOfGettingCity / count ;
    }

}
