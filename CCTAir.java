package Main;

import Planes.AirPlane;
import Planes.Flight;
import java.util.ArrayList;


/**
 *
 * @author Levi
 */
public class CCTAir {

    public static void main(String[] args) {
        //Creating number of flights
        int numberFlight = 5;
        //Creating array to store the flights
        ArrayList<Flight> list = new ArrayList<>();
        //Creating object of type AirPlane
        AirPlane air = new AirPlane("Boeing", 707, 400, "Jack");
        //Creating and adding the flights in the array
        list.add(new Flight("Dublin", "New York", "05/11/2018", air));
        list.add(new Flight("Lisbon", "Dublin", "05/10/2018", air));
        list.add(new Flight("Dublin", "Madrid", "05/09/2018", air));
        list.add(new Flight("Lisbon", "London", "05/08/2018", air));
        list.add(new Flight("Liverpool", "Porto", "05/07/2018", air));
        //Chaging the arrivel and departure
        list.get(0).schedule("16:30","10:10");
        list.get(0).schedule("18:00");
        //Displaying flights
        for (int i = 0; i < numberFlight; i++) {
            System.out.println(list.get(i).toString()+"\n");
        }
    }
    
}
