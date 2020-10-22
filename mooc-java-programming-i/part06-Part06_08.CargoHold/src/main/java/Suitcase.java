
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
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;
    private int minWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.minWeight = 0;
    }

    public void addItem(Item item) {

        if (this.minWeight + item.getWeight() <= this.maxWeight ) {
            this.minWeight += item.getWeight();
            this.items.add(item);
        }
    }

    public void printItems() {
        for(Item item: items){
            System.out.println(item);
        }
        
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
            // totalWeight++;
        }
        return totalWeight;
    }
    public Item heaviestItem(){
        //int heaviest = 0;
        Item newItem = new Item("", 0);
        if(this.items.isEmpty()){
            return null;
        }
        for(Item item : this.items){
            
            if(newItem.getWeight() < item.getWeight()){
                newItem = item;
            }
        }
        return newItem;
    }

    public String toString() {

        if (items.size() == 0) {
            return items.size() + " no items" + "(" + this.minWeight + " kg" + ")";
        } else if (items.size() == 1) {
            return items.size() + " item" + "(" + this.minWeight + " kg" + ")";
        } else {
            return items.size() + " items" + "(" + this.minWeight + " kg" + ")";
        }

    }

}
