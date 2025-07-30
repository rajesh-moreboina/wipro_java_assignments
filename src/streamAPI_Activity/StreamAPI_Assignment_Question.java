package streamAPI_Activity;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.*;

public class StreamAPI_Assignment_Question {
    public static void main(String[] args) {
        // Sample Products
        Product p1 = new Product(1L, "Java Book", "Books", 120.0);
        Product p2 = new Product(2L, "Baby Oil", "Baby", 80.0);
        Product p3 = new Product(3L, "Teddy Bear", "Toys", 300.0);
        Product p4 = new Product(4L, "Story Book", "Books", 90.0);
        Product p5 = new Product(5L, "Lego Set", "Toys", 450.0);

        List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);

        // Sample Customers
        Customer c1 = new Customer(1L, "Alice", 1);
        Customer c2 = new Customer(2L, "Bob", 2);
        Customer c3 = new Customer(3L, "Charlie", 2);

        // Sample Orders
        Order o1 = new Order(1L, "DELIVERED", LocalDate.of(2021, 2, 10), LocalDate.of(2021, 2, 15),
                             Arrays.asList(p1, p2), c2);
        Order o2 = new Order(2L, "SHIPPED", LocalDate.of(2021, 3, 5), LocalDate.of(2021, 3, 10),
                             Arrays.asList(p3), c3);
        Order o3 = new Order(3L, "CANCELLED", LocalDate.of(2021, 1, 20), LocalDate.of(2021, 1, 25),
                             Arrays.asList(p4), c1);
        Order o4 = new Order(4L, "DELIVERED", LocalDate.of(2021, 2, 18), LocalDate.of(2021, 2, 22),
                             Arrays.asList(p5, p1), c2);

        List<Order> orders = Arrays.asList(o1, o2, o3, o4);

        // 1. Books > 100
        System.out.println("1. Books with price > 100:");
        products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books") && p.getPrice() > 100)
                .forEach(System.out::println);

        // 2. Orders with 'Baby' products
        System.out.println("\n2. Orders with 'Baby' products:");
        orders.stream()
                .filter(o -> o.getProducts().stream()
                        .anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby")))
                .forEach(System.out::println);

        // 3. Toys with 10% discount
        System.out.println("\n3. Toys with 10% discount:");
        products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
                .map(p -> new Product(p.getId(), p.getName(), p.getCategory(), p.getPrice() * 0.9))
                .forEach(System.out::println);

        // 4. Products ordered by tier 2 customers between 01-Feb-2021 and 01-Apr-2021
        System.out.println("\n4. Products ordered by tier 2 customers between 01-Feb-2021 and 01-Apr-2021:");
        orders.stream()
                .filter(o -> o.getCustomer().getTier() == 2)
                .filter(o -> o.getOrderDate().isAfter(LocalDate.of(2021, 1, 31)) &&
                             o.getOrderDate().isBefore(LocalDate.of(2021, 4, 2)))
                .flatMap(o -> o.getProducts().stream())
                .distinct()
                .forEach(System.out::println);

        // 5. Cheapest Book
        System.out.println("\n5. Cheapest Book:");
        products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .min(Comparator.comparingDouble(Product::getPrice))
                .ifPresent(System.out::println);

        // 6. 3 Most Recent Orders
        System.out.println("\n6. 3 Most Recent Orders:");
        orders.stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(3)
                .forEach(System.out::println);

        // 7. Total value of orders in Feb 2021
        System.out.println("\n7. Total value of orders in Feb 2021:");
        double total = orders.stream()
                .filter(o -> o.getOrderDate().getMonth() == Month.FEBRUARY &&
                             o.getOrderDate().getYear() == 2021)
                .flatMap(o -> o.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .sum();
        System.out.println("₹" + total);

        // 8. Summary statistics for Books
        System.out.println("\n8. Summary statistics for 'Books':");
        DoubleSummaryStatistics stats = products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .mapToDouble(Product::getPrice)
                .summaryStatistics();
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: ₹" + stats.getSum());
        System.out.println("Avg: ₹" + stats.getAverage());
        System.out.println("Min: ₹" + stats.getMin());
        System.out.println("Max: ₹" + stats.getMax());

        // 9. Most expensive product by category
        System.out.println("\n9. Most expensive product by category:");
        Map<String, Optional<Product>> expensiveByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))
                ));
        expensiveByCategory.forEach((category, productOpt) ->
                System.out.println(category + ": " + productOpt.get()));
    }
}

/*
1. Books with price > 100:
Java Book (Books) - ₹120.0

2. Orders with 'Baby' products:
Order#1 by Bob

3. Toys with 10% discount:
Teddy Bear (Toys) - ₹270.0
Lego Set (Toys) - ₹405.0

4. Products ordered by tier 2 customers between 01-Feb-2021 and 01-Apr-2021:
Java Book (Books) - ₹120.0
Baby Oil (Baby) - ₹80.0
Teddy Bear (Toys) - ₹300.0
Lego Set (Toys) - ₹450.0

5. Cheapest Book:
Story Book (Books) - ₹90.0

6. 3 Most Recent Orders:
Order#2 by Charlie
Order#4 by Bob
Order#1 by Bob

7. Total value of orders in Feb 2021:
₹770.0

8. Summary statistics for 'Books':
Count: 2
Sum: ₹210.0
Avg: ₹105.0
Min: ₹90.0
Max: ₹120.0

9. Most expensive product by category:
Toys: Lego Set (Toys) - ₹450.0
Baby: Baby Oil (Baby) - ₹80.0
Books: Java Book (Books) - ₹120.0
*/