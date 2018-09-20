/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friendslogiconly;

import java.util.Scanner;

/**
 * This class implements logic to determine friend compatibility. It 
 * uses if and else statements.
 * @author ashley wagner 
 */
public class FriendsLogicOnly {

   
    public static void main(String[] args) {
        int friendScore = 0;
        final int NICE_PERSON = 1;
        System.out.println("Are you a nice person? (0 = no, 1 = yes)");
        
        //type Scanner called keyboardReader
        Scanner keyboardReader = new Scanner(System.in);
        friendScore = keyboardReader.nextInt();
        
        if (friendScore == 1) {
 
            friendScore = friendScore + 10;
            System.out.println("Cool. Mean people suck.");
        } else { 
            
            System.out.println("Who hurt you?");
        } //close else
    
        System.out.println("Can you make me laugh? (0 = no, 1 = yes)");
        
        friendScore = keyboardReader.nextInt();
        
       if (friendScore ==1) {
            friendScore = friendScore + 10; 
            System.out.println("Tell me a joke bro");
        } else {
            System.out.println("Lame.");               
        } //close else
       System.out.println("Wanna go on an adventure? (0 = no, 1 = yes)");
       friendScore = keyboardReader.nextInt();
       if (friendScore ==1) {
            friendScore = friendScore + 10; 
            System.out.println("Roaaaadtriiiiip!");
        } else {
            System.out.println("Why are you so dead inside?");               
        } //close else
       
       System.out.println("Do ya love puppies?! 0 = no 1 = yes)");
       
       friendScore = keyboardReader.nextInt();
        
       if (friendScore ==1) {
            friendScore = friendScore + 10; 
            System.out.println("SHOW ME UR PUPPY");
        } else {
            System.out.println("bye");               
        }//close else
       
       if (friendScore > 5) {
           System.out.println("Did we just become best friends?");
       }//end if
       else {
           System.out.println("*runs away* (We aren't friends.)");
              
        }//close else
    } //close main method
}  //close class 