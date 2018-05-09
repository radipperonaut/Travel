public abstract class Price 
{
    public double calculatePrice(int days, Destination city){
        return days * city.getPrice();
    }
    public double calculatePrice(int days, Destination city, Airbnb hotel){
        return days * city.getPrice()+hotel.getPrice();
    }
    
}
