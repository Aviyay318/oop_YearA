public class Student {
    private String name;
    private int age;
    private double average;


    public Student(String name,int age , double average){
        this.age = age;
        this.name = name;
        this.average =average;
    }

   public void printDetails(){
       System.out.println("name: "+ this.name + " age: " + this.age + " average : " + this.average);
   }
    public boolean isExcellent(){
       boolean isExcellent = false;
       if (this.average >= 90){
           isExcellent = true;
       }
       return isExcellent;
    }
    public void birthday(){
       this.age++;
    }
}
