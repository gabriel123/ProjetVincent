/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2l_impot;

import java.net.UnknownHostException;
import java.util.Date;

/**
 *
 * @author hp
 */
public class ImpotEngine {

    private Association association;
    private MongodbConnect connexion;

    public MongodbConnect getConnexion() {
        return connexion;
    }

    public void setConnexion(MongodbConnect connexion) {
        this.connexion = connexion;
    }
           
    public ImpotEngine() throws UnknownHostException {
        connexion = new MongodbConnect();
    }
    
    void createAssociation(boolean b) {
        if (b == true) {
            association = new AssociationNonLucrative();
        } else {
            association = new AssociationLucrative();
        }
    }

    public Association getAssociation() {
        return this.association;
    }
}
