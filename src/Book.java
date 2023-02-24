public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;
    public Book(String n, Author a, double p, int q){
        this.name = n;
        this.author = a;
        this.price = p;
        this.qty = q;
    }
    public String getName(){return name;}
    public Author getAuthor(){return author;}
    public double getPrice(){return price;}
    public int getQty(){return qty;}
    public void setPrice(double p){price = p;}
    public void setQty(int q){qty = q;}
    public String toString(){return "'"+name+"' by "+ getAuthor();}
}
