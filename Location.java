public class Location extends Destination 
{
    private String street;
    private String houseID;
    public Location (String country, String city, String stree, String houseI)
    {
        super(country, city);
        street = stree;
        houseID = houseI;
    }
    public void setCountry(String country){
        super.country = country;
    }
    public String getCountry()
    {
        return super.country;
    }
    public void setCity(String city){
        super.city = city;
    }
    public String getCity()
    {
        return super.city;
    }  
    public String getStreet()
    {
        return street;
    }
    public String getHouseID()
    {
        return houseID;
    }
    public String toString ()
    {
        return "Улс: "+ getCountry()+
                "\nХот: "+ getCity()+
                "\nГудамж: "+getStreet()+
                "\nБайр: "+getHouseID();
    }
}