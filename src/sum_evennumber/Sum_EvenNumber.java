/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum_evennumber;

import java.util.Scanner;

/**
 *
 * @author iamne
 */
public class Sum_EvenNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int number, maximum, sum=0;
       Scanner in = new Scanner (System.in);
        System.out.println("Enter Upper Limit: ");
        maximum = in.nextInt();
        System.out.println("Even numbers between 0 and "+maximum+" are...");
       for(number=1; number<=maximum; number++){
           if(number%2==0){
               System.out.println(number+"");
               sum = sum+number;
           }
       }
        System.out.println("Sum of All even Numbers upto " +maximum+" = "+sum);
      
// TODO code application logic here
    }
    
}
