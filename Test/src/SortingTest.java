import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;



public class SortingTest {

    @Test
    public void testNormal(){
        Sorting sorting = new Sorting();
        int [] adverse = {10,2};//翻转顺序
        int [] adverseOut = {10,2};
        int [] random = {3,30,34,5,9};//随机排列
        int [] randomOut = {30,3,34,5,9};
        assertTrue(Arrays.equals(adverse,adverseOut),"For array \"" + Arrays.toString(adverseOut) + "\", but got '" + Arrays.toString(Sorting.poping(adverse)) + "'");
        assertTrue(Arrays.equals(random,randomOut),"For array \"" + Arrays.toString(randomOut) + "\",  but got '" + Arrays.toString(Sorting.poping(randomOut)) + "'");
    }



}
