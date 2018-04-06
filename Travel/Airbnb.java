public class Airbnb
{
    private Location loc;
    private double price; 
    public Airbnb (Location lo, double price)
    {
        loc=lo;
        this.price=price;
    }
    public String toString()
    {
        return loc.toString()+
                "\nPrice: "+getPrice();
            }
    public double getPrice ()
    {
        return price;
    }
}