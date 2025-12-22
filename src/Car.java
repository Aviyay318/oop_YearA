public class Car {
private String company;
private int year;
private	int speed;

public Car(String company ,int year ,int speed){
    this.company = company;
    this.year = year;
    this.speed = speed;
}

//    פונקציות:
public void accelerate(){
    this.speed +=10;
}
//    מעלה מהירות ב־10
public void brake(){
    if (this.speed-10>=0){
        this.speed-=10;
    }else {
        this.speed = 0;
    }
}
//    מורידה מהירות ב־10 (לא מתחת ל־0)

public void printStatus(){
    System.out.println("Company : " + this.company + "Speed: "+ this.speed + "Year: " + this.year);

}
//    מדפיסה את פרטי הרכב

}
