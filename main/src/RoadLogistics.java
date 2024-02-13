
// Implementing concrete subclasses of Logistics
// RoadLogistics specializes in creating Truck objects for land transportation
public class RoadLogistics extends  Logistics{
    @Override
    public Transport createTransport() {
        // Create and return a new Truck object
        return new Truck();
    }
}
