import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result=new ArrayList<>();
        int[] hash=new int[27];
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            hash[ch[i]-'a']=i;
        }
        int left=0;
        int right=0;
        int len=0;
        for(int i=0;i<ch.length;i++){
            right=Math.max(right,hash[ch[i]-'a']);
            if(i==right){
                len=right-left+1;
                result.add(len);
                left=i+1;
            }
        }
        return result;
    }
}
