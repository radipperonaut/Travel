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