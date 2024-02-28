def maxAncestorDiff(root):
    """
    :type root: TreeNode
    :rtype: int
    """
    
    def mad(curr):
        if curr.left:
            leftmin, leftmax,leftv = mad(curr.left)
        else:
            leftmin, leftmax, leftv = curr.val, curr.val, 0
        if curr.right:
            rightmin, rightmax, rightv = mad(curr.right)
        else:
            rightmin, rightmax, rightv = curr.val, curr.val, 0
        
        minimum = min(curr.val, leftmin, rightmin)
        maximum = max(curr.val, leftmax, rightmax)
        v = max(abs(curr.val-leftmin), abs(curr.val-leftmax), abs(curr.val-rightmin), abs(curr.val-rightmax), leftv, rightv)
        
        return minimum, maximum, v
    
    ansmin, ansmax, ansv = mad(root)
    return ansv  