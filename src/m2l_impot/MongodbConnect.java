/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2l_impot;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bson.BSONObject;
import org.bson.types.ObjectId;

/**
 *
 * @author hp
 */
public class MongodbConnect {

    private final DB db;

    public MongodbConnect() throws UnknownHostException {
        // Connexion avec le serveur MongoDB tournant en local
        MongoClient mongoClient = new MongoClient("localhost");
        // Recupère la base de donnée "impot"
        db = mongoClient.getDB("impot");
    }

    public DB getDatabase() {
        return this.db;
    }

    public void addImpotToDb(Impot impot) {
        // Créé un objet à rentrer dans la base de donnée
        BasicDBObject doc = new BasicDBObject().append("impot", impot.getImpot()).append("date", new Date());
        this.db.getCollection("tableImpots").insert(doc);
    }

    public void removeImpotFromDb(ObjectId id) {
        System.out.println(id);
        // Créé un objet ayant comme identifiant "id"
        BasicDBObject doc = new BasicDBObject("_id", id);
        // Cherche dans la base de donnée un objet ayant le même id et le supprime
        this.db.getCollection("tableImpots").remove(doc);
    }

    public List<Impot> getImpots() {
        DBCursor cursor = this.db.getCollection("tableImpots").find();

        List<Impot> list = new ArrayList<>();
        try {
            while (cursor.hasNext()) {
                Impot impot = new Impot();
                DBObject object = cursor.next();

                impot.setDate((Date) object.get("date"));
                impot.setId((ObjectId) object.get("_id"));
                impot.setImpot((double) object.get("impot"));
                list.add(impot);
            }
        } finally {
            cursor.close();
        }
        return list;
    }
}
