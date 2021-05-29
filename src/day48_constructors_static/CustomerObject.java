package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObject {
    public static void main(String[] args) {
        Customer cs1=new Customer();
        System.out.println(cs1.toString()); // printing with the default values that are set in no args constructor

        cs1.setId(1);
        cs1.setName("bob");
        System.out.println(cs1);

        Customer cs2=new Customer("mike", 2); // crete object tans assign values in the same statement
        Customer cs3=new Customer("John", 24873);
        System.out.println(cs2);
        System.out.println(cs3);

        // array of customers
        Customer[]todaysCustomers = {cs1,cs2,cs3, new Customer("bashir",449)};

        //arrayList of customer objects
        List<Customer> customerList=new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("bashr",449));
        customerList.add(new Customer("Suleyman",9763));

        // print information of first customer object in array and arraylist

        System.out.println(todaysCustomers[0].toString());
        System.out.println(customerList.get(0).toString());
        System.out.println(customerList);
        System.out.println("---------------- for Loop -------------");
        for(int i = 0; i < customerList.size();i++){
            System.out.println(customerList.get(i));
        }

        System.out.println("---------------- for each loop ----------");

        for(Customer eachCustomer:customerList ){
            System.out.println(eachCustomer);
        }

        System.out.println("-------------- lambda expression names of customers -----------");
        customerList.forEach(each-> System.out.println(each.getName()));

        System.out.println("------- for each -------");
        for(Customer eachCustomer: customerList){
            System.out.println(eachCustomer.getName());
        }


    }
}
