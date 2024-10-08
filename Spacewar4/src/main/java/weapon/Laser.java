/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weapon;

/**
 *
 * @author FLOW
 */
public class Laser extends Weapon {
    
    private int chargeTime = 3; 

    public Laser() {
        this.damage = 150;
        this.weight = 8; 
    }

    @Override
    public void sound() {
        System.out.println("Phew... Laser sound.");
    }

    public void charge() {
        System.out.println("Charging the laser for " + chargeTime + " seconds...");
    }

    @Override
    public void reload() {
        System.out.println("Recharging the laser...");
    }
    
}
