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
public class Fourchette {
    private boolean dispo = true ;

   public synchronized void prendre()
   {
      while (!dispo) {
         try {
	    this.wait() ;
         } catch (InterruptedException e) {} ;
      }
      dispo = true ;
   }

   public synchronized void poser()
   {
      dispo = true ;
      this.notify() ;
   }
}
    

