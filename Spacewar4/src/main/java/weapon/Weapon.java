/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weapon;

/**
 *
 * @author FLOW
 */
public class Weapon {
    protected int damage = 100;
    protected int weight = 10; 

    public void sound() {
        System.out.println("This is the sound of a generic weapon.");
    }

    public int getDamage() {
        return damage;
    }

    public int getWeight() {
        return weight;
    }

    public void reload() {
        System.out.println("Reloading the weapon...");
    }
}
