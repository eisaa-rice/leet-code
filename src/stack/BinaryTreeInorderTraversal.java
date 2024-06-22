package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {

    } // main

    public class TreeNode {
      int val;

      TreeNode left;
      TreeNode right;

      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    // find a way to loop bottom left until null
    //   then go up one
    //   then loop bottom left over and over again
    //   and when going up one, the rights will be taken care of

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> integerList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;

        // "This loop ensures we continue processing as long as there are nodes to be visited (current != null)
        //   or there are nodes stored in the stack (!stack.isEmpty())." - ChatGPT
        while (current != null || !stack.isEmpty()) { // wtf is this while loop why did it work
            // go all the way bottom left while adding every node to stack
            while (current != null) {
                stack.push(current);

                current = current.left;
            } // while

            //go back one node, add its value to the list
            current = stack.pop();
            integerList.add(current.val);

            // go to the right side and start over
            current = current.right;
        }

        // return the inorder traversal of its nodes' VALUES
        return integerList;
    } // inorderTraversal
}

// [1,2,3,4,5,null,6,null,null,7]
/*

            1
        2       3
      4   5   x   6
    x x  7 x

*/
// [4,2,7,5,1,3,6]