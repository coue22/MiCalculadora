package org.simple.prueba;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{

	private Calculadora calc;
	
	
	@Test
    public void testSuma()
    {
		calc = new Calculadora();
		System.out.println("Salida de la Suma: " + calc.sumar(5, 7));
    }

	
	@Test
    public void testResta()
    {
		calc = new Calculadora();
		System.out.println("Salida de la Resta: " + calc.restar(9, 7));
    }
	
	@Test
    public void testMulti()
    {
		calc = new Calculadora();
		System.out.println("Salida de la Multiplicacion: " + calc.multiplicar(9, 7));
    }	

	@Test
    public void testDividir()
    {
		calc = new Calculadora();
		System.out.println("Salida de la Division: " + calc.dividir(9, 3));
    }	

	@Test
    public void testRaiz()
    {
		calc = new Calculadora();
		System.out.println("Salida de la Raiz: " + calc.raiz(8));
    }	
	
	@Test
    public void testPotencia()
    {
		calc = new Calculadora();
		System.out.println("Salida de la Potencia: " + calc.potencia(8));
    }	
		
	@Test
    public void testLogaritmo()
    {
		calc = new Calculadora();
		System.out.println("Salida de la Logaritmo: " + calc.Logaritmo(8));
    }		
	
	@Test
    public void testdeFallo()
    {
		fail("Fallido...");
    }	
		
}
