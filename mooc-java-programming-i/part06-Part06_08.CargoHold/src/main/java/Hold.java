
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
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int minWeight;
    
    public Hold(int maxWeight){
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.minWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        
        if (this.minWeight + suitcase.totalWeight() <= this.maxWeight ) {
            this.minWeight += suitcase.totalWeight();
            this.suitcases.add(suitcase);
        }
        
    }
    
    public void printItems(){
     
      for(Suitcase suitcase: suitcases){
          suitcase.printItems();
      }
       
    }
    
    public String toString(){
        
        return suitcases.size() + " suitcases " + "(" + this.minWeight + "kg" + ")";
    }
    
}
