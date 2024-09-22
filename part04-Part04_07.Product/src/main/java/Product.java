public class Product {
    private String name;
    private Double price;
    private int quantity;
        
    public Product(String initialName, Double initialPrice, int initialQuantity){
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    
    }
    
    public void printProduct(){
        System.out.println(name + ", price " + price + ", " + quantity + " pcs " );
    }
    
}
    

