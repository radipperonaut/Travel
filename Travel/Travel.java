public class Travel 
{
    private Destination des;
    private double price;
    private int days;
    private Airbnb airbnb;
    
    public Travel (Destination des, double price, int days)
    {
        setDes(des);
        setPrice(price);
        setDays(days);
    }
    public Travel (Destination des, Airbnb air, double price, int days)
    {
        setDes(des);
        setPrice(price);
        setDays(days);
        airbnb=air;
    }
    public void setDes(Destination de)
    {
        des=de;
    }
    public void setPrice(double pri)
    {
        price=pri;
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
        return price;
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
    