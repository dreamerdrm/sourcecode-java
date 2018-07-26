import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

    @Test
    public void test() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(2);
        assertEquals("2", result);
    }
    
    @Test
    public void testPrimeOfThree() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(3);
        assertEquals("3", result);
    }
    
    @Test
    public void testPrimeOfFour() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(4);
        assertEquals("22", result);
    }
    
    @Test
    public void testPrimeOfFive() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(5);
        assertEquals("5", result);
    }
    
    @Test
    public void testPrimeOfSix() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(6);
        assertEquals("23", result);
    }
    
    @Test
    public void testPrimeOfEight() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(8);
        assertEquals("222", result);
    }
    
    @Test
    public void testPrimeOfTen() {
        PrimeFactor p = new PrimeFactor();
        String result = p.of(10);
        assertEquals("25", result);
    }

}
