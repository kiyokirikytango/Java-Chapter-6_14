/*
Chapter 6 Programming excercise 14
Riky Hernandez
9/13/21
Description: Estimate pie using (-1)^i+1/2*i-1
to make  a table going from 1 - 901 in incremntnts of 100
`;-.          ___,
  `.`\_...._/`.-"`
    \        /      ,
    /()   () \    .' `-._
   |)  .    ()\  /   _.'
   \  -'-     ,; '. <
    ;.__     ,;|   > \
   / ,    / ,  |.-'.-'
  (_/    (_/ ,;|.<`
    \    ,     ;-`
     >   \    /
    (_,-'`> .'
          (_,'
 */
package chapter6_14;


public class Chapter6_14 {

    public static double m(int n){
            double pi = 0;
            double term;                                      
            
            for (int i = 1; i <= n; i++){                           //method: solvig for pi using (-1)^i+1/2*i-1 equaion
               term = 4.0 * (Math.pow(-1, i+1)/((2*i)-1)); 
               pi += term;
            }
            return pi;
}
                   
    
    public static void main(String[] args) {
     
        
        System.out.println("i\t\tm(i)");            //prints a table going increments of 100 starting at 1 to 901
        for(int i=1 ;i <=901;i+=100){
        System.out.println(i + "\t\t" + m(i));
    }
        
    }
    
}
