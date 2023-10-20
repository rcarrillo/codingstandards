// Copyright (C) 2020
// All rights reserved
package vacation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /**
     * Entry point
     * @param args Process arguments
     */
    public static void main(String[] args) {
        Destination[] destinations = new Destination[3];

        destinations[0] = new Destination("Paris", true, 500f);
        destinations[1] = new Destination("New York", true, 600f);
        destinations[2] = new Destination("Guayaquil", false, 0f);

        System.out.println("Vacation package cost calculator");

        System.out.println("Available destinations:");
        for (int i = 0; i < destinations.length; i++) {
            System.out.println((i + 1) + ") " + destinations[i]);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Destination? [1-" + destinations.length + "]");
        int destinationIndex = getUserInput(input);
        if  (destinationIndex < 1 || destinationIndex > destinations.length) {
            System.out.println("Destination must be a number between 1 and " + destinations.length);
            System.exit(1);
        }

        System.out.println("Number of travelers?");
        int travelers = getUserInput(input);
        if (travelers < 1 || travelers > 80) {
            System.out.println("Number of travelers must a number between 1 and 80");
            System.exit(1);
        }

        System.out.println("Duration of the vacation in days?");
        int duration = getUserInput(input);
        if (duration < 1) {
            System.out.println("Duration of the vacation must be a positive number");
            System.exit(1);
        }
 
        Vacation vacation = new Vacation(destinations[destinationIndex], duration, travelers);
        System.out.println("Total vacation package cost: $" + vacation.getCost());        
    }

    /**
     * Get user input as primitive integer
     * @param input user input
     * @return
     */
    private static int getUserInput(Scanner input) {
        try {
            return input.nextInt();        	
        } catch (InputMismatchException e) {
            System.out.println("Debe ser un número");
            System.exit(1);
        }

        return -1;
    }
}
