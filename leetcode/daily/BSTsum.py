def rangeSumBST(root, low, high):
    """
    :type root: TreeNode
    :type low: int
    :type high: int
    :rtype: int
    """
    def dfs(node):
        if not node:
            return 0
        
        current_val = 0
        if low <= node.val <= high:
            current_val = node.val
        
        left_sum = dfs(node.left)
        right_sum = dfs(node.right)
        
        return current_val + left_sum + right_sum
    
    return dfs(root)      