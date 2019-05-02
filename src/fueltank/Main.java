/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fueltank;

/**
 *
 * @author Aaron
 */
public class Main {

    public static void main(String[] args) {
        
        // create the tank
        FuelTank tank = new FuelTank(40.0,0.0);
        
        System.out.print("El deposito con  " + tank.getTankMax() + " litros ha sido creado. ");
        System.out.println(" La cantidad de gasolina incial es de " + tank.getTankLevel() + " litros.");
    }
}
