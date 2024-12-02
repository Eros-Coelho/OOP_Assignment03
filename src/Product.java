/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

import java.util.Objects;

public class Product {

    private final int code;
    private String title;
    private double price;
//    nextCode sets the first code for 1, then increases for each new product created
    private static int nextCode = 1;

    public Product(String title, double price){
        this.code = nextCode++;
        this.title = title;
        this.price = price;
    }

//    getters and setters for all attributes (except setter for code)
    public int getCode(){
        return code;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price){
        this.price = price;
    }

//    overriding to return the data as a single String
    @Override
    public String toString(){
        return "Product {" + "code = " + code + ", title = " + title + ", price = " + price + "}";
    }

//    overriding the equals method to check if two objects are logically the same
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return code == product.code;
    }

    @Override
    public int hashCode(){
        return Objects.hash(code);
    }

    public int compareTo(Product other){
        return this.title.compareTo(other.title);
    }
}
