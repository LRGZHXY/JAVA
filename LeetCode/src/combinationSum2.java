import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> result=new ArrayList<>();
    LinkedList<Integer> path=new LinkedList<>();
    boolean[] used;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        used=new boolean[candidates.length];
        Arrays.fill(used,false);
        Arrays.sort(candidates);
        backTracking(candidates,target,0,0,used);
        return result;
    }

    public void backTracking(int[] candidates,int target,int sum,int startIndex,boolean[] used){
        if(sum==target){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex;i<candidates.length;i++){
            if(sum+candidates[i]>target){
                break;
            }
            if(i>0&&candidates[i]==candidates[i-1]&&used[i-1]==false){
                continue;
            }
            path.add(candidates[i]);
            sum+=candidates[i];
            used[i]=true;
            backTracking(candidates,target,sum,i+1,used);
            sum-=candidates[i];
            used[i]=false;
            path.removeLast();
        }
    }
}