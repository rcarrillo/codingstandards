// Copyright (C) 2020
// All rights reserved
package vacation;

public class Vacation {
    private Destination destination;
    private int duration;
    private int travelers;

    /**
     * Vacation package
     * @param newDestination Place where travelers are going to
     * @param newDuration How much time the vacation is going to take
     * @param newTravelers How many travelers are going in the vacation package
     */
    public Vacation(Destination newDestination, int newDuration, int newTravelers) {
        destination = newDestination;
        duration = newDuration;
        travelers = newTravelers;
    }

    /**
     * Calculate total vacation cost
     * @return total cost
     */
    public float getCost() {
        // Base cost is $1000
        float cost = 1000.0f;

        if (destination.isPopular()) {
            cost += destination.getPopularFee();
        }

        cost = cost * (1 - getDiscountByTravelers());

        cost += getDiscountByDuration();

        return cost;
    }

    /**
     * Calculate discount for number of travelers
     * @return discount
     */
    private float getDiscountByTravelers() {
        if (travelers > 4 && travelers <= 10) {
            return 0.1f;
        }

        if (travelers > 10) {
            return 0.2f;
        }

        return 0.0f;
    }

    /**
     * Calculate discount for the vacation duration
     * @return discount
     */
    private float getDiscountByDuration() {
        if (duration < 7) {
            return -200f;
        }

        if (duration > 30 && travelers == 2) {
            return 200f;
        }

        return 0f;
    }
}
