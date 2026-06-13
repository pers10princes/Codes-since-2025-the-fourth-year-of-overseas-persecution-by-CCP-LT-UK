class Solution {
    func pairSum(head: ?ListNode): Int64 {
        let al = ArrayList<Int64>()
        var ans = 0
        var curr = head
        
        while (let Some(node) <- curr) {
            al.add(node.val)
            curr = node.next
        }
        
        var i = 0
        var j = al.size - 1
        
        while (i < j) {
            ans = max(ans, al[i] + al[j])
            i++
            j--
        }
        
        ans
    }
}
