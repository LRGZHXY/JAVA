/*public class treetraversal {

}*/


/*class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ret=new ArrayList<List<Integer>>();
        if(root==null){
            return ret;
        }

        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> level=new ArrayList<Integer>();
            int curSize=queue.size();
            for(int i=1;i<=curSize;i++){
                TreeNode node=queue.poll();
                level.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            ret.add(level);
        }
        return ret;
    }
}
*/
