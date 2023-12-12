class Node {
    Order order;
    Node left, right;

    public Node(Order order) {
        this.order = order;
        this.left = this.right = null;
    }
}