package Planes;


public class Flight {
    public String origin;
    public String destination;
    public String depTime;
    public String arrTime;
    public String dateFlight;
    public AirPlane airplane;
    
    //Constructor
    public Flight(String origin, String dest, String dtFlight, AirPlane airp){
        this.origin = origin;
        this.destination = dest;
        this.dateFlight = dtFlight;
        this.airplane = airp;
    }
    
    //Creating an override toString method to return airplane infos
    @Override
    public String toString(){
        String st = "Flight Information:\n" +
        "Date: "+ this.dateFlight +"\n" +
        "From: "+ this.origin +" to "+ this.destination +"\n" +
        "Flight time: "+ this.depTime +" to "+ this.arrTime +"\n" +
        "Plane Information:\n" +
        "Aircraft : "+ this.airplane.getMake() +" "+ this.airplane.getModel() +"\n" +
        "Capacity: "+ this.airplane.capacity() +" seats\n" +
        "Pilot: "+ this.airplane.getPilot() ;
        return st;
    }
    
    //Creating method schedule to alter arrival
    public void schedule(String arrivalTime){
        this.arrTime = arrivalTime;
    } 
    
   //Creating method schedule to alter arrival and departure
    public void schedule(String arrivalTime, String departureTime){
        this.arrTime = arrivalTime;
        this.depTime = departureTime;
    }
    
}
