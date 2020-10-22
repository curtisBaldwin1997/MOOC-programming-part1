
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
public class Birds {
    
    
    private String name;
    private String latin;
    private int count;
    public Birds(String birdName, String latinName){
       
        this.name = birdName;
        this.latin = latinName;
        this.count = 0;
    }
    
    public String getName(){
        return this.name;
    }
    public String getLatin(){
        return this.latin;
    }
    
    public int getCount(){
        return this.count;
    }
    
     public void observations() {
        this.count++;
    }
    
    
    @Override
    public String toString() {
        return this.name + " (" + this.latin + "): " + this.count + " observations";
    }

    
   
    
}
