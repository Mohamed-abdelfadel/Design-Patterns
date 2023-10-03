import builder.Builder;
import director.Director;
import entity.Car;
import entity.Motorcycle;
import product.Product;

public class Main {
    public static void main(String[] args) {
        //entity.Motorcycle
        Builder motorBuilder = new Motorcycle("honda");
        Director director1 = new Director();
        director1.construct(motorBuilder);
        Product motor = motorBuilder.getProduct();
        System.out.println(motor.show());

        //entity.Car
        Builder carBuilder = new Car("Audi");
        Director director2 = new Director();
        director2.construct(carBuilder);
        Product car = carBuilder.getProduct();
        System.out.println(car.show());
    }
}
