public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Product product1 = new Product("Avon", "baotn", 50f, 1);
        Product product2 = new Product("conta Neflix", "pDesc", 20f, 3);
        Product product3 = new Product("web namoro", "pDesc", 3f, 4);

        stock.addToStock(product1);
        stock.addToStock(product2);
        stock.addToStock(product3);
        for (int i = 0; i < 2; i++) {
            Sell sale = new Sell();
            Product product = stock.products.get(i);
            if (sale.makeSale(product, stock) == true) {
                product.decreaseQuantity();
                if (product.quant == 0) {
                    stock.removeFromStock(product);
                }
            }
        }

    }
}
