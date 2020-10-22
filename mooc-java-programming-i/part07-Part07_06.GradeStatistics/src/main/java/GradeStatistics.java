
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author curtis
 */
public class GradeStatistics {
    private ArrayList<Integer> values;
    
    
    public GradeStatistics(){
        this.values = new ArrayList<>();
        
    }
    public void addNumber(int number){
        if(number >= 0 && number <= 100){
        this.values.add(number);
        }
    } 
    public double printAverageValue(){
        int sum = 0;
        for(Integer num: this.values){
            sum+= num;
            
        }
        return (double) sum / this.values.size(); 
    }
    
     public double printAveragePassGrade(){
        double sumOfPassingPoints = 0.0;
        int countOfPassingPoints = 0;
        for (Integer point : this.values) {
            if (point >= 50) {
                sumOfPassingPoints += point;
                countOfPassingPoints++;
            }
        }
        if (countOfPassingPoints != 0) {
            return sumOfPassingPoints / countOfPassingPoints;
        }
        return 0.0;
    }
     public double passPercentageGrage(){
         int countOfPassingPoints = 0;
         for (Integer point : this.values) {
            if (point >= 50) {
                
                countOfPassingPoints++;
            }
        }
         return (double) 100 * countOfPassingPoints / this.values.size(); 
     }
     public int numberOfGrades(int grade) {
        int count = 0;
        for (Integer received : this.values) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
     
     public void pointsToGrade() {
        ArrayList<Integer> grade = new ArrayList<>();
        for (Integer point : this.values) {
            if (point < 50) {
                grade.add(0);
            } else if (point < 60) {
                grade.add(1);
            } else if (point < 70) {
                grade.add(2);
            } else if (point < 80) {
                grade.add(3);
            } else if (point < 90) {
                grade.add(4);
            } else {
                grade.add(5);
            }
        }
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + stars(grade,i));
        }
    }

    private String stars(ArrayList<Integer> grades, int number) {
        String star = "";
        for (Integer grade : grades) {
            if(grade==number) {
                star+="*";
            }
        }
        return star;
    }
   
     
    
    
}
