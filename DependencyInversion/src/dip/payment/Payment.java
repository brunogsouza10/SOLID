package dip.payment;

import dip.factory.DbProductFactory;
import dip.model.Db;
import dip.model.IdbProduct;
import dip.model.MySqlProduct;

public class Payment {

    public void pay (String productID){
       // MySqlProduct dbProduct = new MySqlProduct();
        IdbProduct dbProduct = (IdbProduct) DbProductFactory.create(Db.POSTGRESQL);

        String product = dbProduct.getProductById(productID);
        System.out.println(product);

    }
}
