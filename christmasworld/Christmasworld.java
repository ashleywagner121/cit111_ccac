/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmasworld;
import java.util.Scanner;
/**
 *
 * @author awagn43
 */
public class Christmasworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int giftChoice;
        //user input int
        int yesNo;
        //user input int
        
          Christmas firstBox;
    firstBox = new Christmas ();
    firstBox.size = "big";
    firstBox.wrapper = "shiny and silver";
    
    System.out.println("Merry Christmas!");
    System.out.println("Santa has come down your Chimney! He has three gifts, and says you can choose one!");
            
    System.out.println(" Shall you look at the presents and decide which one you'd like?");
    System.out.println("~~~~~~~~~~~~~~~~");
    System.out.println("Yes:(1) No:(2)");
    Scanner scan = new Scanner(System.in);
    yesNo = scan.nextInt();
    //scanner will scan an integer for user input
    
    if(yesNo == 1) {
        System.out.println("Okay! Here they are.");
    }
    if(yesNo == 2) {
        System.out.println("Santa threw coal at you.");
        System.exit(0);
    }
    //if you say no, the program ends.
    
    
    System.out.println("The first present is " + firstBox.size + ", " +firstBox.wrapper + ".");       
    
        
        
        Christmas secondBox;
        secondBox = new Christmas ();
        secondBox.size = "small";
        secondBox.wrapper = "wrapped with a beautiful bow";
        
        System.out.println("The second present is " + secondBox.size + " and " + secondBox.wrapper + ".");       
    
    
        Christmas thirdBox;
        thirdBox = new Christmas ();
        
        thirdBox.size = "gigantic";
        thirdBox.wrapper = " cardboard box and it's moving!";
        System.out.println("The third present is a " + thirdBox.size + thirdBox.wrapper);       
        
    
    System.out.println("Which one will you choose? Enter 1, 2 or 3.");
    giftChoice = scan.nextInt();
    if(giftChoice == 1) {
        System.out.println("Congrats! It's a bunch of fuzzy socks! Thanks Santa!");
    }
    if(giftChoice == 2) {
        System.out.println("Wow! It's a new TV! Thanks Santa!");
        
    }
    if(giftChoice == 3) {
        System.out.println("Omg! It's a cute lil puppy! Thanks Santa!");
    }
    if(giftChoice > 3) {
        System.out.println("Santa left because you can't follow directions. He gave you coal instead.");
        }
    //if the user enters anything more than 3 they get a sad present
        
        }
}
   
    
    

