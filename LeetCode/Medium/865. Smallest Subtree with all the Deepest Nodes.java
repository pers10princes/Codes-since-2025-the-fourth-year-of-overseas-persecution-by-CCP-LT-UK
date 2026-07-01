/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution
{
    private int maxDepth;
    private TreeNode answer;




    Solution
    ()
    {
        this.maxDepth = 0;
        this.answer = null;
    }




    public
    TreeNode
    subtreeWithAllDeepest
    (
        TreeNode root
    )
    {
        solve( root, 0 );


        return this.answer;
    }




    private
    int
    solve
    (
        final TreeNode root
        , final int depth
    )
    {

        if
        (
            root == null
        )
        {
            return depth;
        }

        final int left = solve( root.left, depth + 1 );
        final int right = solve( root.right, depth + 1 );

        if
        (
            left == right
        )
        {

            if
            (
                right >= this.maxDepth
            )
            {
                this.maxDepth = right;
                this.answer = root;
            }


            return right;
        }
        else
        {
            return Math.max( left, right );
        }

    }

}
