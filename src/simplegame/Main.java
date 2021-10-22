/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplegame;

/**
 *
 * @author Mary Denkyiwaa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player1 player = new Player1("Mary", "sword", 100);
//        System.out.println(player.getName());
//        System.out.println(player.getHealth());
//        System.out.println(player.getWeapon());
            
            player.damageByGun1();
            player.damageByGun1();
            player.damageByGun2();
            player.heal();

//        Player2 betterPlayer = new Player2("Sam", "machine gun", 80, true);
//        betterPlayer.damageByGun1();
    }
    
}
