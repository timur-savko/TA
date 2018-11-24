import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TriangleTest {

    @Test
    public void isTriangleExistWithCorrectSideLengths() {

        int a = 3;
        int b = 3;
        int c = 3;

        assertTrue(Triangle.exists(a, b, c));
        assertTrue(Triangle.exists(b, c, a));
        assertTrue(Triangle.exists(c, a, b));
    }

    @Test
    public void isTriangleNotExistWithIncorrectSideLengths() {

        int a = 6;
        int b = 2;
        int c = 3;

        assertFalse(Triangle.exists(a, b, c));
        assertFalse(Triangle.exists(b, c, a));
        assertFalse(Triangle.exists(c, a, b));
    }

    @Test
    public void isTriangleNotExistIfOneSideLengthLessThan0() {

        int a = 3;
        int b = 4;
        int c = -5;

        assertFalse(Triangle.exists(a, b, c));
        assertFalse(Triangle.exists(b, c, a));
        assertFalse(Triangle.exists(c, a, b));
    }

    @Test
    public void isTriangleNotExistIfSideLengthsLessThan0() {

        int a = -3;
        int b = -4;
        int c = -5;

        assertFalse(Triangle.exists(a, b, c));
        assertFalse(Triangle.exists(b, c, a));
        assertFalse(Triangle.exists(c, a, b));
    }

    @Test
    public void isTriangleNotExistWhenOneSideEqualsToSumOfTwoOther() {

        int a = 5;
        int b = 3;
        int c = 8;

        assertFalse(Triangle.exists(a, b, c));
        assertFalse(Triangle.exists(b, c, a));
        assertFalse(Triangle.exists(c, a, b));
    }

    @Test
    public void isTriangleNotExistWhenOneSideEqualsTo0() {

        int a = 0;
        int b = 3;
        int c = 8;

        assertFalse(Triangle.exists(a, b, c));
        assertFalse(Triangle.exists(b, c, a));
        assertFalse(Triangle.exists(c, a, b));
    }

    @Test
    public void isTriangleNotExistWhenSideLengthsEqualTo0() {

        int a = 0;
        int b = 0;
        int c = 0;

        assertFalse(Triangle.exists(a, b, c));
    }

    @Test
    public void isTriangleNotExistWhenTwoSideLengthsEqualTo0() {

        int a = 0;
        int b = 0;
        int c = 10;

        assertFalse(Triangle.exists(a, b, c));
        assertFalse(Triangle.exists(b, c, a));
        assertFalse(Triangle.exists(c, a, b));
    }

    @Test
    public void isTriangleExistWhenSideLengthsAreTooBigNumbers() {

        int a = Integer.MAX_VALUE - 3;
        int b = Integer.MAX_VALUE - 4;
        int c = Integer.MAX_VALUE - 5;

        assertTrue(Triangle.exists(a, b, c));
        assertTrue(Triangle.exists(b, c, a));
        assertTrue(Triangle.exists(c, a, b));
    }

    @Test
    public void isTriangleExistWhenSideLengthsEqualToMaxValue() {

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;

        assertTrue(Triangle.exists(a, b, c));
    }

}
