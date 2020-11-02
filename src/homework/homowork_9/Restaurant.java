package homework.homowork_9;

public class Restaurant {

    /**
     * Create a Restaurant class with attribute name, guestCapacity, guestCount
     * 1. Create a method that tells user if the seats are available
     * 2. Create a method that seatsParty
     * 3. Create a method that removesParty
     * 4. Create a Constructor-method that allows host open for services by passing restaurant name/guestCapacity
     * 5. Create a method that printsRestaurantSummary
     *      Name:
     *      Current Guest Count:
     *      Guest Capacity:
     */

    private String restaurantName;
    private int guestCapacity;
    private int guestCount = 0;

    public Restaurant(String restaurantName, int guestCapacity) {

        this.restaurantName = restaurantName;
        this.guestCapacity = guestCapacity;
    }

    public void seatsAvailable() {

        if(guestCapacity > guestCount) {
            System.out.println(guestCapacity - guestCount + " seats are available.");
        } else {
            System.out.println("No available seats.");
        }
    }

    public void seatsParty(int num) {

        if (guestCapacity - guestCount > num) {
            guestCount += num;
        } else {
            System.out.println("Not enough seats.");
        }
    }

    public void removesParty(int num) {

        if(guestCount >= num) {
            guestCount -= num;
        } else {
            System.out.println("Wrong input.");
        }
    }

    public void printsRestaurantSummary() {

        System.out.println(
                " -= Restaurant Summary =-\n" +
                " * Name: " + restaurantName + "\n"+
                " * Current Guest Count: " + guestCount + "\n" +
                " * Guest Capacity: " + guestCapacity);
    }
}

