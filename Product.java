public class Product {
    String name;
    String desc;
    float price;
    int quant;

    Product(String pName, String pDesc, float pPrice, int pQuant) {
        name = pName;
        desc = pDesc;
        price = pPrice;
        quant = pQuant;
    }

    void showInfo() {
    }

    float changePrice(float newPrice) {
        price = newPrice;
        return price;
    }

    int decreaseQuantity() {
        quant -= 1;
        return quant;
    }

}