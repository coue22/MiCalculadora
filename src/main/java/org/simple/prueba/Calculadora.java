package org.simple.prueba;
 

public class Calculadora 
{

	/**
	 * Constructor
	 */
	public Calculadora(){
	}
	 
	/**
	 * Realiza una suma
	 * @param a - primer sumando
	 * @param b - segundo sumando
	 * @return - La suma de los dos sumandos
	 */
	public int sumar(int a, int b){
		return a + b;
	}

	/**
	 * Realiza una resta
	 * @param a
	 * @param b
	 * @return
	 */
	public int restar(int a, int b){
		return a - b;     
		
	}
	
	/**
	 * Realiza la multiplicación.
	 * @param a
	 * @param b
	 * @return
	 */
	public int multiplicar(int a, int b){
		return a * b;
	}
	
	/**
	 * Realiza la división.
	 * @param a
	 * @param b
	 * @return
	 */
	public int dividir(int a, int b){
		if (b == 0){
			return 0;
		}
			
		
		return a / b;
	}
	
	/**
	 * Realiza la raiz cuadrada
	 * @param a - Numero del cual se quiere realizar la operación.
	 * @return
	 */
	public double raiz(double a){
		return Math.sqrt(a); 
	}
	
	/**
	 * 
	 * @param a
	 * @return
	 */
	public double potencia(double a){
		return Math.pow(a,2); 
	}
		

	
	/**
	 * 
	 * @param a
	 * @return
	 */
	public double Logaritmo(double a){
		if (a==0)
			return 1;
		
		return 2;
	}
			
	
}


