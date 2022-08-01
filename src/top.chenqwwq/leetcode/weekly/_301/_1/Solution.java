package top.chenqwwq.leetcode.weekly._301._1;

import com.sun.org.apache.xerces.internal.impl.xs.XSAttributeUseImpl;
import jdk.nashorn.internal.ir.LabelNode;

/**
 * @author chenqwwq
 * @date 2022/7/10
 **/
public class Solution {
    public int fillCups(int[] amount) {
        int sum = amount[0] + amount[1] + amount[2];
        int max = Math.max(amount[0], Math.max(amount[1], amount[2]));
        int other = sum - max;
        int ans = 0;
        if (other > max) {
            ans += (other - max) >> 1;
            other -= ans * 2;
        }
        return ans + Math.max(other, max);
    }
}