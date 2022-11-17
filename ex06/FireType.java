/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex06;

/**
 *
 * @author carlahabito
 */
public class FireType extends Monster{
    
    public FireType(String n, int m, int base){
        super(n, "fire", "grass", "water", m, base);
        atk = 1.3*base;
        def = 0.7*base;
    }
    
    @Override 
    public void special(){
        atk += 2;
        maxHP -= 10;
        
}
}
