from inserting_nodes import insert
from transversal.inorder import inorder
if __name__ == '__main__':
    root = None
    
    # Inserting elements in the tree
    root = insert(root, 50)        
    keys = [30, 20, 40, 70, 60, 80]
    for key in keys:
        insert(root, key)
        
    # Tranversing the tree
    inorder(root)
