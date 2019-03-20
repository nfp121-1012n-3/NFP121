package question2;
import java.io.*;
import java.text.*;
import java.util.Scanner;
import java.math.*;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
    //@FahrenheitCelsiusTest(expected = NumberFormatException.class)
     public static void main(String[] args){
         
       try{
       	    // pour tous les paramètres de la ligne de commande
	    
		int [] tab= new int[args.length];
		
		double valeurRes;
		
		for(int j=0;j<args.length;j++)  {
		    
		    //if(args[j]=="[^a-z]"){throw new NumberFormatException("For input string: "+args[j]);}
		    tab[j]=Integer.parseInt(args[j]);
                }
		
                for(int i=0;i<tab.length;i++){
		   valeurRes= fahrenheitEnCelsius(tab[i]);
		System.out.println(tab[i] + "\u00B0F -> " + String.format("%.1f", valeurRes) + "\u00B0C"); // ligne,
			 // format
			}// imposés
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
      
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int entree){
            
	    
          
	    float c1= (float)5/9;
	  
	    float conv = c1 *  (entree - 32);

            float result = ((int)(conv * 10))/10.0f;
        
        
	return result;
     }

}
