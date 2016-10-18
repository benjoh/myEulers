public class Euler5 extends Euler {

    /*
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */
    @Override
    public String run() {
        int theNumber = 20;
        boolean divisible = false;

        while(!divisible && theNumber < 1000000000){
            if(theNumber % 2 == 0){
                divisible = true;
                for(int i = 3; i<=20; i++){
                    if(!(theNumber % i == 0)) {
                        divisible = false;
                        break;
                    }
                }
            }

            if(!divisible) theNumber++;
        }

        return String.valueOf(theNumber);
    }
}
