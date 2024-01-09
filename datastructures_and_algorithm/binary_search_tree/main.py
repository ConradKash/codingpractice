from inserting_nodes import insert
from transversal.inorder import inorder
from transversal.postorder import postorder
from transversal.preorder import preorder
from transversal.levelorder import printLevelOrder

if __name__ == '__main__':
    root = None
    
    # Inserting elements in the tree
    root = insert(root, 50)        
    keys = [30, 20, 40, 70, 60, 80, 90,0,100]
    for key in keys:
        insert(root, key)
        
    # Tranversing the tree
    
    print("\n\nInorder Tranversal: ")
    inorder(root)
    print("\n\nPreorder Tranversal: ")
    preorder(root)
    print("\n\nPostorder Tranversal: ")
    postorder(root)
    print("\n\nLevelorder Tranversal: ")
    printLevelOrder(root)
