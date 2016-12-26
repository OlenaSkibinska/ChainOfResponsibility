/**
 * Created by cs.ucu.edu.ua on 12/26/2016.
 */
public class Main {
    public static void main(String[] args){
        Dollar10Dispenser d10 = new Dollar10Dispenser();
        Dollar20Dispenser d20 = new Dollar20Dispenser();
        Dollar50Dispenser d50 = new Dollar50Dispenser();
        d50.setNext(d20);
        d20.setNext(d10);
        d50.getAmount(new Currency(130));

    }
    }

