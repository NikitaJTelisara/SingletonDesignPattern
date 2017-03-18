/*The Singleton pattern ensures that a class has only one instance and ensures access to
        the instance through the application. It can be useful in cases where you have a "global"
        object with exactly one instance. For example, we may want to implement Restaurant
        such that it has exactly one instance of Restaurant.*/
public class Restaurant {
    /* Singleton Instance is always private*/
    private static  Restaurant restaurantInstance = null;

    public static Restaurant createInstance(){
        if(restaurantInstance == null){
            System.out.println("creating instance");
            restaurantInstance = new Restaurant();
        }
        return restaurantInstance;
    }
    /* protected as it it used by same class + classes in same package+ subclasses */
    protected static void printRestaurant(){
       System.out.println("This is a restaurant");
    }
}
