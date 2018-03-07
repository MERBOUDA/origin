/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philo;

/**
 *
 * @author TOSHIBA
 */
public class Philo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    Fourchette[] fourchettes = new Fourchette[4] ;
      for (int i = 0 ; i < 4 ; i++)
         fourchettes[i] = new Fourchette() ;

      Philosophe[] philosophe = new Philosophe[4] ;
      for (int i = 0 ; i < 4 ; i++)
         philosophe[i] = new Philosophe(i,fourchettes[i],fourchettes[(i + 1) % 4],5);
                                      
                                        
					

      for (int i = 0 ; i < 4 ; i++)
         philosophe[i].start() ;					

      for (int i = 0 ; i < 4 ; i++)
         try {
            philosophe[i].join() ;					
         } catch (InterruptedException e) {} ;
   }
}
    
    
    
    
    
    
    

