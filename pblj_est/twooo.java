class Vehicle{
    int speed;
    String model;
    public Vehicle(int speed, String model){
        this.speed=speed;
        this.model=model;
    }
    public void info(){
        System.out.println("Speed: " + speed +" " +"Model: "+ model);
    }
}
class Car extends Vehicle{
    int speed;
    String model;

    public Car(int speed, String model) {
        super(speed, model);
    }


    public void info(){
        System.out.println(" Car Speed: " + speed +" " +" Car Model: "+ model );
    }
}


public class twooo {

    public static void main(String[] args){
        Vehicle c= new Car(42,"2018");
       c.info();


    }
}
