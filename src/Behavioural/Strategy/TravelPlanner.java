package Behavioural.Strategy;

public class TravelPlanner {
    private TravelStrategy travelStrategy;

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travel(String destination) {
        if (travelStrategy == null) {
            throw new IllegalStateException("TravelStrategy not set");
        }

        travelStrategy.travelTo(destination);
    }
}

