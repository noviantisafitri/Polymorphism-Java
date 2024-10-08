/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weapon;

/**
 *
 * @author FLOW
 */
public class Missile extends Weapon {

    private int speed = 2000; 
    private int range = 500;

    public Missile() {
        this.damage = 400;
        this.weight = 25;
    }

    @Override
    public void sound() {
        System.out.println("Whoosh... Missile flying sound.");
    }

    public void launch() {
        System.out.println("Missile launched at speed " + speed + " km/h with a range of " + range + " km.");
    }

    @Override
    public void reload() {
        System.out.println("Loading another missile...");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}

