package dip.factory;

import dip.model.*;

// Modelo de alto nível
// Direcionado à abstração
public class DbProductFactory {

    public static Object create(Db type) {
        if (type == Db.MYSQL) {
            return new MySqlProduct();
        } else if (type == Db.ORACLE) {
            return new OracleDBProduct();
        } else if (type == Db.MONGODB) {
            return new MongoDBProduct();
        } else if (type == Db.POSTGRESQL) {
            return new PostGreSqlDBProduct();
        } else if (type == Db.MARIA) {
            return new MariaDBProduct();
        } else {
            throw new IllegalArgumentException("Tipo de banco de dados desconhecido: " + type);
        }
    }
}

