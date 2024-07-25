import java.util.List;

public class VehicleRentalSystem {
    List<User> users;
    List<Store> stores;

    public VehicleRentalSystem(List<User> users, List<Store> stores) {
        this.users = users;
        this.stores = stores;
    }

    public Store getStore(Location location) {
        // Based upon location, we will filter out the store from stores
        return stores.get(0);
    }
}
