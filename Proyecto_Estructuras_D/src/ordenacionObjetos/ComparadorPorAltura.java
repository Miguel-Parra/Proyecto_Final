package ordenacionObjetos;

import java.util.Comparator;

public class ComparadorPorAltura implements Comparator<Persona>{


	@Override
	public int compare(Persona objeto1, Persona objeto2) {
		
		return objeto1.getAltura() - objeto2.getAltura();
		
	}
	

}
