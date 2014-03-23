package m2l_impot;

import java.util.Date;

public class Regime {

	
	private boolean choix = false;
	private AssociationLucrative lucrative = new AssociationLucrative(0, 0);
	private AssociationNonLucrative nonLucrative = new AssociationNonLucrative(
			0, 0);

        public Regime(){
            
        }
	public Regime(boolean choix) {
            this.choix = choix;
	}


	public boolean isChoix() {
		return choix;
	}

	public void setChoix(boolean choix) {
		this.choix = choix;
	}

	//public double impot(boolean choix) {
	//	if (choix == false)
	//		return lucrative.CalculSurBenef();
	//	else
	//		return nonLucrative.calculImpoAsso();
	//}

}