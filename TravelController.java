public class TravelController
{
    private Destination des;
    private double priceADay;
    private int days;
    private Airbnb airbnb;
    
    public TravelController (Destination des, double priceADay, int days)
    {
        setDes(des);
        setPrice(priceADay);
        setDays(days);
    }
    public TravelController (Destination des, Airbnb air, double priceADay, int days)
    {
        setDes(des);
        setPrice(priceADay);
        setDays(days);
        airbnb=air;
    }
    public void setDes(Destination de)
    {
        des=de;
    }
    public void setPrice(double pri)
    {
        priceADay=pri;
    }
    public void setDays(int day)
    {
        days=day;
    }
    public void setAir(Airbnb air)
    {
        airbnb=air;
    }
    public Destination getDes()
    {
        return des;
    }
    public double getPrice()
    {
        return priceADay;
    }
    public int getDays()
    {
        return days;
    }
    public Airbnb getAir()
    {
        return airbnb;
    }
    public String toString()
    {
        return "Үнэ: "+getPrice()+
                "\nАялах өдрүүд: "+getDays()+"\n"+
                des.toString()+
                "\n\t\tБуудлын хаяг: \n"+
                airbnb.toString();
    }
    public String toStr()
    {
        return "Үнэ: "+getPrice()+
                "\nАялах өдрүүд: "+getDays()+"\n"+
                des.toString();
    }
}
    