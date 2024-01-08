from inserting_nodes import insert
from transversal.inorder import inorder
from transversal.postorder import postorder
from transversal.preorder import preorder

if __name__ == '__main__':
    root = None
    
    # Inserting elements in the tree
    root = insert(root, 50)        
    keys = [30, 20, 40, 70, 60, 80]
    for key in keys:
        insert(root, key)
        
    # Tranversing the tree
    
    print("Inorder Tranversal: ")
    inorder(root)
    print("Preorder Tranversal: ")
    preorder(root)
    print("Postorder Tranversal: ")
    postorder(root)
