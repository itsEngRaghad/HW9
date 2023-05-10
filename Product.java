public abstract class Product {

    //initialization
    private String name;
    private double price;

    //constructors


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //setter n getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //abstract
    abstract  double getdiscount();
    abstract void displayinfo();
}
