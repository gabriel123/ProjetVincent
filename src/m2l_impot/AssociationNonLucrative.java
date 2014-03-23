package m2l_impot;

public class AssociationNonLucrative implements Association {

    private double revenuMobiliers;
    private double revenuPatrimoine;

    public AssociationNonLucrative(double rMobiliers, double rPatrimoine) {
        this.revenuMobiliers = rMobiliers;
        this.revenuPatrimoine = rPatrimoine;

    }

    AssociationNonLucrative() {
    }

    public double getRevenuMobiliers() {
        return revenuMobiliers;
    }

    public void setRevenuMobiliers(double rMobiliers) {
        this.revenuMobiliers = rMobiliers;
    }

    public double getRevenuPatrimoine() {
        return revenuPatrimoine;
    }

    public void setRevenuPatrimoine(double rPatrimoine) {
        this.revenuPatrimoine = rPatrimoine;
    }

    private double calculImpoAsso() {
        return revenuMobiliers * 0.1 + revenuPatrimoine * 0.24;
    }

    @Override
    public double getImpot() {
        return calculImpoAsso();
    }

}
