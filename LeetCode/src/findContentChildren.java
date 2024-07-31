import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int i=s.length-1;
        for(int j=g.length-1;j>=0;j--){
            if(i>=0&&s[i]>=g[j]){
                i--;
                count++;
            }
        }
        return count;
    }
}
