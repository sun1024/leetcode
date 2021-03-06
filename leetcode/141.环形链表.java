import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 *
 * https://leetcode-cn.com/problems/linked-list-cycle/description/
 *
 * algorithms
 * Easy (46.07%)
 * Likes:    499
 * Dislikes: 0
 * Total Accepted:    112.8K
 * Total Submissions: 242.9K
 * Testcase Example:  '[3,2,0,-4]\n1'
 *
 * 给定一个链表，判断链表中是否有环。
 * 
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 * 
 * 
 * 
 * 
 * 示例 2：
 * 
 * 输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 * 
 * 
 * 
 * 
 * 示例 3：
 * 
 * 输入：head = [1], pos = -1
 * 输出：false
 * 解释：链表中没有环。
 * 
 * 
 * 
 * 
 * 
 * 
 * 进阶：
 * 
 * 你能用 O(1)（即，常量）内存解决此问题吗？
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// 垃圾题目描述 哪里来的pos???
// 快慢指针
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         if(head == null || head.next == null) return false;
//         // 快慢指针 相遇则有环
//         ListNode fast = head.next;
//         ListNode slow = head;
//         while(fast != slow) {
//             if(fast == null || fast.next == null) return false;
//             fast = fast.next.next;
//             slow = slow.next;
//         }
//         return true;
//     }
// }
// 哈希表 
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        HashSet<ListNode> set = new HashSet<>();
        while(head.next != null) {
            if(set.contains(head)) return true; //当前节点被指向过则有环
            else set.add(head);
            head = head.next;
        }
        return false;
    }
}
// @lc code=end

