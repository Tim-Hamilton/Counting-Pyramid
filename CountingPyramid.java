//check the README

import java.util.*;

public class CountingPyramid{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    //Ask user to input a number and assign it to a variable
    System.out.println("please enter a number 1-9");
    int userInput = input.nextInt();
    

    for(int i = 1, m = userInput - i ; i <= userInput; i++){
      
      
      for(int j = 1; j <= userInput - i; j++){
	System.out.print(' ');
      }
      
      for(int k = 0, n = userInput - m; k < i; k++ , n--){
	System.out.print(n);
      }
      
      for(int a = 2; a <= i; a++){
	System.out.print(a);
      }
      
      System.out.println();
      m--;
    }//close of first for loop
  }
}