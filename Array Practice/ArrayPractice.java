public class ArrayPractice
{
    public static void main (String [] args)
    {
         double [] testScores; //declaring an array 
         testScores = new double [5]; //instantiating the array of size 5
         testScores[0] = 68;
         testScores[1] = 89;
         testScores[2] = 94;
         testScores[3] = 34;
         double sum = 0;
         for (int i = 0; i < testScores.length-1; i++)
         {
             System.out.print (testScores[i] + " ");
             sum = sum + testScores[i];
     
         }
         double average = sum/testScores.length;
         System.out.println(" ");
    
         boolean [] answers = {true, true, false, false};
         //printing out answers in backwards order
         for (int i = answers.length-1; i>=0; i--)
         {
             System.out.print(answers[i] + " ");
         }
         String [] answerKey = new String [4];
         answerKey[0] = "A";
}
}
