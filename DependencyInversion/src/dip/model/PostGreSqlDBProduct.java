package dip.model;

public class PostGreSqlDBProduct implements IdbProduct {

    public String getProductById(String productID) {

        return "PostGreSqlDb : Exibindo dados do Produto " + productID;
    }
}
