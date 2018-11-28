/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testRoll() {
        Library classUnderTest = new Library();
        int n = 8;
        int[] resultArr = classUnderTest.roll(n);
        assertEquals(n, resultArr.length);
    }

    @Test public void testContainsDuplicates() {
        Library classUnderTest = new Library();
        int[] testArr = {3, 4, 5, 6, 7, 8, 8};
        boolean containsDuplicates = classUnderTest.containsDuplicates(testArr);
        assertTrue("should return true", containsDuplicates);
    }

    @Test public void testAverageFinder() {
        Library classUnderTest = new Library();
        int[] testArr = {3, 4, 5, 6, 7, 8, 8};
        double avgExpected = 41.0 / 7;

        double avg = classUnderTest.averageFinder(testArr);
        assertEquals(avgExpected, avg, 0.0);
    }

    @Test public void testArrayOfArrays() {
        Library classUnderTest = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {1, 2, 3, 4, 5, 6, 7}
        };

        int[] expectedArr = {1, 2, 3, 4, 5, 6, 7};

        int[] resultArr  = classUnderTest.arrayOfArrays(weeklyMonthTemperatures);
        assertArrayEquals(expectedArr, resultArr);
    }
}
