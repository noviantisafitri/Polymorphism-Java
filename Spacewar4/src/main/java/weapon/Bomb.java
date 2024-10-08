/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weapon;

/**
 *
 * @author FLOW
 */
public class Bomb extends Weapon {

    private int explosionRadius = 50; 

    public Bomb() {
        this.damage = 500; 
        this.weight = 30; 
    }

    @Override
    public void sound() {
        System.out.println("Boom... Bomb explosion sound.");
    }

    public void explode() {
        System.out.println("Bomb exploded with a radius of " + explosionRadius + " meters.");
    }

    @Override
    public void reload() {
        System.out.println("Placing another bomb...");
    }

    public int getExplosionRadius() {
        return explosionRadius;
    }

    public void setExplosionRadius(int explosionRadius) {
        this.explosionRadius = explosionRadius;
    }
}

