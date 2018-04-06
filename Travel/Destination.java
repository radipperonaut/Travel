public class Destination 
{
    private String country; 
    private String city;
    
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
        return "Country: "+ getCountry()+
                "\nCity: "+ getCity();
    }
}
    
    