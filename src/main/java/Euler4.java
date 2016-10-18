import java.util.ArrayList;

public class Euler4 extends Euler {
    /*
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

     */
    @Override
    public String run() {
        ArrayList<Integer> palindromes = new ArrayList<Integer>();

        int max = 0;
        for(int a = 100; a<1000; a++){
            for(int b = 100; b<1000; b++){
                if(isPalindrome(a,b) && a*b > max)  max = a*b;//palindromes.add(a*b);
            }
        }

        return String.valueOf(max);
    }

    private boolean isPalindrome(int a, int b) {
        StringBuilder theNumber = new StringBuilder(String.valueOf(a*b));
        StringBuilder reverse = new StringBuilder(theNumber).reverse();

        if(theNumber.toString().equals(reverse.toString())) {
            return true;
        }
        return false;
    }
}
