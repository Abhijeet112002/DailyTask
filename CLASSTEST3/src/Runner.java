import com.tutordude.classTest.Car;

public class Runner {



    public static void main(String[] args) {

        Car car = new Car("swfit",4,"difugewi",234433);

        car.name = "swift";
        car.model = "jhdwj";
        car.price = 2132;
        car.noOfWheels = 4;

        car.moving();
        car.brake();

        System.out.println(car.name + " " + car.price + " " + car.model +" "+ car.noOfWheels);
        System.out.println(car.model);
        System.out.println(car.price);
        System.out.println(car.noOfWheels);

        // constructor

        new Car("swfit",4,"difugewi",234433);
    }
}
