public class Order {
 private double price;
 private String address;
 private String fullName;
 private int orderTime;
 private int deliveryTime;


//    הרצל 2, אשקלון
//    הוסיפו אל המחלקה Order מתודה בשם String getCityName()
//    , המחלצת את שם העיר מתוך הכתובת ומחזירה אותו.

public String getCityNameWithSplit(){
    String [] splitAddress = this.address.split(", ");
    return splitAddress[splitAddress.length-1];
}

    public String getCityNameWithIndexOfAndSubString(){
    String cityName="";
        int index = this.address.indexOf(",");
        if (index>-1){
            cityName = this.address.substring(index+2);
        }
        return cityName;
    }

    public String getFullName(){
    return this.fullName;
    }

}
