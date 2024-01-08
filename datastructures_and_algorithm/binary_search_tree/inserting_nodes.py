class Node:
    def __init__(self, key):
        self.key = key
        self.left = None
        self.right = None

# Inserting elements in the nodes
def insert(node, key):
    # Checking if there elements in the tree
    if node is None:
        return Node(key)
    
    if key < node.key:
        node.left = insert(node.left, key)
    elif key > node.key:
        node.right = insert(node.right, key)
    
    return node

# Transversing the tree
def inorder(root):
    if root is not None:
        inorder(root.left)
        print(root.key, end="\t")
        inorder(root.right) 

# Testing insersion and tranversing
if __name__ == '__main__':
    root = None
    
    # Inserting elements in the tree
    root = insert(root, 50)
    insert(root, 30)
    insert(root, 20)
    insert(root, 40)
    insert(root, 70)
    insert(root, 60)
    insert(root, 80)
        
    # keys = [30, 20, 40, 70, 60, 80]
    # for key in keys:
    #     print("1")
    #     insert(root, key)
        
    # Tranversing the tree
    inorder(root)
