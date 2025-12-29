public class CityDelivery {
    private String cityName;
    private double kilometer;

    public CityDelivery(String cityName ,double kilometer){
        this.cityName = cityName;
        this.kilometer = kilometer;
    }

public String getCityName(){
        return this.cityName;
}


public double getKilometer(){
        return this.kilometer;
}
}
