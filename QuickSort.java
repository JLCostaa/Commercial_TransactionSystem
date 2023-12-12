
// Implementação do Quick Sort

import java.util.List;

class QuickSort {
        public static void sort(List<Order> orders) {
            quickSort(orders, 0, orders.size() - 1);
        }

        private static void quickSort(List<Order> orders, int low, int high) {
            if (low < high) {
                int pi = partition(orders, low, high);

                quickSort(orders, low, pi - 1);
                quickSort(orders, pi + 1, high);
            }
        }

        private static int partition(List<Order> orders, int low, int high) {
            Order pivot = orders.get(high);
            int i = (low - 1);

            for (int j = low; j < high; j++) {
                if (orders.get(j).getTotalAmount() < pivot.getTotalAmount()) {
                    i++;

                    // Troca os elementos
                    Order temp = orders.get(i);
                    orders.set(i, orders.get(j));
                    orders.set(j, temp);
                }
            }

            // Troca o pivot com o elemento na posição correta
            Order temp = orders.get(i + 1);
            orders.set(i + 1, orders.get(high));
            orders.set(high, temp);

            return i + 1;
        }
    }
