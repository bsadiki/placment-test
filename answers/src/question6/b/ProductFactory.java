package question6.b;

public class ProductFactory {
    public Product createProductA(){
        return new ProductA();
    }
    public Product createProductB(){
        return new ProductB();
    }
}
