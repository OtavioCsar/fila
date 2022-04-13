public class Sell {
    int sales;

    int numberOfSales(int numberSales) {
        sales = numberSales;
        return sales;
    }

    boolean makeSale(Product product, Stock stock) {
        if (stock.stockCheck(product) && product.quant > 0) {
            return true;
        }
        return false;
    }
}
