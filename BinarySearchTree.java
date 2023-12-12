// Implementação de uma árvore binária de busca simples
class BinarySearchTree {
    private Node root;

    public void insert(Order order) {
        root = insertRec(root, order);
    }

    private Node insertRec(Node root, Order order) {
        if (root == null) {
            root = new Node(order);
            return root;
        }

        if (order.getTotalAmount() < root.order.getTotalAmount()) {
            root.left = insertRec(root.left, order);
        } else if (order.getTotalAmount() > root.order.getTotalAmount()) {
            root.right = insertRec(root.right, order);
        }

        return root;
    }

    // Outros métodos para percurso in-order, pre-order, post-order podem ser adicionados conforme necessário
}