
// Implementing concrete classes for different transportation types
// Ship class implementing the Transport interface for sea transportation
public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by sea (Ship)");
    }
}
