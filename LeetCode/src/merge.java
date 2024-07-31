import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result=new LinkedList<>();
        Arrays.sort(intervals,(a, b)->{
            return a[0]-b[0];
        });
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>end){
                result.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }else{
                end=Math.max(end,intervals[i][1]);
            }
        }
        result.add(new int[]{start,end});
        return result.toArray(new int[result.size()][]);
    }
}