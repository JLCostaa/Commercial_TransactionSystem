
// Implementação do Selection Sort

import java.util.List;

class SelectionSort {
        public static void sort(List<Order> orders) {
            int n = orders.size();

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (orders.get(j).getTotalAmount() < orders.get(minIndex).getTotalAmount()) {
                        minIndex = j;
                    }
                }

                // Troca os elementos
                Order temp = orders.get(minIndex);
                orders.set(minIndex, orders.get(i));
                orders.set(i, temp);
            }
        }
    }
