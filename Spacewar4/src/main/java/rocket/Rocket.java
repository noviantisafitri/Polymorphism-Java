/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rocket;

/**
 *
 * @author FLOW
 */
public class Rocket {

    private int healthPoint = 1000;  
    private int fuelCapacity = 500;  
    private int speed = 1000;        

    public Rocket(int healthPoint, int fuelCapacity, int speed) {
        this.healthPoint = healthPoint;
        this.fuelCapacity = fuelCapacity;
        this.speed = speed;
    }

    public Rocket() {
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
        if (this.healthPoint < 0) {
            this.healthPoint = 0;
        }
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isDestroyed() {
        return this.healthPoint <= 0;
    }

    public void refuel() {
        System.out.println("Refueling the rocket...");
        this.fuelCapacity = 500;
    }

    public void displayStatus() {
        System.out.println("Health Points: " + this.healthPoint);
        System.out.println("Fuel Capacity: " + this.fuelCapacity + " liters");
        System.out.println("Speed: " + this.speed + " km/h");
        System.out.println();
    }
}

