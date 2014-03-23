package m2l_impot;

public class AssociationLucrative implements Association {

    private double chiffreAffaires;
    private double benefices;

    public AssociationLucrative(double chiffreAffaires, double benefices) {
        this.chiffreAffaires = chiffreAffaires;
        this.benefices = benefices;
    }

    AssociationLucrative() {
    }

    public double getChiffreAffaires() {
        return chiffreAffaires;
    }

    public void setChiffreAffaires(double chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
    }

    public double getBenefices() {
        return benefices;
    }

    public void setBenefices(double benefices) {
        this.benefices = benefices;
    }

    private double calculSurBenef() {
        if (chiffreAffaires > 7630000) {
            return benefices * 33.33 / 100;
        } else if (chiffreAffaires < 38120) {
            return benefices * 15 / 100;
        } else {
            return 38120 * 15 / 100 + (benefices - 38120) * 33.33 / 100;
        }

    }

    @Override
    public double getImpot() {
        return calculSurBenef();
    }

}
