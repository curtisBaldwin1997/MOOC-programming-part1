
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest(){
      //  int count = 0;
        if(this.elements.isEmpty()){
            return null;
        }
        String returnObj = this.elements.get(0);
        for(String longest: this.elements){
            if(returnObj.length() < longest.length()){
                returnObj = longest;
            }
        }
        return returnObj;
    }
}
