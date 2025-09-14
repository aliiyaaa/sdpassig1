import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        CarDirector director = new CarDirector();
        Car myCar = director.constructor(builder);
        Car sportCar = director.SportConstructor(builder);
        System.out.println("My car " + myCar );
        System.out.println("My sport car " + sportCar );

    }
}
