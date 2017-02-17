package ordenacionObjetos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class AppLista {

	public static void main(String[] args) {
		
		ArrayList<Persona>lista= new ArrayList<Persona>();
		
		
		
		lista.add(new Persona(1,"Anderson","Revelo",22));
		lista.add(new Persona(2,"Israel","Perez",23));
		lista.add(new Persona(3,"Miguel","Parra",21));
		lista.add(new Persona(4,"Carlos","Morales",25));
		lista.add(new Persona(5,"Alexandra","Macas",20));
		
		
		
		System.out.println(lista);// imprime la lista 
		
		Collections.sort(lista,new ComparadorPorAltura());// ordenación comparando dos objetos
		System.out.println(lista);// imprime la lista ya ordenada 
		
			Collections.shuffle(lista);//desordena la lista
		
			//Creamos un vector que recolecte las alturas
		
		int[]vector=new int[lista.size()];
		int i =0;
		for (Persona persona : lista) {
			vector[i]=persona.getAltura();
			i++;
			
			
		}
		
		System.out.println("Arreglo desordenado"+Arrays.toString(vector));
		
		burbuja(vector);
		System.out.println("Método burbuja"+Arrays.toString(vector));
		
	}
	
	
	public static void burbuja(int [] A){
	    int i, j, aux;
	    for(i=0;i<A.length-1;i++)
	    	
	         for(j=0;j<A.length-i-1;j++)
	              if(A[j+1]<A[j]){
	                 aux=A[j+1];
	                 A[j+1]=A[j];
	                 A[j]=aux;
	              }
	}
	
	
	


}