public class LogisticsClient {
    public static void main(String[] args) {
        // Create RoadLogistics instance to handle land transportation
        Logistics roadLogistics = new RoadLogistics();
        /*// Plan and execute land delivery
        roadLogistics.planDelivery();*/

        // Use the factory method to create a Transport object without knowing it's a Truck
        Transport landTransport = roadLogistics.createTransport();

        // Plan and execute the land delivery without knowing it's a Truck
        landTransport.deliver();

        // Create SeaLogistics instance to handle sea transportation
        Logistics seaLogistics = new SeaLogistics();
       /* // Plan and execute sea delivery
        seaLogistics.planDelivery();*/

        // Use the factory method to create a Transport object without knowing it's a Ship
        Transport seaTransport = seaLogistics.createTransport();

        // Plan and execute the sea delivery without knowing it's a Ship
        seaTransport.deliver();
    }
}
