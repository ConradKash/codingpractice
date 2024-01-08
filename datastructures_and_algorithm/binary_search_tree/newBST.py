from inserting_nodes import Node
def newNode(item):
    temp = Node(item)
    temp.key = item
    temp.left = temp.right = None
    return temp    
    