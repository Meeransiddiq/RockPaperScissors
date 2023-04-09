import java.util.random.*;
import java.util.Scanner;
public class Rock_Paper_ScissorsGame {
    public static void main(String[] args) {
             int computer_Input;
             String user_Input;
        System.out.print("Enter Your Choice What You choose From ROCK , PAPER Or SCISSOR : ");
                   Scanner sc =new Scanner (System.in);
                   user_Input =sc.next();
                   RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
                   computer_Input=g.nextInt(1,3);
                   String user_Choice = user_Input;
                   int computer_Choice = computer_Input;
               //   System.out.println(user_Choice);
               //   System.out.println(computer_Choice);

                   if ((user_Choice == "rock")&&(computer_Choice == 1)){                                      // No assignment is not using in conditionals
                       System.out.println("Tie ! Both Choose Rock");                                          // for computer 1 for rock for all according to me.
                   } else if ((user_Choice == "rock")&&(computer_Choice==2)) {
                       System.out.println("Computer Win ! It Choose paper and You Choose Rock");             //for computer 2 for paper for all according to me.
                   } else if ((user_Choice == "rock")&&(computer_Choice ==3)) {
                       System.out.println("You Win ! Computer Choose Scissors and You Choose Rock");       // for computer 3 for scissors for all according  to me.
                   }
                }
            }
            
