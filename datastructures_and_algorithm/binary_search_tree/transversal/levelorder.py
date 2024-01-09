# Returns height of the BST
def height(node):
    if node is None:
        return 0
    else:
        # Compute the depth of each subtree
        lDepth = height(node.left)
        rDepth = height(node.right)
 
        # Use the larger one
        if lDepth > rDepth:
            return (lDepth + 1)
        else:
            return (rDepth + 1)

# Print nodes at a given level
def printGivenLevel(root, level):
    if root is None:
        return
    if level == 1:
        print(root.key, end=" ")
    elif level > 1:
        # Recursive call
        printGivenLevel(root.left, level - 1)
        printGivenLevel(root.right, level - 1)
 
# Function to line by line print
# level order traversal of a tree
def printLevelOrder(root):
    h = height(root)
    for i in range(1, h+1):
        printGivenLevel(root, i)
        print()