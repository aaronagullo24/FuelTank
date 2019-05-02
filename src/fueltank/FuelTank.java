/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fueltank;

/**
 * FuelTank es una clase que representa el deposito de un coche.
 * Un objeto FuelTank object encapsula la información del estado necesaria para describir el estado de un deposito
 * <ul>
*   <li> tankMax   capacidad del deposito
*   <li> tankLevel nivel del deposito
 * </ul>
 * 
 * class invariant 	0.0 &lt;= tankLevel &lt;= tankMax
 * 
 * @author YOMISMO
 *
 */
public class FuelTank {

    private double tankMax;
    private double tankLevel;

   /**
	* FuelTank es el constructor 
	* 
	* <hr>
	* <br>precondition tankMax &gt; 0.0 and 0.0 &lt;= tankLevel &lt;= getTankMax()  
	* <br>postcondition tankMax &gt; 0.0 and 0.0 &lt;= tankLevel &lt;=getTankMax() 
	* <hr>
	
	* @param tankMax  limite en litros que puede almacenar el deposito
	* @param tankLevel cantidad de litros que tiene inicialmente el deposito
	* 
	*/ 
	FuelTank(double tankMax, double tankLevel) {
       this.tankMax   = tankMax;
       this.tankLevel = tankLevel;
    }

   /**
    * getTankLevel 
    * 
    * @return	nivel del deposito
    */
    public double getTankLevel(){
       return tankLevel;
    }

   /**
    * getTankMax 
    * 
    * @return	capacidad maxima del deposito
	*/
	public double getTankMax(){
       return tankMax;
    }

   /**
	* isEmpty estado del deposito
	* 
	* @return 	<code>true</code> si el deposito esta vacio
    *          <code>false</code> en otra caso.
	*/
    public boolean isEmpty(){
      return tankLevel == 0;
    }

    /**
	 * isFull estado del deposito 
	 * 
	 * @return 	<code>true</code> si el tanque está lleno
     *          <code>false</code> otro caso.
	 */
    public boolean isFull(){
	  return tankLevel == tankMax;
    }

   /**
	* fill anyadir cantidad al deposito
	* 
	* <hr>
	* <br> precondition 	0.0 &lt; amount &lt;= getTankMax() - getTankLevel() 
	* <br> postcondition 	not empty
	* <br> postcondition  	tankLevel &gt; tankLevel_initial 
	* <hr>
	* 
	* @param amount cantidad en litros anyadida al deposito
	* 
	*/
    public void fill(double amount){
       tankLevel = tankLevel + amount;
    }

   /**
	* consume quitar cantidad del deposito
	* 
    * @param amount cantidad en litros gastados
    * 
    */
	public void consume(double amount){
       tankLevel = tankLevel - amount;
    }
}
