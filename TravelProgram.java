import java.util.*;
public class TravelProgram 
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
        Destination des = new Destination(country, city); //Destination object
        System.out.println("Аялах зардлаа оруулна уу?");
        price= in.nextDouble();                           //price
        System.out.println("Аялах хоногийн тоогоо оруулна уу?");
        days= in.nextInt();                                 //days
        System.out.println("Буудал захиалах уу? (Тийм бол 1, Үгүй бол 0)");
        c=in.nextInt();
        switch (c)
        {
            case 1 :    System.out.println("Буудлынхаа хаягийг оруулна уу? (Улс, Хот, Гудамж, Байршил)"); //Airbnb information 
                        String street, houseID;
                        country = in.next(); //Location country
                        city = in.next(); //Location city
                        street = in.next();// Location street
                        houseID= in.next(); //Location houseID
                        Location loc  = new Location (country, city , street, houseID); //Location object for Airbnb
                        System.out.println("Буудлынхаа төлбөрийг оруулна уу?");
                        Airbnb air = new Airbnb (loc, in.nextDouble());  
                        Travel travel1 = new Travel (des, air, price, days); //Travel object 
                        System.out.println("Таны аялалын мэдээлэл: ");
                        System.out.println(travel1.toString());
                        break;
            case 0 :    Travel travel0 = new Travel (des, price, days); //Travel object 
                        System.out.println("Таны аялалын мэдээлэл: ");
                        System.out.println(travel0.toStr());
                        break;
        }
    }
}