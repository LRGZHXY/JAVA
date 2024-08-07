import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            return a[0] - b[0];
        });
        int count = 0;
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i+1][0] < intervals[i][1]) {
                count++;
                intervals[i+1][1] = Math.min(intervals[i][1], intervals[i+1][1]);
            }
        }
        return count;
    }
}
