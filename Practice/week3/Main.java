public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.name = "RestoBar";

        Product p1 = new Product("Coffee", 130, 20);
        Product.totalProduct++;
        Product p2 = new Product("Gin", 75, 10);
        Product.totalProduct++;

        shop.productList = new Product[50];
        shop.productList[0] = p1;
        shop.productList[1] = p2;

        System.out.println("Welcome to " + shop.name);
        shop.displayProduct();

    }
}
