public class Shop {
    String name;
    Product[] productList;
    int productCount;

    public Shop(){
    }
    public Shop(String name, Product[] list){
        this.name = name;
        this.productList = list;
    }

    public void addProduct(Product product){
        productList[productCount] = product;
        productCount++;
    }

    public void displayProduct(){
        for(Product p : productList){
            System.out.println(p.getInfo());
        }
    }
}
