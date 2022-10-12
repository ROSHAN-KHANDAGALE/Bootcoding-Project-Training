package com.online.restaurant.app;

    import com.online.restaurant.Customer;
    import com.online.restaurant.Order;
    import com.online.restaurant.Vendor;

    import java.util.Date;

public class Application {
       public static void main ( String[] args){
           //For Customer Data
           Customer ramesh = new Customer();
           ramesh.setName("Ramesh");
           ramesh.setCity("Nagpur");
           ramesh.setState("Maharashtra");
           ramesh.setEmailID("abc@gmail.com");
           ramesh.setPhone(984572156);
           ramesh.setAddress("KDK,Nagpur");

           System.out.println("Name = " + ramesh.getName());
           System.out.println("City = " + ramesh.getCity());
           System.out.println("State = " + ramesh.getState());
           System.out.println("EmailID    = " + ramesh.getEmailID());
           System.out.println("Phone Number = " + ramesh.getPhone());
           System.out.println("Address = " + ramesh.getAddress());

           //For Vendor Data
           Vendor haldiram = new Vendor();
           haldiram.setName("Haldiram Veg");
           haldiram.setAddress("Ajni Square, Nagpur");
           haldiram.setCategory("Veg");
           haldiram.setPhone(459815426);
           haldiram.setRating(5.0);
           haldiram.setState("Maharashtra");
           haldiram.setCity("Nagpur");

           System.out.println("Vendor Name = " + haldiram.getName());
           System.out.println("Vendor Address = " + haldiram.getAddress());
           System.out.println("Category = " + haldiram.getCategory());
           System.out.println("Phone Number = " + haldiram.getPhone());
           System.out.println("Rating = " + haldiram.getRating());
           System.out.println("State = " + haldiram.getState());
           System.out.println("City = " + haldiram.getCity());

           //For Order
           Order order = new Order();
           order.setCustomer(ramesh);
           order.setVendor(haldiram);
           order.setPrice(999.00);
           order.setOrderDate(new Date());
           order.setDeliveryaddress("101, Civil Lines, Nagpur");
       }
}
