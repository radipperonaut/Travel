import java.util.*;
public class Program 
{
    public static void main()
    {
        System.out.print('\u000c');
        System.out.println("*** Аялалын програм V1.0 ***");
        System.out.println("Аялах чиглэлээ оруулна уу? (Улс, Хот)");
        String country, city;
        int c, days;
        double price;
        Scanner in = new Scanner (System.in);
        country = in.next(); //Destination coutry 
        city = in.next(); //Destination city
        Destination des = new Destination(country, city);
        System.out.println("Аялах зардлаа оруулна уу?");
        price= in.nextDouble();
        System.out.println("Аялах хоногийн тоогоо оруулна уу?");
        days= in.nextInt();
        System.out.println("Буудал захиалах уу? (Тийм бол 1, Үгүй бол 0)");
        c=in.nextInt();
        System.out.println("Буудлынхаа хаягийг оруулна уу? (Улс, Хот, Гудамж, Байршил)"); //Airbnb information 
        String street, houseID;
        country = in.next();
        city = in.next();
        street = in.next();
        houseID= in.next();
        Location loc  = new Location (country, city , street, houseID);
        System.out.println("Буудлынхаа төлбөрийг оруулна уу?");
        Airbnb air = new Airbnb (loc, in.nextDouble());  
        Travel travel = new Travel (des, air, price, days); //till this line
                        
        
        System.out.println("Таны аялалын мэдээлэл: ");
        System.out.println(travel.toString());
        
        /*Destination des = new Destination("Mongolia", "Ulaanbaatar");
        Location loc = new Location ("Mongolia", "Ulaanbaatar" , "Jamsran" , "16-104");
        Airbnb air = new Airbnb (loc, 50000);
        Travel travel = new Travel(des, 150000, 2);
        Travel trabnb = new Travel (des, air, 152000, 3);
        System.out.println(travel.toStr());
        System.out.println(trabnb.toString());
        */
    }
}