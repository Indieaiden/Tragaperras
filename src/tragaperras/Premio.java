package tragaperras;

import java.util.ArrayList;

public class Premio {

	//Atributos 
	
		private double dinero;
		private ArrayList<Fruta> combinacion;
	
	//Metodos
		
		public Premio (double dinerito, Fruta... frutas) {
			this.dinero = dinerito;
			for (Fruta fruti:frutas) {
				combinacion.add(fruti);
			}
		}
}
