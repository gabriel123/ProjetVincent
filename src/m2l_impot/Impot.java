/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2l_impot;


import java.text.SimpleDateFormat;
import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author hp
 */
public class Impot {

    private ObjectId _id;
    private double impot;
    private Date date;

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId id) {
        this._id = id;
    }

    public double getImpot() {
        return impot;
    }

    public void setImpot(double impot) {
        this.impot = impot;
    }

    public Date getDate() {
        return date;
    }

    public String getDateFormat() {
        return new SimpleDateFormat("dd/MM/yyyy HH:mm").format(this.date);
    }
    public void setDate(Date date) {
        this.date = date;
    }

}
