import java.util.Scanner;

public class SizeofKennel {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int dogLength;
      int dogHeight;
      String userDog;
      
      System.out.println("Enter you dog's name below");
      userDog = scnr.next();
      
      System.out.println("Have your dog stand. What is " + userDog + "'s body length?");
      dogLength = scnr.nextInt();
      
      System.out.println("Next, have them sit up straight. What is " + userDog + "'s height?");
      dogHeight = scnr.nextInt();
      
      int kennelLength = dogLength + 4;
      int kennelHeight = dogHeight + 4;
      
      System.out.println(userDog + " would benefit from a kennel that is at least " 
      + kennelLength + "in (L) x " + dogLength + "in (W) x " + kennelHeight + "in (H).");
      }
}