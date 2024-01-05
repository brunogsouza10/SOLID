package dip.model;

public class OracleDBProduct implements IdbProduct {

    public String getProductById(String productID) {

        return "Oracle : Exibindo dados do Produto " + productID;
    }
}
