
// SeaLogistics specializes in creating Ship objects for sea transportation
public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        // Create and return a new Ship object
        return new Ship();
    }
}
