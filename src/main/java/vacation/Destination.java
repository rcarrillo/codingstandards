// Copyright (C) 2020
// All rights reserved
package vacation;

public class Destination {
    private String name;
    private boolean isPopular;
    private float popularFee;

    /**
     * The place where travelers are going in their vacation
     * @param newName Place name
     * @param newIsPopular It's true if it's a tourist spot
     * @param newPopularFee Extra fee if it's a tourist spot
     */
    public Destination(String newName, boolean newIsPopular, float newPopularFee) {
        name = newName;
        isPopular = newIsPopular;
        popularFee = newPopularFee;
    }

    public String getName() {
        return name;
    }

    public boolean isPopular() {
        return isPopular;
    }

    public float getPopularFee() {
        return popularFee;
    }

    @Override
    public String toString() {
        return name;
    }
}
