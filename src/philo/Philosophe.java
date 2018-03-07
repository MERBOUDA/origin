/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package philo;

import java.util.Random;

/**
 *
 * @author TOSHIBA
 */
public class Philosophe extends Thread {
    
   private  int        no ;
   private  Fourchette fourchetteGauche ;
   private  Fourchette fourchetteDroite ;
   private Random     random ;
   private       int        loopCount ;

   public Philosophe(int no, Fourchette fourchetteGauche, Fourchette fourchetteDroite, int loopCount)
   {
      this.no             = no ;
      this.fourchetteGauche = fourchetteGauche ;
      this.fourchetteDroite = fourchetteDroite ;
      this.loopCount        = loopCount ;
      this.random           = new Random(System.currentTimeMillis()) ;
   }
   public void run()
   {
      while (loopCount-- > 0) {
         penser() ;
         prendre(fourchetteGauche) ;
         prendre(fourchetteDroite) ;
	 System.out.println("Philosophe " + no + " mange") ;
         manger() ;
	 poser(fourchetteGauche) ;
         poser(fourchetteDroite) ;
      }
   }
    public void penser()
   {
      try {
         sleep(random.nextInt(128)) ;
      } catch (InterruptedException e) {} ;
   }

   public void manger()
   {
      try {
         sleep(random.nextInt(128)) ;
      } catch (InterruptedException e) {} ;
   }
   
     public void prendre(Fourchette fourchette)
   {
      fourchette.prendre() ;
   }

   public void poser(Fourchette fourchette)
   {
      fourchette.poser() ;
   }

}
   
   
   

