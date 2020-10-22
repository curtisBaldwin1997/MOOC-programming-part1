
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        
        
    }

    public void addNumber(int number) {
        number = this.sum + number;
        this.sum = number;
        this.count++;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
      //this.count = count + sum;
      return this.sum;
    }

    public double average() {
       if (this.count == 0) {
            return 0;
        } else {
            return (double) this.sum / this.count;
        }
    }
}
