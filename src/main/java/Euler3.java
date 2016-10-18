import java.util.ArrayList;

public class Euler3 extends Euler {
    /*
    The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
     */

    @Override
    public String run() {
        long theNumber = 600851475143L;

        ArrayList<Long> factors = new ArrayList<Long>();
        long d = 2;

        while(theNumber > 1) {
            while (theNumber % d == 0){
                factors.add(d);
                theNumber /= d;
            }
            d += 1;

            if(d*d > theNumber){
                if(theNumber > 1) factors.add(theNumber);
                break;
            }
        }

        return String.valueOf(factors.get(factors.size()-1));
    }
}
