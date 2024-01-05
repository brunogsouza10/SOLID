package dip.model;

public class MongoDBProduct implements IdbProduct{

    public String getProductById(String productID){
        return "MongoDB : Exibindo dados do Produto " + productID;
    }
}
