
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {

        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        Money newMoney = new Money(newEuros, newCents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        // Money comapredMoney = new Money(euros, cents);
        double thisTotal = this.euros + this.cents / 100.0;
        double compareTotal = compared.euros() + compared.cents() / 100.0;
        return thisTotal < compareTotal;
    }

    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros();
        int newCents = this.cents - decreaser.cents();
        //int minus = newEuros - newCents;
        if (newCents < 0) {
            newCents += 100;
            newEuros -= 1;

        }
        if (newEuros < 0) {
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
        Money reducedTotal = new Money(newEuros, newCents);
        return reducedTotal;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
