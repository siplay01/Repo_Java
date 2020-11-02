package homework.homowork_9;

public class RestaurantApp {

    /**
     * 2 Classes
     * Restaurant -> all methods and variables
     * RestaurantApp -> main method,
     * in inside main...will create object of Restaurant class, and use methods from Restaurant class
     */

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Cafe", 24);
        restaurant.printsRestaurantSummary();
        restaurant.seatsAvailable();
        restaurant.seatsParty(4);
        restaurant.seatsParty(7);
        restaurant.seatsAvailable();
        restaurant.removesParty(3);
        restaurant.seatsAvailable();
        restaurant.printsRestaurantSummary();
    }
}
