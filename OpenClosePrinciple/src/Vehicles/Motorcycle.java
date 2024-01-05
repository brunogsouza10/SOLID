package Vehicles;
//OCP - HERANÇA
/*public class Motorcycle extends Vehicles {

    public Motorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;

        configureMotorcycle();
    }
        public void configureMotorcycle(){
            System.out.println("Criando uma moto: " + color + ", "+ year + " , " + engine + " cilindradas " );
            startVehicle();
        }

    }*/
//OCP - INTERFACE
public class Motorcycle implements IIVehicleMotorcycle{
    private String color;
    private String year;
    private double engine;

    public Motorcycle(String color, String year, double engine){
        configureVehicle(color, year, engine);
    }

    @Override
    public void configureVehicle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;

        System.out.println("Criando uma moto com interface " + color + " , " + year + " , " + engine);

        startVehicle();
    }

    @Override
    public void startVehicle() {

        System.out.println("Ligando os motores com interface...");
    }
}
