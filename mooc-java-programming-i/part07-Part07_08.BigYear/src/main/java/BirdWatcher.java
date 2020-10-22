
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
public class BirdWatcher {
    
  private ArrayList<Birds> birdsDatabase;

    public BirdWatcher() {
        this.birdsDatabase = new ArrayList<Birds>();
    }

    public void add(String name, String nameInLatin) {
        Birds bird = new Birds(name, nameInLatin);
        this.birdsDatabase.add(bird);
    }

    public void addObservation(String name) {
        for (Birds bird : birdsDatabase) {
            if (bird.getName().equalsIgnoreCase(name) || bird.getLatin().equalsIgnoreCase(name)) {
                bird.observations();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void printAll() {
        for (Birds bird : birdsDatabase) {
            System.out.println(bird.toString());
        }
    }

    public void printOneBird(String name) {
        for (Birds bird : birdsDatabase) {
            if (bird.getName().equalsIgnoreCase(name) || bird.getLatin().equalsIgnoreCase(name)) {
                System.out.println(bird.toString());
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    }
