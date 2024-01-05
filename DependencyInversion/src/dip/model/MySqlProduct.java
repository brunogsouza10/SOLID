package dip.model;

public class MySqlProduct implements IdbProduct{

    public String getProductById(String productID){
        return "MySql : Exibindo dados do Produto " + productID;
    }
}
