import java.util.Arrays;
import java.util.Comparator;

public class BattleDevAlgo {
    public class IntervalUtils {
        public static int sumIntervals(int[][] intervals) {
            Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

            int totalLength = 0;
            int[] currentInterval = intervals[0];

            for (int i = 1; i < intervals.length; i++) {
                int[] interval = intervals[i];

                if (interval[0] <= currentInterval[1]) {
                    currentInterval[1] = Math.max(currentInterval[1], interval[1]);
                } else {
                    totalLength += currentInterval[1] - currentInterval[0];
                    currentInterval = interval;
                }
            }

            totalLength += currentInterval[1] - currentInterval[0];

            return totalLength;
        }
        public static void main(String[] args) {
            int[][] intervals = {{1, 5}, {12, 15}, {3, 10}, {13, 18}};
            System.out.println(sumIntervals(intervals));
        }
    }
}
