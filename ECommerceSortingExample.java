import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ECommerceSortingExample {

    public static void main(String[] args) {
        // Gerando pedidos aleatórios
        List<Order> orders = generateRandomOrders(1000);

        // Medindo o tempo para ordenação usando árvore binária de busca
        long startTimeBST = System.currentTimeMillis();
        BinarySearchTree bst = buildBinarySearchTree(orders);
        long sortingTimeBST = System.currentTimeMillis() - startTimeBST;
        System.out.println("Tempo gasto na ordenação usando BST: " + sortingTimeBST + " milissegundos");

        // Medindo o tempo para ordenação usando algoritmo de ordenação
        long startTimeSortingAlgorithm = System.currentTimeMillis();
        chooseSortingAlgorithm(orders);
        long sortingTimeAlgorithm = System.currentTimeMillis() - startTimeSortingAlgorithm;
        System.out.println("Tempo gasto na ordenação usando algoritmo de ordenação: " + sortingTimeAlgorithm + " milissegundos");
    }

    // Método para gerar pedidos aleatórios
    private static List<Order> generateRandomOrders(int size) {
        List<Order> orders = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            orders.add(new Order(i + 1, random.nextInt(1000) + 1));
        }
        return orders;
    }

    // Método para construir uma árvore binária de busca
    private static BinarySearchTree buildBinarySearchTree(List<Order> orders) {
        BinarySearchTree bst = new BinarySearchTree();
        for (Order order : orders) {
            bst.insert(order);
        }
        return bst;
    }

    // Método para escolher o algoritmo de ordenação com base no tamanho dos pedidos
    private static void chooseSortingAlgorithm(List<Order> orders) {
        int dataSize = orders.size();

        if (dataSize < 100) {
            BubbleSort.sort(orders);
            System.out.println("Ordenação usando Bubble Sort");
        } else if (dataSize < 1000) {
            SelectionSort.sort(orders);
            System.out.println("Ordenação usando Selection Sort");
        } else if (dataSize < 5000) {
            InsertionSort.sort(orders);
            System.out.println("Ordenação usando Insertion Sort");
        } else {
            QuickSort.sort(orders);
            System.out.println("Ordenação usando Quick Sort");
        }
    }
}
