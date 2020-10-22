
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author curtis
 */
public class UserInterface {

    private GradeStatistics statistics;
    private Scanner scanner;
    
    public UserInterface(GradeStatistics statistics, Scanner scanner) {
        this.statistics = statistics;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops");
        while (true) {
            
            String command = scanner.nextLine();
            if (command.equals("-1")) {
                break;
            }
            int number = Integer.valueOf(command);
            
            statistics.addNumber(number);
           //process(command);
           
           
        }
        
        printAverage();
        printAveragePassGrade();
        printPassPercentage();
        System.out.println("Grade distribution:");
        processPointsToGrade();
    }

    public void process(String command) {
        printAverage();
    }

    private void printAverage() {
       
        System.out.println("Point average (all): " + statistics.printAverageValue());
    }
    
    private void printAveragePassGrade() {
      if(statistics.printAveragePassGrade() > 0){
        System.out.println("Point average (passing): " + statistics.printAveragePassGrade());
      } else{
          System.out.println("Point average (passing): " + "-");
      }
    }
    private void printPassPercentage(){
        System.out.println("Pass percentage: " + statistics.passPercentageGrage());
    }
    
    //private void printGradeDistribution(){
    //    System.out.println("Grade distriubtion: ");
  //  }
     public void processPointsToGrade() {
        this.statistics.pointsToGrade();
    }

   
}
