package Demo;

import java.util.*;

class Container {
    int id, volume;

    public Container(int id, int length, int breadth, int height) {
        this.id = id;
        this.volume = length * breadth * height;
    }
}

class Product {
    int id, volume;

    public Product(int id, int length, int breadth, int height) {
        this.id = id;
        this.volume = length * breadth * height;
    }
}

class Order {
    int productId, quantity;

    public Order(int productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }
}

public class OrderPacking {
    public static Integer findFittingContainer(List<Container> containers, List<Order> orders, Map<Integer, Product> productMap) {
        int orderVolume = 0;

        for (Order order : orders) {
            if (productMap.containsKey(order.productId)) {
                orderVolume += productMap.get(order.productId).volume * order.quantity;
            }
        }

        for (Container container : containers) {
            if (container.volume >= orderVolume) {
                return container.id;
            }
        }
        return -1;
    }

    public static int maxOrdersFit(List<Container> containers, List<List<Order>> allOrders, Map<Integer, Product> productMap) {
        int maxOrders = 0;
        int containerId = -1;

        for (Container container : containers) {
            int count = 0;
            int remainingVolume = container.volume;

            for (List<Order> orders : allOrders) {
                int orderVolume = 0;
                for (Order order : orders) {
                    if (productMap.containsKey(order.productId)) {
                        orderVolume += productMap.get(order.productId).volume * order.quantity;
                    }
                }

                if (remainingVolume >= orderVolume) {
                    remainingVolume -= orderVolume;
                    count++;
                }
            }

            if (count > maxOrders) {
                maxOrders = count;
                containerId = container.id;
            }
        }
        return containerId;
    }

    public static void main(String[] args) {
        List<Container> containers = Arrays.asList(
                new Container(1, 10, 20, 30),
                new Container(2, 50, 60, 70),
                new Container(3, 100, 200, 300)
        );

        Map<Integer, Product> productMap = new HashMap<>();
        productMap.put(1, new Product(1, 2, 4, 10));
        productMap.put(2, new Product(2, 10, 30, 4));
        productMap.put(3, new Product(3, 5, 6, 7));

        List<Order> orders = Arrays.asList(
                new Order(1, 3),
                new Order(3, 7)
        );

        int fittingContainerId = findFittingContainer(containers, orders, productMap);
        System.out.println("Fitting Container ID: " + fittingContainerId);

        List<List<Order>> allOrders = Arrays.asList(orders, Arrays.asList(new Order(2, 5), new Order(3, 10)));
        int maxOrdersContainerId = maxOrdersFit(containers, allOrders, productMap);
        System.out.println("Container that fits max orders: " + maxOrdersContainerId);
    }
}
