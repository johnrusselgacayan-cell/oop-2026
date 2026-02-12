public class Product{
    String name;
    double price;
    int stock;
    static int totalProduct;

    public Product(){}
    public Product(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getInfo(){
        return name + " - " + price;
    }
}