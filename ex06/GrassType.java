/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex06;

/**
 *
 * @author carlahabito
 */
public class GrassType extends Monster{
    
    public GrassType(String n, int m, int base){
        super(n, "grass", "water", "fire", m, base);
    }
    
    public void rest(){
        hp += (maxHP/2);
    }
    
    @Override
    public void special(){
        hp += (0.2*maxHP);
        
}
}
