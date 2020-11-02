package test;
import domain.Customer;
public class CustomerTest {
    
    public static void main(String[] args){
        Customer cus = new Customer();
        cus.displayCustomerInfo();
        cus.setIsNew(false);
        cus.setID(50);
        cus.setTotal(456.22);
        cus.displayCustomerInfo();
        
    }
    
}