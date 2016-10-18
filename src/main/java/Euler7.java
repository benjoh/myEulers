import java.util.ArrayList;
import java.util.List;

public class Euler7 extends Euler {
    @Override
    public String run() {
        List<Long> longArrayList = new ArrayList<Long>();

        long number = 2;
        while(longArrayList.size() < 1001){
            if(isPrime(number)) {
                longArrayList.add(number);
            }

            number++;
        }

        return String.valueOf(longArrayList.size()-1);
    }

    private boolean isPrime(long number) {

        return true;
    }
}
