package jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.List;

	public class JdbcExample {
		
		public void insertCustomer(int custId,String custName,String address,int accountNumber,double balance) {
			Connection conn = null;
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapient_db", "root", "root");

				PreparedStatement pst=conn.prepareStatement("insert into customer(custId,custName,address,accountNumber,balance)values(?,?,?,?,?)");
				pst.setInt(1, custId);
				pst.setString(2, custName);
				pst.setString(3, address);
				pst.setInt(4,accountNumber );
				pst.setDouble(5, balance);
				
				int result = pst.executeUpdate();

					System.out.println("Rows are inserted"+result);
				}catch (ClassNotFoundException e) {
				System.out.println("Driver not found..");
		     	} catch (SQLException e){
				e.printStackTrace();
		    	} finally {
				try {
				 conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
		    }
			}

		}
		
		public void updateBalance(int custId,double  balance)
		{
			Connection conn = null;
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapient_db", "root", "root");

				PreparedStatement pst=conn.prepareStatement("update customer set balance=? where custId=?");
				pst.setDouble(1, balance);
				pst.setInt(2, custId);
				
				
				int result = pst.executeUpdate();

					System.out.println("Rows are updated"+result);
				}catch (ClassNotFoundException e) {
				System.out.println("Driver not found..");
		     	} catch (SQLException e){
				e.printStackTrace();
		    	} finally {
				try {
				 conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
		    }
			}

		}
		
		public void delete(int custId)
		{
			Connection conn = null;
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapient_db", "root", "root");

				PreparedStatement pst=conn.prepareStatement("delete from customer where custId=?");
				pst.setInt(1, custId);
					
				int result = pst.executeUpdate();

					System.out.println(result+" Rows are deleted");
				}catch (ClassNotFoundException e) {
				System.out.println("Driver not found..");
		     	} catch (SQLException e){
				e.printStackTrace();
		    	} finally {
				try {
				 conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
		    }
			}

		}
		
		public void getCustomerDetails()
		{
			Connection conn = null;
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapient_db", "root", "root");

				PreparedStatement pst=conn.prepareStatement("select * from customer");
				
				ResultSet rs = pst.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("custId");
					String name = rs.getString("custName");
					String city = rs.getString("address");
					int account = rs.getInt("accountNumber");
					double balance=rs.getDouble("balance");
					System.out.println(id + " " + name + " " + city + " " + account+" "+balance);
				}

			} catch (ClassNotFoundException e) {
				System.out.println("Driver not found..");
			} catch (SQLException e){
				e.printStackTrace();
			} finally {
				try {
				 conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
		    }
			}

		}
		
		public void getCustomerWithId(int custId)
		{
			Connection conn = null;
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapient_db", "root", "root");

				PreparedStatement pst=conn.prepareStatement("select * from customer where custId=?");
				pst.setInt(1, custId);
				
				ResultSet rs = pst.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("custId");
					String name = rs.getString("custName");
					String city = rs.getString("address");
					int account = rs.getInt("accountNumber");
					double balance=rs.getDouble("balance");
					System.out.println(id + " " + name + " " + city + " " + account+" "+balance);
				}

			} catch (ClassNotFoundException e) {
				System.out.println("Driver not found..");
			} catch (SQLException e){
				e.printStackTrace();
			} finally {
				try {
				 conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
		    }
			}

		}
		
		

		}


