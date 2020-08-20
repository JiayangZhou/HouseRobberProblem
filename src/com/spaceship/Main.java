package com.spaceship;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    /**
     * The thief has found himself a new place for his thievery again.
     * There is only one entrance to this area, called the "root." Besides the root,
     * each house has one and only one parent house. After a tour, the smart thief realized that
     * "all houses in this place forms a binary tree". It will automatically contact the police if two
     * directly-linked houses were broken into on the same night.
     * Determine the maximum amount of money the thief can rob tonight without alerting the police.
     * @param root
     * @return
     */
    public int rob(TreeNode root) {
        return helper(root)[0];
    }
    public int[] helper(TreeNode node){
        if (node!=null){
            int[] dp = new int[2];
            int[] left =  helper(node.left);
            int[] right = helper(node.right);
            // dp[0] is to store the bigger value between current node value plus the grand kid nodes value and kid nodes
            dp[0] = Math.max(node.val + left[1] + right[1], left[0] + right[0]);
            // dp[1] is to store the kid nodes value
            dp[1] = left[0] + right[0];
            return dp;
        }else{
            return new int[2];
        }
    }
}
