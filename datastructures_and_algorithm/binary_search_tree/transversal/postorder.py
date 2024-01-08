def postorder(root):
    if root:        
        postorder(root.right)
        postorder(root.left)
        print(root.key, end=" ")