public class TestSingleton {
    public static void main(String[] args){
        Restaurant r = Restaurant.createInstance();
        r.printRestaurant();
        Restaurant r1 = Restaurant.createInstance();
        r1.printRestaurant();
    }
}
