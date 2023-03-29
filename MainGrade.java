import java.util.Scanner;

public class MainGrade {
    public static void main(String[] args)
    {
         Scanner scan = new Scanner(System.in); 
         studentGrade Mark=new studentGrade();      //declaring instance variables

         double Quiz1;
         double Quiz2;
         double Midterm;
         double Final;
         char letterGrade=0;
 
 
   Mark.getQuiz1();                                              //getting quiz1 grade from user input
   System.out.print("Enter the quiz score between 0 and 10: ");
   Quiz1=scan.nextDouble();
 
   Mark.getQuiz2();                                                 //getting quiz2 grade from user input
   System.out.print("Enter the quiz score between 0 and 10: ");
   Quiz2=scan.nextDouble();
 
   Mark.getMidterm();                                                 //getting midterm grade from user input
   System.out.print("Enter the Midterm grade between 0 and 100: ");
   Midterm=scan.nextDouble();
 
   Mark.getFinal();                                                     //getting Final grade from user input
   System.out.print("Enter the Final grade between 0 and 100: ");
   Final=scan.nextDouble();
   System.out.println();
 
   Mark.setQuiz1(Quiz1);                  //setting quiz1 grade
   System.out.println("Quiz1: " +Quiz1);
 
   Mark.setQuiz2(Quiz2);                   //setting the quiz2 grade
   System.out.println("Quiz2: " +Quiz2);
 
   Mark.setMidterm(Midterm);           //setting the Midterm
   System.out.println("Midterm: " +Midterm);
 
   Mark.setFinal(Final);          //setting the Final grade
   System.out.println("Final: " +Final);
   System.out.println();
 
   Mark.computetotalScore();            //getting and printing the total score
   System.out.print("Total Score: " );
   System.out.print(Mark.gettotalScore());
   System.out.println();
 
   Mark.printletterGrade();             //printing letter grade
   System.out.print("Letter Grade: " +letterGrade);
   System.out.print(Mark.getletterGrade());
   System.out.println();
   System.out.println();
 
   }
 }      

