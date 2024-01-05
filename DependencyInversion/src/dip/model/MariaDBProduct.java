package dip.model;

public class MariaDBProduct implements IdbProduct {

    public String getProductById(String productID){
        return "MariaDB : Exibindo dados do Produto " + productID;
    }
}
