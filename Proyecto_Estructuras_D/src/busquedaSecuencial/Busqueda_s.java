package busquedaSecuencial;


public class Busqueda_s{
	
	public static void main(String[] args) {
		long []vect= {20,10,1,6,54,4,1,36,5,2};
		long clave=2;
		System.out.print("Vector: "+toString(vect)+"\n");
		
		if(busquedaSecuencial(vect,clave)<0){
			System.out.println("No se encontro el número "+clave+" en el vector");
		}else {
				System.out.println("El número "+clave+" se encuentra en la posicion "+busquedaSecuencial(vect,clave));
		}
	}
	
	
	public static int busquedaSecuencial(long[]vector, long clave) {
		for(int i=0;i<vector.length;i++){
			if (vector[i]==clave){
				return i;
				}}
		return -1;
}
	
	public static String toString(long[]vector) {
		String v="[";
	for(int i=0;i<vector.length;i++){
		if (i==vector.length-1){
			v+=vector[i]+"]";
		}else{
			v+=vector[i]+" ";
		}
	}
	return v;
	}
}
