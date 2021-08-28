import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;



public class SortingTest {

    @Test
    public void testNormal(){
        Sorting sorting = new Sorting();
        int [] adverse = {5,4,3,2,1};//翻转顺序
        int [] adverseOut = {1,2,3,4,5};
        int [] random = {4,1,3,2,5};//随机排列
        int [] randomOut = {1,2,3,4,5};
        int [] repeat = {5,4,3,3,2,1};//存在重复值
        int [] repeatOut = {1,2,3,3,4,5};
        assertTrue(Arrays.equals(adverse,adverseOut),"For array \"" + Arrays.toString(adverseOut) + "\", but got '" + Arrays.toString(Sorting.poping(adverse)) + "'");
        assertTrue(Arrays.equals(random,randomOut),"For array \"" + Arrays.toString(randomOut) + "\",  but got '" + Arrays.toString(Sorting.poping(repeatOut)) + "'");
        assertTrue(Arrays.equals(repeat,repeatOut),"For array \"" + Arrays.toString(repeatOut) + "\",  but got '" + Arrays.toString(Sorting.poping(repeatOut)) + "'");
    }



}
