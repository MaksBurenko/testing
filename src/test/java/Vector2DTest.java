import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {

    private final double EPS = 1e-9;
    private static Vector2D v1;

    @BeforeClass //создает тестами новый вектор
    public static void createNewVector(){
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength(){
        // assertion
        Assert.assertEquals(0, v1.length(), EPS);
        //                  ожидаемый   результат         точность для сравнения
        //                  результат   при выполнении    двух результатов
        //                              метода length
    }

    @Test
    public void newVectorShouldHaveZeroX (){
        Assert.assertEquals(0, v1.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY (){
        Assert.assertEquals(0, v1.getY(), EPS);
    }
}
