
// Implementing concrete classes for different transportation types
// Truck class implementing the Transport interface for land transportation
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by land (Truck)");
    }
}
