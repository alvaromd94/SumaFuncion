package es.studium.SumaFuncion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumaFuncion
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int numero1,numero2, r;

		System.out.println("Dame el numero1: ");
		numero1 = Integer.parseInt(lectura.readLine());
		System.out.println("Deme el numero2: ");
		numero2 = Integer.parseInt(lectura.readLine());		
		r = suma(numero1,numero2);
		System.out.println ("La suma de los dos números es:"+r);
		
	}
	public static int suma (int numero1, int numero2)
	{
	return (numero1+numero2);	
	}
}