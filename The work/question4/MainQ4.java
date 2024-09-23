public class MainQ4 {
    public static void main(String[] args){
        CliantQ4 cliant = new CliantQ4("Elham", 11, "Kampala");
        System.out.println("The Cliant name is: " + cliant.getCliantName());
        System.out.println("The Cliant order is: " + cliant.getCliantOrder());
        System.out.println("The Cliant address is: " + cliant.getAddress());

        StoreQ4 Store = new StoreQ4(2499, "Elham",11,"Kampala");
        System.out.println("The Store ID is: " + Store.getStoreID());
    }
}