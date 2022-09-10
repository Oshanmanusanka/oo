import java.util.Scanner;

/**
 * Write a description of class StudentMarks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentMarks
{
  public static void main(String[] args){
      
      
      System.out.println("Enter The Unit Name : ");
      String unitName = (new Scanner(System.in)).nextLine();
      
      //marks array will save all marks
      double[] marks = new double[25];
      
      //get all marks as user inputs
      int i = 0;
      while(i < 25){
            
            System.out.println("Enter Student(" + (i+1) + ")'s mark : ");
            marks[i] = (new Scanner(System.in)).nextDouble();
            
            if(marks[i] > 0 && marks[i] < 100){
                i++;
            }else{
                System.out.println("Please Enter a Valid Mark between 0 and 100");
            }
      
        }
      
      //print details  
      StudentMarks.print(marks , unitName);
      
      //find minimum marks
      double min = StudentMarks.findMin(marks);
      System.out.println("Minimum of marks : " + min);
      
      //find maximum marks
      double max = StudentMarks.findMax(marks);
      System.out.println("Maximum of marks : " + max);
      
      //Find mean of marks
      double mean = StudentMarks.calMean(marks);
      System.out.println("Mean of marks : " + mean);
      
      //Find standard deviation of marks
      double sd = StudentMarks.calSD(marks);
      System.out.println("Standard Deviation of marks : " + sd);
      
      
  }

    
  public static void print(double[] marks , String unit){
      System.out.println("Unit Name = " + unit);
      
      for(double mark : marks){
            System.out.println(mark);
        }
    }
    
  public static double findMax(double[] marks) {
      double max = 0;
      
      for(double mark : marks) {
            if(mark>max) {
            max = mark;
         }
      }
      //System.out.println("Minimum of marks : " + min);
      return max;
   }  
   
   public static double findMin(double[] marks) {
      double min = marks[0];
     
      for(double mark : marks) {
            if(mark<min) {
            min = mark;
         }
      }
      //System.out.println("Maximum of marks : " + max);
      return min;
    }   
    
   
   public static double calMean(double marks[]){
        double sum = 0.0;
        int length = marks.length;

        for(double mark : marks) {
            sum += mark;
        }

        double mean = sum/length;
        //System.out.println("Mean of marks : " + mean);
        return mean;
   }

    
   public static double calSD(double marks[])
    {
        double sum = 0.0, sd = 0.0;
        int length = marks.length;

        for(double mark : marks) {
            sum += mark;
        }

        double mean = sum/length;

        for(double mark: marks) {
            sd += Math.pow(mark - mean, 2);
        }
        
        sd = Math.sqrt(sd/length);
        //System.out.println("Standard Deviation of marks : " + sd);
        return sd;
    } 
}
