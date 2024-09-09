import java.util.*;

public class Book {

    private String name;
    private Author[] author;
    private double price;

    private static int qty = 0;

    public Book(){
        Book.qty++;
    }

    public Book(String name, Author[] author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAuthor(Author[] author){
        this.author = author;
    }

    public String getAuthor(){
        StringBuilder sb = new StringBuilder();
        for(Author a : author){
            sb.append("Name:");
            sb.append(a.getName());
            sb.append("\n");

            sb.append("Email:");
            sb.append(a.getEmail());
            sb.append("\n");

            sb.append("Gender:");
            sb.append(a.getGender());
            sb.append("\n");sb.append("\n");
        }
        return sb.toString();
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setQty(int qty){
        Book.qty = qty;
    }

    public int getQty(){
        return qty;
    }

    public static void main(String[] args) {

    }
}
