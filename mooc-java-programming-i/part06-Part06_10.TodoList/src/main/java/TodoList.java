
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
public class TodoList {
    private ArrayList<String> words;
    
    public TodoList(){
        this.words = new ArrayList<>();
    }
    
    public void add(String task){
        this.words.add(task);
    }
    
    public void print(){
        for(String word: words){
            int index = words.indexOf(word) + 1;
            System.out.println(index + ": " + word);
        }
        
    }
    
    public void remove(int number){
       // int remove = number  +1;
        words.remove(number -1);
    }
    
}
