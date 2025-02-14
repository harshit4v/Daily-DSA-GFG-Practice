class Solution {
    private Node first, middle, last, prev;
    void correctBST(Node root) {
        // code here.
         first = middle = last = prev = null;
        inorderTraversal(root);
        if (first != null && last != null) {
            int temp = first.data;
            first.data = last.data;
            last.data = temp;
        } else if (first != null && middle != null) {
            int temp = first.data;
            first.data = middle.data;
            middle.data = temp;
        }
    }
    private void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.left);
        if (prev != null && root.data < prev.data) {
            if (first == null) {
                first = prev;
                middle = root;
            } else {
                last = root;
            }
        }
        prev = root;
        inorderTraversal(root.right);
    }
}
