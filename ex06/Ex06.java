/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06;

/**
 *
 * @author carlahabito
 */
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FireType Charmander = new FireType("Charmander", 95, 8);
        WaterType Squirtle = new WaterType("Squirtle", 75, 5);
        GrassType Bulbasaur = new GrassType("Bulbasaur", 85, 3);
        
        while (Charmander.hp > 0 && Squirtle.hp > 0) {
            Charmander.attack(Squirtle);
            Squirtle.attack(Charmander);
        }
        
        System.out.println();
        System.out.println("charmander vs squirtle done");
        System.out.println();
        System.out.println();
        
        Charmander.hp = 95;
        Squirtle.hp = 75;
        
        while (Squirtle.hp > 0 && Bulbasaur.hp > 0) {
            Squirtle.attack(Bulbasaur);
            Bulbasaur.attack(Squirtle);
        }
        
        System.out.println();
        System.out.println("squirtle vs bulbasaur done");
        System.out.println();
        System.out.println();
        
        Squirtle.hp = 75;
        Bulbasaur.hp = 85;
        
        while (Bulbasaur.hp > 0 && Charmander.hp > 0) {
            Bulbasaur.attack(Charmander);
            Charmander.attack(Bulbasaur);
        }
        
        System.out.println();
        System.out.println("bulbasaur vs charmander done");
        System.out.println();
        System.out.println();
   }
    
}
