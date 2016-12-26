/**
 * Created by cs.ucu.edu.ua on 12/6/2016.
 */
public class Dollar10Dispenser extends Dispenser{

    public void getAmount(Currency currency){
        int amount = currency.getMoney();
        System.out.println("Got " + amount/10 + " of dollars.");
    }
}
