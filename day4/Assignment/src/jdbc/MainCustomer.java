package jdbc;

import java.util.List;

public class MainCustomer {
	

		public static void main(String[] args) {
			CustomerDao details=new CustomerDaoImp();
			Customer c=details.findCustomerById(001);
	        System.out.println(c);
	        
	        System.out.println("________________________-");
	        
	        System.out.println(details.set(new Customer(34,"Srija","Pune",5436,86000)));
	        
	        System.out.println("________________________");
	        
	        System.out.println(details.delete(5));
	        
	        System.out.println("________________________");
	        
	        List<Customer> lst=details.listAll();
	        for(Customer cus:lst)
	        {
	        	System.out.println(cus);
	        }
		}

	}



