/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum.spacewar4;

import java.util.Random;
import java.util.Scanner;
import rocket.Falcon;
import rocket.Rocket;
import weapon.Bomb;
import weapon.Flamethrower;
import weapon.Laser;
import weapon.Missile;

/**
 *
 * @author FLOW
 */
public class Spacewar4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        Falcon falcon1 = new Falcon();
        Laser laser1 = new Laser();
        Flamethrower flamethrower1 = new Flamethrower();
        Bomb bomb1 = new Bomb();
        Missile missile1 = new Missile();
        Rocket enemyRocket = new Rocket();
        
        System.out.println("Welcome to Spacewar!");

        while (!enemyRocket.isDestroyed()) {
            System.out.println("\nChoose your weapon to shoot:");
            System.out.println("1. Laser");
            System.out.println("2. Flamethrower");
            System.out.println("3. Bomb");
            System.out.println("4. Missile");
            System.out.print("Your choice: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    falcon1.shoot(laser1, enemyRocket);
                    break;
                case 2:
                    falcon1.shoot(flamethrower1, enemyRocket);
                    break;
                case 3:
                    falcon1.shoot(bomb1, enemyRocket);
                    break;
                case 4:
                    falcon1.shoot(missile1, enemyRocket);
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }

            if (!enemyRocket.isDestroyed() && random.nextInt(10) > 7) {
                System.out.println("The enemy rocket is attacking back!");
                falcon1.setHealthPoint(falcon1.getHealthPoint() - random.nextInt(50));
                System.out.println("Falcon health: " + falcon1.getHealthPoint());
                if (falcon1.isDestroyed()) {
                    System.out.println("Game Over! Your Falcon has been destroyed.");
                    break;
                }
            }
        }

        if (enemyRocket.isDestroyed()) {
            System.out.println("Congratulations! You destroyed the enemy rocket!");
        }

        scanner.close();
    }
}