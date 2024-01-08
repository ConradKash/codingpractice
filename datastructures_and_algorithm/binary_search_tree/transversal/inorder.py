# Transversing the tree
def inorder(root):
    if root is not None:
        inorder(root.left)
        print(root.key, end="\t")
        inorder(root.right) 
