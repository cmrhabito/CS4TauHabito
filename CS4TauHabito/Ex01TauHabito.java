/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01TauHabito;

/**
 *
 * @author carlahabito
 */
public class Ex01TauHabito {
    
    public static void main(String[] args) {
    
    // changmin
    String userOne = "changmin";
    int changminAge = 25;
    String changminGroup = "The Boyz";
    
    // yeri
    String userTwo = "yeri";
    int yeriAge = 24;
    String yeriGroup = "Red Velvet";
        
    // sungchan
    String userThree = "sungchan";
    int sungchanAge = 22;
    String sungchanGroup = "NCT";

    //summary
    double averageAge = (changminAge + yeriAge + sungchanAge) / 3.0;
    boolean group = "changminGroup" == "yeriGroup" ||  "yeriGroup" == "sungchanGroup" ||  "changminGroup" == "sungchanGroup";
    boolean boolAge = changminAge >= 18 || yeriAge >= 18 || sungchanAge >= 18;

    System.out.println("User #1");
    System.out.printf("Name: %s \n",userOne);
    System.out.printf("Age: %s \n",changminAge);
    System.out.printf("Group: %s \n",changminGroup);
    System.out.println("\n");

    System.out.println("User #2");
    System.out.printf("Name: %s \n",userTwo);
    System.out.printf("Age: %s \n",yeriAge);
    System.out.printf("Group: %s \n",yeriGroup);
    System.out.println("\n");

    System.out.println("User #3");
    System.out.printf("Name: %s \n",userThree);
    System.out.printf("Age: %s \n",sungchanAge);
    System.out.printf("Group: %s \n",sungchanGroup);
    System.out.println("\n");

    System.out.println("SUMMARY");
    System.out.printf("Average age: %s \n",averageAge);
    System.out.printf("In same groups: %s \n",group);
    System.out.printf("All above 18 years old: %s \n",boolAge);
    }
}
