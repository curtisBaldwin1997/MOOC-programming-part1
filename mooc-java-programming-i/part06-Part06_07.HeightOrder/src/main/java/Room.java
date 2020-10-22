
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
public class Room {
    private ArrayList<Person> people;
    public Room(){
        this.people = new ArrayList<>();
    }
    
    public void add(Person person){
        people.add(person);
    }
    
    public boolean isEmpty(){
        if(people.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        
       // for(Person persons: people){
       //     System.out.println(persons);
       // }
        return people;
    }
    
    public Person shortest(){
        if(this.people.isEmpty()){
            return null;
        }
        
        Person returnShortest = this.people.get(0);
        
        for(Person shortest: this.people){
            if(returnShortest.getHeight() > shortest.getHeight()){
                returnShortest = shortest;
            }
        }
        return returnShortest;
    }
    
    public Person take(){
        if(this.people.isEmpty()){
            return null;
        }
       Person take = shortest();
       this.people.remove(take);
        
        return take;
    }
}
