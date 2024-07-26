import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> result=new ArrayList<>();
    LinkedList<Integer> path=new LinkedList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        backTracking(nums,0);
        return result;
    }

    public void backTracking(int[] nums,int startIndex){
        if(startIndex>nums.length){
            return;
        }
        if(path.size()>=2){
            result.add(new ArrayList<>(path));
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=startIndex;i<nums.length;i++){
            if(!path.isEmpty()&&path.get(path.size()-1)>nums[i]||hs.contains(nums[i])){
                continue;
            }
            hs.add(nums[i]);
            path.add(nums[i]);
            backTracking(nums,i+1);
            path.removeLast();
        }
    }
}
