public class Burger {
    private int nbViande;
    private String sauce;
    private boolean isSalade;
    private boolean isFromage;
    private double price;

    public Burger(){}
    public Burger(int nbViande, String sauce, double price) {
        this(nbViande, sauce, false, false,price);
    }
    public Burger(int nbViande, String sauce, boolean isSalade, boolean isFromage, double price) {
        this.nbViande = nbViande;
        this.sauce = sauce;
        this.isSalade = isSalade;
        this.isFromage = isFromage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "nbViande=" + nbViande +
                ", sauce='" + sauce + '\'' +
                ", isSalade=" + isSalade +
                ", isFromage=" + isFromage +
                ", price=" + price +
                '}';
    }

    public int compareTo(Burger burger){
        double ratioB1 = this.getPrice()/this.getNbViande();
        double ratioB2 = burger.getPrice()/burger.getNbViande();
        if (ratioB1 < ratioB2)
            return -1;
        return 1;
    }
    public int getNbViande() {
        System.out.println("COUCOU");
        //price += 15;
        return nbViande;
    }

    public void setNbViande(int nbViande) {
        this.nbViande = nbViande;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public boolean isSalade() {
        return isSalade;
    }

    public void setSalade(boolean salade) {
        isSalade = salade;
    }

    public boolean isFromage() {
        return isFromage;
    }

    public void setFromage(boolean fromage) {
        isFromage = fromage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
