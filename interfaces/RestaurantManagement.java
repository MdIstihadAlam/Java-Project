package interfaces;
import java.lang.*;
import classes.*;

public interface RestaurantManagement
{
	void insertRestaurant(Restaurant r);
	void removeRestaurant(Restaurant r);
	Restaurant getRestaurant(String rid);
	void showAllRestaurants();
}