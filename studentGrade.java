public class studentGrade {
    private double Quiz1;
	private double Quiz2;
	private double Midterm;
	private double Final;
	private double totalScore;
	private char   letterGrade;

	public studentGrade()             //default constructor
	 {
		Quiz1=0;
		Quiz2=0;
		Midterm=0;
		Final=0;
		totalScore=0;
		letterGrade=0;
     }
    public studentGrade(double Q1, double Q2, double Mt, double F, double tS, char x)   //constructor with parameters
     {
		 Quiz1=Q1;
		 Quiz2=Q2;
		 Midterm=Mt;
		 Final=F;
		 totalScore=tS;
		 letterGrade=x;
     }

    public void setQuiz1(double Q1)               //setting the quiz1 grade
     {
		Quiz1=Q1;
     }
    public void setQuiz2(double Q2)        //setting the quiz2 grade
	 {
	 	Quiz2=Q2;
     }
    public void setMidterm(double Mt)       //setting the Midterm grade
     {
		Midterm=Mt;
     }
    public void setFinal(double F)       //setting the Final grade
     {
		 Final=F;
     }
    public void settotalScore(double tS)
     {
		 totalScore=tS;
     }
    public void setletterGrade(char x)
     {
		 letterGrade=x;
     }
    public double getQuiz1()       //getting quiz1 grade
     {
		 return Quiz1;
	 }
	 public double getQuiz2()        //getting quiz2 grade
     {
		 return Quiz2;
	 }
     public double getMidterm()
     {
		 return Midterm;             //returning the value of midterm
     }
    public double getFinal()
     {
		 return Final;
     }
    public double gettotalScore()
     {
		 return totalScore;           //returning the value of totalScore
     }
     public char getletterGrade()
     {
		 return letterGrade;
     }
     public void computetotalScore()        //calculating the total score of the input grades
     {
	  totalScore=((.5)*Final)+((.25)*Midterm)+((Quiz1 + Quiz2) /2 /10 * 100 *.25);
     }
     public void printletterGrade()                          //comparing the letter grades
     {
		 if(totalScore>=90 && totalScore<=100)
		    letterGrade='A';
		 if(totalScore>=80 && totalScore<=89)
		    letterGrade='B';
		 if(totalScore>=70 && totalScore<=79)
		    letterGrade='C';
		 if(totalScore>=60 && totalScore<=69)
		    letterGrade='D';
		 if(totalScore<60)
		    letterGrade='F';

   }
}
 

