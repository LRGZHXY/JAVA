import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a, b)->Integer.compare(a[0],b[0]));
        int count=1;
        for(int i=0;i<points.length-1;i++){
            if(points[i+1][0]>points[i][1]){
                count++;
            }else{
                points[i+1][1]=Math.min(points[i][1],points[i+1][1]);
            }
        }
        return count;
    }
}
