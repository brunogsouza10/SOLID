package vehicles;

public interface IVehicle {
// No caso de uma ISP(Interface segregation principle, essa interface pode ser mais enxuta, criando outras duas
// para car e motorcycle)
    //public void configureCar(String color, String year, double engine, int seats);
   // public void configureMotorcycle(String color, String year, double engine);
    public void startVehicle();

}
