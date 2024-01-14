import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> numberlist = new ArrayList<>();
        numberlist.add(10.0);
        numberlist.add(20.0);
        numberlist.add(30.0);
        numberlist.add(40.0);
        shuffle(numberlist);

        for(int i = 0; i < numberlist.size(); i ++){
            //Reminder: sout and tab for print line shortcut
            System.out.println(numberlist.get(i));
        }

    }

    static void shuffle(ArrayList<Double> numberlist){
        int n = numberlist.size();

        Random random = new Random();
        random.nextInt();

        for(int i = 0; i < n; i ++){
            Double helper = numberlist.get(i);

            int change = i + random.nextInt(n-i);

            numberlist.set(i, numberlist.get(change));
            numberlist.set(change, helper);
        }
    }
}