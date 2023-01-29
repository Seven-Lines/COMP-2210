package Assignment_1;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SelectorTest { 
    @Test 
    public void testMin_9(){
        int[] a = {1, 1, 1, 3, 7, 1, 9, 5, 9, 9, 9};
        int expected = 1; 
        int actual = Selector.min(a);
        assertEquals(expected, actual);
    }

    @Test
    public void testMax_9(){ 
        int[] a = {1, 1, 1, 3, 7, 1, 9, 5, 9, 9, 9};
        int expected = 9; 
        int actual = Selector.max(a);
        assertEquals(expected, actual);
    }

    @Test 
    public void testKMin_7(){ 
        int[] a = {3, 7, 1, 9, 5}; int k = 1;
        int expected = 1; 
        int actual = Selector.kmin(a, k);
        assertEquals(expected, actual);
    }

    @Test 
    public void range(){ 
        int[] a = {3, 7, 1, 9, 5}; 
        int low = 1; int high = 9;
        int expected = 1; 
        int actual = Selector.kmin(a, k);
        assertEquals(expected, actual);
    }
}              
