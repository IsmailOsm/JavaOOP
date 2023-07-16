package encapsulation.p03ShoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Person> personMap = new LinkedHashMap<>();
        Map<String, Product> productMap = new LinkedHashMap<>();
        try {
            String[] people = scanner.nextLine().split(";");
            String[] products = scanner.nextLine().split(";");
            addPerson(personMap, people);
            addProduct(productMap, products);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return;
        }

        buyProduct(scanner, personMap, productMap);
        personMap.values().forEach(p -> {
            System.out.print(p.getName() + " - ");
            if (p.getProducts().size() == 0){
                System.out.println("Nothing bought.");
            }else {
                String allProducts = p.getProducts().stream().map(Product::getName)
                        .collect(Collectors.joining(", "));
                System.out.println(allProducts);
            }

        });


    }

    private static void buyProduct(Scanner scanner, Map<String, Person> personMap, Map<String, Product> productMap) {
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String personName = input.split("\\s+")[0];
            String productName = input.split("\\s+")[1];
            Person person = personMap.get(personName);
            Product product = productMap.get(productName);
            try {
                person.buyProduct(product);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }

            input = scanner.nextLine();
        }
    }

    private static void addProduct(Map<String, Product> productMap, String[] products) {
        for (int i = 0; i < products.length; i++) {
            String name = products[i].split("=")[0];
            double cost = Double.parseDouble(products[i].split("=")[1]);
            Product product = new Product(name, cost);
            productMap.put(product.getName(), product);
        }
    }

    private static void addPerson(Map<String, Person> personMap, String[] people) {
        for (int i = 0; i < people.length; i++) {
            String name = people[i].split("=")[0];
            double money = Double.parseDouble(people[i].split("=")[1]);
            Person person = new Person(name, money);
            personMap.put(person.getName(), person);
        }
    }
}
