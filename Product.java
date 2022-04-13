public class Product {
    String name;
    String desc;
    float price;
    int quant;

    Product(String name, String desc, float price, int quant) {

    }

    void showInfo() {
        System.out.println("Nome: "name,"Descrição: "desc,"Preço: "price,"Quantidade: "quant);
    }

    float changePrice(float newPrice) {
        price = newPrice;
        return price;
    }
}