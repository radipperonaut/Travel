public class Destination 
{
    protected String country; 
    protected String city;
    private double price;
    
    public Destination (String co, String ci)
    {
        city=ci;
        country=co;
    }
    public String getCountry()
    {
        return country;
    }
    public String getCity()
    {
        return city;
    }
    public double getPrice(){
        return price;
    }
    public void setCountry(String co)
    {
        country=co;
    }
    public void setCity(String ci)
    {
        city=ci;
    }
    public String toString()
    {
        return "Улс: "+ getCountry()+
                "\nХот: "+ getCity();
    }
}
    
    