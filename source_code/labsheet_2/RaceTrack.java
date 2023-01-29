package source_code.labsheet_2;

public class RaceTrack {
    public static void main(String[] args) {
        Car car = new Car(2022, "TATA", 25.0);
        System.out.println("Car: [ year: " + car.getYear() + ", make: " + car.getMake() + ", speed: " + car.getSpeed() + "]");

        car.accelerate();
        System.out.println("New car speed:" + car.getSpeed());

        car.accelerate(10);
        System.out.println("New car speed:" + car.getSpeed());

        car.decelerate(16);
        System.out.println("New car speed:" + car.getSpeed());

//        Car car2 =  new Car();        We don't have zero argument constructor
    }
}
