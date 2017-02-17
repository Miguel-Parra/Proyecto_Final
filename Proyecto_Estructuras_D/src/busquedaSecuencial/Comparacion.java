package busquedaSecuencial;

import java.util.Arrays;
import java.util.Random;

public class Comparacion {
	
	
	public static void main(String[] args) {
		//long []vect= {20,10,1,6,54,4,1,36,5,2};
		int clave=104;
		
		Random r= new Random();
        int[]vect  = new int[700];

		
for (int j = 0; j < vect.length; j++) {
	vect[j]=r.nextInt(100)+1;	
}
//Arrays.sort(vect);


Arrays.sort(vect);
long time_start1, time_end1;
time_start1 = System.currentTimeMillis();


System.out.println("Vector: "+toString(vect)+"\n");
if(busquedaBinaria(vect,clave)>=0){
	System.out.println("La clave "+clave+" se encuentra en la posición "+busquedaBinaria(vect,clave));
}
else{System.out.println("La clave "+clave+" no se encuentra en la lista");}

time_end1 = System.currentTimeMillis();
System.out.println("tiempo código binario "+ ( time_end1 - time_start1) +" milisegundos");





long time_start, time_end;
time_start = System.currentTimeMillis();


System.out.println("Vector: "+toString(vect)+"\n");
if(busquedaSecuencial(vect,clave)>=0){
	System.out.println("La clave "+clave+" se encuentra en la posición "+busquedaSecuencial(vect,clave));
}
else{System.out.println("La clave "+clave+" no se encuentra en la lista");}

time_end = System.currentTimeMillis();
System.out.println("tiempo código secuencial "+ ( time_end - time_start ) +" milisegundos");
}
	
	
	public static int busquedaSecuencial(int[]vector, int clave) {
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





public static int busquedaBinaria(int vector[],int clave){
int centro,linferior,lsuperior;
int valorcentral;

linferior=0;
lsuperior=vector.length-1;
while(linferior<=lsuperior){

centro=(linferior+lsuperior)/2;
valorcentral=vector[centro];
if(clave==valorcentral){return centro;}
else{if (clave <valorcentral){ 
lsuperior= centro-1;}
else {linferior=centro+1;}
}



}
return -1;}

private static String toString(int[] vector) {
String salida="";	
for (int i=0;i<vector.length;i++){
	salida+=vector[i]+" ";
}
return salida;	
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
