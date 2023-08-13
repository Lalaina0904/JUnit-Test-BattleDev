import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BattleDevTest {
    @Test
    public void testSumIntervals() {
        int[][] intervallistes = { { 1, 5} };
        int expectedResult = 4;
        int result = BattleDevAlgo.IntervalUtils.sumIntervals(intervallistes);

        assertEquals(expectedResult, result);


    }
    @Test
    public void testSumIntervals2() {
        int[][] intervallistes = { {1, 4} , {7, 10}, {3,5}};
        int expectedResult = 7;

        int result =BattleDevAlgo.IntervalUtils.sumIntervals(intervallistes);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testSumIntervals3() {
        int[][] intervallistes = { {1, 5} , {12, 15}, {3,10},{13,18}};
        int expectedResult = 15;

        int result =BattleDevAlgo.IntervalUtils.sumIntervals(intervallistes);

        assertEquals(expectedResult, result);
    }
}
