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



//פונקציית עזר שתקבל שם של עיר ותחזיר את הקילומטר - המחק מהחנות
  //עלות ההגעה לעיר
    private double getCityDeliveryCost(String cityName){
    double kilometer = 0;
        for (int i = 0; i < this.cityDeliveries.length; i++) {
            CityDelivery cityDelivery = this.cityDeliveries[i];
            if (cityDelivery.getCityName().equals(cityName)){
                kilometer = cityDelivery.getKilometer();
                break;
            }
        }
        return kilometer * 4.5;
    }

    private double deliveryCost(String cityName){
       double cityDeliveryCost = getCityDeliveryCost(cityName);
       double countOfCityDelivery = getCountOfCityName(cityName);

       return cityDeliveryCost / countOfCityDelivery;
    }

   public String[] clientsWithExpensiveDeliveryWithSplit(int price){
    String [] names;
    String initialsNames = "";
       for (int i = 0; i < this.orders.length; i++) {
           Order order = this.orders[i];
           double deliveryCost = deliveryCost(order.getCityNameWithSplit());
           if (deliveryCost > price){
               initialsNames += initialsName(order.getFullName()) + "$";
           }
       }
       names = initialsNames.split("$");
       return names;
    }

    private String initialsName(String fullName){
     String initials = "";
     String [] splitName = fullName.split(" ");
        for (int i = 0; i < splitName.length; i++) {
            char firstLetter = splitName[i].charAt(0);
            initials+=firstLetter;
        }
        return initials.toUpperCase();
    }


    public String[] clientsWithExpensiveDelivery(int price){
        String [] names;
        int count = 0;
        for (int i = 0; i < this.orders.length; i++) {
            Order order = this.orders[i];
            double deliveryCost = deliveryCost(order.getCityNameWithSplit());
            if (deliveryCost > price){
               count++;
            }
        }
       names = new String[count];
        int index = 0;

        for (int i = 0; i < this.orders.length; i++) {
            Order order = this.orders[i];
            double deliveryCost = deliveryCost(order.getCityNameWithSplit());
            if (deliveryCost > price){
              names[index] = initialsName(order.getFullName());
              index++;
            }
        }
        return names;
    }
}
