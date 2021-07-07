import org.junit.Test;

import static org.junit.Assert.*;

public class GCDTest {
    GCD gcd = new GCD(5,10);
    GCD gcd1 = new GCD(12,16);
    GCD gcd2 = new GCD(5,37);

    @Test
    public void dumbGCDtest(){
        assertEquals(5,gcd.dumbGCD());
        assertEquals(4,gcd1.dumbGCD());
        assertEquals(1,gcd2.dumbGCD());
    }

    @Test
    public void normalGCDtest(){
        assertEquals(5,gcd.euclideanGCD());
        assertEquals(4,gcd1.euclideanGCD());
        assertEquals(1,gcd2.euclideanGCD());
    }

}