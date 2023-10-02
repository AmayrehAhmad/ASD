package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model;

public class Product {
    private long productId;
    private String name;
    private String dateSupplied;
    private int quantityInStock;
    private double unitPrice;

    // Default constructor
    public Product() {
    }

    // Parameterized constructor
    public Product(long productId, String name, String dateSupplied, int quantityInStock, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    // Copy constructor
    public Product(Product other) {
        this.productId = other.productId;
        this.name = other.name;
        this.dateSupplied = other.dateSupplied;
        this.quantityInStock = other.quantityInStock;
        this.unitPrice = other.unitPrice;
    }

    // Getter and setter methods
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateSupplied() {
        return dateSupplied;
    }

    public void setDateSupplied(String dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
