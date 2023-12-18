package dataStructures.treesAndDesignStrategies;

import java.util.LinkedList;
import java.util.Queue;

// Define a TreeNode class to represent each node in the tree
class TreeNode {
    String url;
    TreeNode left;
    TreeNode right;

    public TreeNode(String url) {
        this.url = url;
        this.left = null;
        this.right = null;
    }


// Perform a depth-first traversal of the tree
public static void depthFirstTraversal(TreeNode root, int level) {
    if (root == null || level < 1) {
        return;
    }

    // Process the current node
    System.out.println(root.url);

    // Recursively traverse the left subtree with reduced level
    depthFirstTraversal(root.left, level - 1);

    // Recursively traverse the right subtree with reduced level
    depthFirstTraversal(root.right, level - 1);
}

// Perform a breadth-first traversal of the tree
public static void breadthFirstTraversal(TreeNode root, int level) {
    if (root == null || level < 1) {
        return;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    int currentLevel = 1;
    int nodesInCurrentLevel = 1;
    int nodesInNextLevel = 0;

    while (!queue.isEmpty() && currentLevel <= level) {
        TreeNode node = queue.poll();

        // Process the current node
        System.out.println(node.url);

        // Enqueue the left child if it exists
        if (node.left != null) {
            queue.offer(node.left);
            nodesInNextLevel++;
        }

        // Enqueue the right child if it exists
        if (node.right != null) {
            queue.offer(node.right);
            nodesInNextLevel++;
        }

        nodesInCurrentLevel--;

        if (nodesInCurrentLevel == 0) {
            currentLevel++;
            nodesInCurrentLevel = nodesInNextLevel;
            nodesInNextLevel = 0;
        }
    }
}

// Create a sample search engine instance
public static void main(String[] args) {
    // Construct the search engine tree
    TreeNode root = new TreeNode("www.searchengine.com");
    root.left = new TreeNode("www.searchengine.com/images");
    root.right = new TreeNode("www.searchengine.com/videos");
    root.left.left = new TreeNode("www.searchengine.com/images/pic1.jpg");
    root.left.right = new TreeNode("www.searchengine.com/images/pic2.jpg");
    root.right.left = new TreeNode("www.searchengine.com/videos/video1.mp4");
    root.right.right = new TreeNode("www.searchengine.com/videos/video2.mp4");

    // Perform depth-first traversal up to level 10
    System.out.println("Depth-first traversal up to level 10:");
    depthFirstTraversal(root, 6);

    // Perform breadth-first traversal up to level 10
    System.out.println("Breadth-first traversal up to level 10:");
    breadthFirstTraversal(root, 6);
}
}