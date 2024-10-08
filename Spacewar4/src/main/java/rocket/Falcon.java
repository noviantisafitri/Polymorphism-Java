/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rocket;

import weapon.Bomb;
import weapon.Flamethrower;
import weapon.Laser;
import weapon.Missile;

/**
 *
 * @author FLOW
 */
public class Falcon extends Rocket {

    public void shoot(Laser laser, Rocket target) {
        System.out.println("Shooting with Laser...");
        target.setHealthPoint(target.getHealthPoint() - laser.getDamage());
        laser.sound();
        laser.charge();
        displayTargetHealth(target);
    }

    public void shoot(Flamethrower flamethrower, Rocket target) {
        System.out.println("Shooting with Flamethrower...");
        target.setHealthPoint(target.getHealthPoint() - flamethrower.getDamage());
        flamethrower.sound();
        flamethrower.ignite();
        displayTargetHealth(target);
    }

    public void shoot(Bomb bomb, Rocket target) {
        System.out.println("Dropping a Bomb...");
        target.setHealthPoint(target.getHealthPoint() - bomb.getDamage());
        bomb.sound();
        bomb.explode();
        displayTargetHealth(target);
    }

    public void shoot(Missile missile, Rocket target) {
        System.out.println("Launching a Missile...");
        target.setHealthPoint(target.getHealthPoint() - missile.getDamage());
        missile.sound();
        missile.launch();
        displayTargetHealth(target);
    }

    private void displayTargetHealth(Rocket target) {
        if (target.isDestroyed()) {
            System.out.println("Target destroyed!");
        } else {
            System.out.println("Target's remaining health: " + target.getHealthPoint());
        }
    }
}
