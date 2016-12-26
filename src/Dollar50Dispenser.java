/**
 * Created by cs.ucu.edu.ua on 12/6/2016.
 */
public class Dollar50Dispenser extends Dispenser{

    public void getAmount(Currency currency){
        int amount = currency.getMoney();
       next.getAmount(new Currency(amount % 50));
        System.out.println("Got " + amount/50 + " of 50 dollars.");
    }
}

