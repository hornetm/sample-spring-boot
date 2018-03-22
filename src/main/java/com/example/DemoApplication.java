package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	/**
	 * C'est l méthode qui sert à diviser
	 * @param a dividende
	 * @param b diviseur
	 * @return return 0 si le diviseur est 0 et return le résultat de la division
	 */
	
	public static double diviser(Integer a, Integer b)
    {
    	if (b==0)
    	{
    		return 0;
    	}
    	
    	return  a/b;
    	
    }
	
	public static double Addition(Integer a, Integer b)
    {
    	
    	return  a+b;
    	
    }
}
