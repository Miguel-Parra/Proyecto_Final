package com.epn;


import java.util.Arrays;
import java.util.Random;

public class AplicaciónBurbuja {

	public static void main(String[] args) {
		
		int[]numeros  = new int[100];
		
		Random r= new Random();
		
		for (int j = 0; j < numeros.length; j++) {
			numeros[j]=r.nextInt(100)+1;
			
		}
		
		System.out.println(Arrays.toString(numeros));
	
		long time_start, time_end;
		time_start = System.currentTimeMillis();
		
		burbuja(numeros); // llamamos a la tarea
		time_end = System.currentTimeMillis();
		System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds");
		
		System.out.println(Arrays.toString(numeros));
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