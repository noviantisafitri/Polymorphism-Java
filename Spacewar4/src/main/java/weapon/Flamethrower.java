/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weapon;

/**
 *
 * @author FLOW
 */
public class Flamethrower extends Weapon {

    private int fuel = 100; 

    public Flamethrower() {
        this.damage = 200;
        this.weight = 15;
    }

    @Override
    public void sound() {
        System.out.println("Whoosh... Flamethrower sound.");
    }

    public void ignite() {
        System.out.println("Igniting the flamethrower...");
    }

    @Override
    public void reload() {
        System.out.println("Refueling the flamethrower...");
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
