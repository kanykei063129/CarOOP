import jdk.internal.icu.impl.UBiDiProps;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(CarModel.M5, LocalDate.of(2020, 3, 6), 180000, BodyType.CROSSOVER);
        Car car1 = new Car(CarModel.SERIES_1, LocalDate.of(2010, 3, 19), 220000, BodyType.SUV);
        Car car2 = new Car(CarModel.SERIES_5, LocalDate.of(2001, 6, 31), 130000, BodyType.HATCHBACK);
        Car car3 = new Car(CarModel.M3, LocalDate.of(1998, 5, 28), 100000, BodyType.SEDAN);
        Car car4 = new Car(CarModel.UNKNOWN, LocalDate.of(2022, 12, 9), 250000, BodyType.UNIVERSAL);
        Car[] cars = {car, car1, car2, car3, car4};
        determinationoYearOfManufacture(cars);
            }

        public static void determinationoYearOfManufacture(Car[]cars){
            for (Car ca:cars) {
                System.out.println(ca.getCarModel()+" " +Period.between(ca.getLocalDate(),LocalDate.now()).getYears());
            }
        }
}
