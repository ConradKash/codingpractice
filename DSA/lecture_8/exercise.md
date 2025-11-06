# Tree Traversal Strategies and Design Patterns

## Basic Tree Traversals

### Breadth First Traversal (BFS)
- Explores tree level by level
- Uses a queue data structure
- Visits all nodes at current depth before moving deeper
- Time Complexity: O(n)
- Space Complexity: O(w) where w is maximum width
####  Example is Facebook/LinkedIn suggesting "People You May Know"

### Depth First Traversal (DFS)
- Explores tree by going as deep as possible first
- Uses a stack data structure (or recursion)
- Three variants: Pre-order, In-order, Post-order
- Time Complexity: O(n)
- Space Complexity: O(h) where h is height

####  Example is Searching for a file on your computer

## Relationship to Design Strategies

### Backtracking
- More closely related to DFS
- Uses depth-first approach to explore possibilities
- Backtracks when hitting dead end or invalid solution
- Example: Finding all possible paths in a tree

### Branch and Bound
- More closely related to BFS
- Uses breadth-first approach to explore solution space
- Maintains bounds to prune unpromising branches
- More efficient for finding optimal solutions
- Example: Finding shortest path in weighted tree
