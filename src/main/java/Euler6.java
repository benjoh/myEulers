
public class Euler6 extends Euler {
    /*
    The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
     */
    @Override
    public String run() {
        int sum = 1;
        int sumsquare = 1;

        for(int i = 2; i<= 100; i++){
            sum += i*i;
            sumsquare += i;
        }

        sumsquare *= sumsquare;
        int diff = sumsquare - sum;

        return String.valueOf(diff);
    }
}
