import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Euler8 extends Euler {
    String input;

    public Euler8(String s) {
        input = s;
    }

    @Override
    public String run() {
        BigInteger prod = new BigInteger(String.valueOf(0));
        for(int i = 0; i < input.length()-13; i++)
        {

            List<Integer> thirteenNums = new ArrayList<Integer>();
            for (int j = 0; j <13;j++){
                int numericValue = Character.getNumericValue(input.charAt(j+i));

                if(numericValue == 0){
                    i+=j;
                    break;
                }else {
                    thirteenNums.add(numericValue);
                }
            }

            if(thirteenNums.size() == 13){
                BigInteger tmpProd =  new BigInteger("1");

                for(Integer integer : thirteenNums){
                    tmpProd = tmpProd.multiply(new BigInteger(String.valueOf(integer.intValue())));
                }

                if(tmpProd.compareTo(prod) >= 0) prod = tmpProd;
            }
        }

        return String.valueOf(prod);
    }
}
