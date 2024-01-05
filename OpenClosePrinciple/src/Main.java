import Vehicles.Car;
import Vehicles.Motorcycle;
import solid.ocp.TypeVehicle;

public class Main {

    private static TypeVehicle typeVehicle;
    public static void main(String[] args) {
        typeVehicle = TypeVehicle.MOTORCYCLE;

        if (typeVehicle == TypeVehicle.CAR) {
            Car car = new Car("Preto", "2020", 2.0, 5);
        }

                    else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
            Motorcycle motorcycle = new Motorcycle("Prata", "2023", 150.0);

            }
        }

    }
