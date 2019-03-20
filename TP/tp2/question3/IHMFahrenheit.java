package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.Scanner;
import java.math.*;
public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degré Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    sortie.setEditable(false);
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * méthode déclenchée lorsque le bouton de conversion est appuyé. 
   * remarquer que le champs de droite (les degrés Celsius) n'est pas éditable.
   * @param ae l'événement transmis
   */
  public void actionPerformed( ActionEvent ae ){
    try{
      
        double result;
      
      
        String fah = entree.getText(); // valeur est une String et doit être convertie en entier, voir java.lang.Integer méthode parseInt (--> try/catch)
     
        int fahrenheit = Integer.parseInt(fah);
       
	    float c1= (float)5/9;
	  
	    float conv = c1 *  (fahrenheit - 32);
 
            float res = ((int)(conv * 10))/10.0f;
        
            if(res < -273.1f) res = -273.1f;
            
            result = (double)res;
           
	
      sortie.setText( String.format("%.1f", result));
   
    }catch(NumberFormatException nfe){
      
        sortie.setText("error ! ");
   
    
    }
    
  }
  
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
}
