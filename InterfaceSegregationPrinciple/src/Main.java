import vehicles.Car;
import vehicles.Motorcycle;

public class Main {

    private static String type;
    public static void main(String[] args) {

        type = "Car";
        if (type == "Car"){
            Car car = new Car("azul" , "2024", 2.6, 5);
        } else{
                Motorcycle motorcycle = new Motorcycle("preta", "2023", 150 );
            }
        }

    }
