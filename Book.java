public class Book extends Product{
    //initialaization
    private String author;

    //constructors

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }


    //setter n getter


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    //@overrides

    public double getdiscount(){
        System.out.println("Original price of the Book is: "+super.getPrice()+"\n"
                +"The price of the Book after discounting 40 Ryals is: ");
        return super.getPrice()-40;
    }

    public void displayinfo()
    {

        System.out.println("you choose: "+getName()+"\n"+
                "that has been written by: "+author+"\n");
        System.out.println(getdiscount());
    }
}
