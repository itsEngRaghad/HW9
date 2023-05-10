public class Movie extends Product{

    //initilaization
    private String director;

    //constructors

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }


    //setter n getter


    public String getAuthor() {
        return director;
    }

    public void setAuthor(String author) {
            this.director = director;
    }


    //abstract


    public double getdiscount(){
        System.out.println("Original price of the Movie is: "+super.getPrice()+"\n"
                +"The price of the movie after discounting 30 Ryals is: ");
        return super.getPrice()-30;
    }

    public void displayinfo()
    {

        System.out.println("you choose: "+getName()+"\n"+
                "that has been created by: "+director+"\n");
        System.out.println(getdiscount());
    }

}
