
// Creating abstract Logistics class with a factory method
public abstract class Logistics {
    // Factory method to create transportation objects
    public abstract Transport createTransport();

    // Method to plan delivery using the created transportation object
    public void planDelivery() {
        // Create transportation object using the factory method
        Transport transport = createTransport();
        // Deliver the transportation
        transport.deliver();
    }
}
