
import java.util.Scanner;

public class Main {

    public static void main(String[] agrs) {
//part 1
        // holds letter grade
        char grade;

        // Setting Scanner input

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score: ");
        double score = scanner.nextDouble();


        if ( score >= 90 ) {
            grade = 'A';
        } else if ( score >= 80 ) {
            grade = 'B';
        } else if ( score >= 70 )  {
            grade = 'C';
        } else if ( score >= 60 ) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is " + grade);
    }
}
// Part 2 switch statement
 switch (score){
         case 'A':
         System.out.println( "Grade A >= 90");
         break;

         case 'B':
         System.out.println( "Grade B >= 80");
         break;

         case 'C':
         System.out.println( "Grade C >= 70");
         break;

         case 'D':
         System.out.println( "Grade D >= 60");
         break;

default:
        System.out.println( "Grade F >= 50");
        break;

//  Part 3 create nested if statement

    int x == 4
    if (x == 5){
    system.out.println("x must be 4");
    } else {
        system.out.println("x is not 4");
        }
       System.out.println ("this runs even if it does happen")
        }
