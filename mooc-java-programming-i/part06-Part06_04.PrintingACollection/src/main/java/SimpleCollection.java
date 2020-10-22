
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;
    private int count;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
        this.count = 0;
    }

    public void add(String element) {
        this.elements.add(element);
        count++;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        
        if(getElements().isEmpty()){
           return "The collection "+ this.name + " is empty.";
        }
        
        String listOfElements = "";
        for(String element: this.elements){
            if(count <=1){
           listOfElements = listOfElements + element;
            } else {
                listOfElements = listOfElements + element + "\n";
            }
        }
        
        if(count <= 1){
            return "The collection " + this.name +  " has " + count + " element:" + "\n" + listOfElements ;
        } 
        return "The collection " + this.name +  " has " + count + " elements:" + "\n" + listOfElements  ;
    }
    
}
