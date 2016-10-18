import com.google.common.io.Resources;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

import static junit.framework.Assert.assertTrue;

public class Euler1Test {

    @Test
    public void testEuler1MultiplesOf3And5(){
        Euler euler = new Euler1();

        String answer = euler.run();

        assertTrue(answer != null);
        assertTrue(answer.equals(233168));

        System.out.println(answer);
    }

    @Test
    public void testEuler2EvenFibonacci(){
        Euler euler = new Euler2();

        String answer = euler.run();

        assertTrue(answer != null);
        assertTrue(!answer.equals("0"));
        assertTrue(answer.equals("4613732"));
        System.out.println(answer);
    }

    @Test
    public void testEuler3LargestPrime(){
        Euler euler = new Euler3();

        String answer = euler.run();

        assertTrue(answer != null);
        assertTrue(!answer.equals("0"));
        assertTrue(answer.equals("6857"));
        System.out.println(answer);
    }

    @Test
    public void testEuler4LargestPalindrome(){
        Euler euler = new Euler4();

        String answer = euler.run();

        assertTrue(answer != null);
        assertTrue(!answer.equals("0"));
       //assertTrue(answer.equals("6857"));
        System.out.println(answer);
    }

    @Test
    public void testEuler5SmallestMultiple(){
        Euler euler = new Euler5();

        String answer = euler.run();

        assertTrue(answer != null);
        assertTrue(!answer.equals("0"));
        //assertTrue(answer.equals("6857"));
        System.out.println(answer);
    }

    @Test
    public void testEuler6SumSquareDiff(){
        Euler euler = new Euler6();

        String answer = euler.run();

        assertTrue(answer != null);
        assertTrue(!answer.equals("0"));
        //assertTrue(answer.equals("2640"));
        System.out.println(answer);
    }

    @Test
    public void testEuler71001Primes(){
        Euler euler = new Euler7();

        String answer = euler.run();

        assertTrue(answer != null);
        assertTrue(!answer.equals("0"));
        //assertTrue(answer.equals("2640"));
        System.out.println(answer);
    }

    @Test
    public void testEulerLargestProductInSeries() throws IOException {
        URL resource = Resources.getResource("euler8Input.txt");
       /* Resources.getResource();*/
        Euler euler = new Euler8(Resources.toString(resource, Charset.defaultCharset()));
        String answer = euler.run();

        System.out.println(answer);
    }
}
