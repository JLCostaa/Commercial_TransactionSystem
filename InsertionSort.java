
// Implementação do Insertion Sort

import java.util.List;

class InsertionSort {
        public static void sort(List<Order> orders) {
            int n = orders.size();

            for (int i = 1; i < n; ++i) {
                Order key = orders.get(i);
                int j = i - 1;

                // Move os elementos maiores para a direita
                while (j >= 0 && orders.get(j).getTotalAmount() > key.getTotalAmount()) {
                    orders.set(j + 1, orders.get(j));
                    j = j - 1;
                }

                orders.set(j + 1, key);
            }
        }
    }