import org.junit.Test;

import static org.junit.Assert.*;

public class DivideTest {
    static Divide d = new Divide(5,10);
    static Divide d1 = new Divide(4,10);
    static Divide d3 = new Divide(12,16);
    static Divide d2 = new Divide(0,5);

    @Test
    public void DivideTest(){
        //Divide d3 = new Divide(5,0);
        assertTrue(d.divides());
        assertFalse(d1.divides());
        assertFalse(d2.divides());
    }

    @Test
    public void FactorTest(){
        d.factor();
        assertEquals(2,d.factor());
    }

    @Test
    public void CommondivsorTest(){
        System.out.print(d3.commondivisor());
    }
}