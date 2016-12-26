/**
 * Created by cs.ucu.edu.ua on 12/6/2016.
 */
public abstract class Dispenser {
   protected Dispenser next;
    public void  setNext(Dispenser next){
        this.next = next;
    }
    public abstract void getAmount(Currency currency);


}
