public class Main {
    public static void main(String[] args) {
        BTree<String> tree = new BTree<>();

        // Test case 1: Adding root node
        System.out.println(tree.addByPath("Root", ""));  // Expected output: true

        // Test case 2: Trying to add another root node
        System.out.println(tree.addByPath("AnotherRoot", ""));  // Expected output: false

        // Test case 3: Adding left and right children to root
        System.out.println(tree.addByPath("LeftChild", "L"));  // Expected output: true
        System.out.println(tree.addByPath("RightChild", "R"));  // Expected output: true

        // Test case 4: Trying to add a node to an invalid path
        System.out.println(tree.addByPath("InvalidPath", "LR"));  // Expected output: true

        // Test case 5: Adding children to left and right children of root
        System.out.println(tree.addByPath("LeftLeftChild", "LL"));  // Expected output: true
        System.out.println(tree.addByPath("LeftRightChild", "LR"));  // Expected output: false
        System.out.println(tree.addByPath("RightLeftChild", "RL"));  // Expected output: true
        System.out.println(tree.addByPath("RightRightChild", "RR"));  // Expected output: true

        // Test case 6: Trying to add a node where the parent is missing
        System.out.println(tree.addByPath("MissingParent", "LLR"));  // Expected output: true

        // Additional test cases to check tree size
        System.out.println("Tree size: " + tree.getSize());  // Expected output: 7

        // Preorder traversal output
        System.out.println("Preorder traversal: " + tree.pre());  // Expected output: Preorder representation of the tree
    }
}