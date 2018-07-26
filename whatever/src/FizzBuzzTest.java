import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void oneShow1() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(1);
        assertEquals("1", result);
    }
    
    @Test
    public void twoShow2() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(2);
        assertEquals("2", result);
    }
    
    @Test
    public void threeShowFizz() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(3);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void fourShow4() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(4);
        assertEquals("4", result);
    }
    
    @Test
    public void fiveShowBuzz() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(5);
        assertEquals("Buzz", result);
    }
    
    @Test
    public void sixShowFizz() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(6);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void sevenShow7() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(7);
        assertEquals("7", result);
    }
    
    @Test
    public void eightShow8() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(8);
        assertEquals("8", result);
    }
    
    @Test
    public void nineShowFizz() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(9);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void tenShowBuzz() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(10);
        assertEquals("Buzz", result);
    }
    
    @Test
    public void elevenShow11() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(11);
        assertEquals("11", result);
    }
    
    @Test
    public void twelveShowFizz() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(12);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void thirteenShow13() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(13);
        assertEquals("13", result);
    }
    
    @Test
    public void fourteenShow14() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(14);
        assertEquals("14", result);
    }
    
    @Test
    public void fifteenShowFizzBuzz() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(15);
        assertEquals("FizzBuzz", result);
    }
    
    @Test
    public void sixteenShow16() {
        FizzBuzz fz = new FizzBuzz();
        String result = fz.sendAndReturn(16);
        assertEquals("16", result);
    }
}
