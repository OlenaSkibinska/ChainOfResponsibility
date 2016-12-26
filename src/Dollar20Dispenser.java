/**
 * Created by cs.ucu.edu.ua on 12/6/2016.
 */
public class Dollar20Dispenser extends Dispenser {

    public void getAmount(Currency currency){
        int amount = currency.getMoney();
        next.getAmount(new Currency(amount % 20));
        System.out.println("Got " + amount/20 + " of dollars.");
    }
}

