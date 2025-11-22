public class Product {
    private double price;
    private int cuantity;
    private String name;

    public Product (String initialName, double initialPrice, int initialCuantity){
        this.name = initialName;
        this.price = initialPrice;
        this.cuantity = initialCuantity;
    }

    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", " + this.cuantity + " pcs" );
    }
    
}
