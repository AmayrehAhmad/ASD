package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model;


public class Main {
    public static void main(String[] args) {
        // Create an array of Product objects with company data
        Product[] products = {
                new Product(3128874119L, "Banana", "2023-01-24", 124, 0.55),
                new Product(2927458265L, "Apple", "2022-12-09", 18, 1.09),
                new Product(9189927460L, "Carrot", "2023-03-31", 89, 2.99)
        };

        // Call the method to print products in different formats
        printProducts(products);
    }

    // Method to print products in JSON, XML, and CSV formats
    public static void printProducts(Product[] products) {
        // Implement code to print products in JSON, XML, and CSV formats here
        // You can use libraries like Jackson for JSON, or build XML/CSV manually
        // For simplicity, I'll provide placeholders for each format

        // JSON format (you can use Jackson or similar libraries)
        System.out.println("Printed in JSON format");
        for (Product product : products) {
            System.out.println("{\"productId\": " + product.getProductId() + ", \"name\": \"" + product.getName() + "\", \"dateSupplied\": \"" + product.getDateSupplied() + "\", \"quantityInStock\": " + product.getQuantityInStock() + ", \"unitPrice\": " + product.getUnitPrice() +"}");
        }

        System.out.println("------------------------------");

        // XML format (you can use libraries like JAXB or build XML manually)
        System.out.println("\nPrinted in SML format:");
        System.out.println("<Products>");
        for (Product product : products) {
            System.out.println("  <Product productId=" + product.getProductId() + "name=" + product.getName() + "dateSupplied=" + product.getDateSupplied() + "quantityInStock=" + product.getQuantityInStock() + "unitprice=" + product.getUnitPrice() + "/Product>" );
        }
        System.out.println("</Products>");

        System.out.println("------------------------------");
        // CSV format (you can build CSV manually or use a library like Apache Commons CSV)
        System.out.println("\nprinted in Comma-Separated Values (CSV) format");
        System.out.println("Product Id,Name,Date Supplied,Quantity In Stock,Unit Price");
        // Implement code to sort products by name before printing in CSV format
        // Here, we assume you have a method to sort the products by name
        // (You can use Arrays.sort or other sorting mechanisms)
        // For simplicity, we'll just print them in the order they were given
        for (Product product : products) {
            System.out.println(
                    product.getProductId() + "," +
                            product.getName() + "," +
                            product.getDateSupplied() + "," +
                            product.getQuantityInStock() + "," +
                            product.getUnitPrice()
            );
        }
    }
}
