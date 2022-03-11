package jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	public class CustomerDaoImp implements CustomerDao{

		@Override
		public Customer findCustomerById(int custId) {
			Connection conn = null;
			Customer c=new Customer();
			try {
	             conn=getConnection();
				PreparedStatement pst=conn.prepareStatement("select * from customer where custId=?");
				pst.setInt(1, custId);
				
				ResultSet rs = pst.executeQuery();

				while (rs.next()) {
					c.setCustId(rs.getInt("custId"));
					c.setCustName(rs.getString("custName"));
					c.setAddress(rs.getString("address"));
					c.setAccountNumber(rs.getInt("accountNumber"));
					c.setBalance(rs.getDouble("balance"));;
					
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

			return c;
		}

		@Override
		public String set(Customer c) {
			String message="";
			Connection conn = null;
			try {
				
				conn = getConnection();
				PreparedStatement pst=conn.prepareStatement("insert into customer(custId,custName,address,accountNumber,balance)values(?,?,?,?,?)");
				pst.setInt(1, c.getCustId());
				pst.setString(2, c.getCustName());
				pst.setString(3, c.getAddress());
				pst.setInt(4,c.getAccountNumber() );
				pst.setDouble(5, c.getBalance());
				
				int result = pst.executeUpdate();

					message="Adding row is Successful";
				}catch (ClassNotFoundException e) {
				System.out.println("Driver not found..");
		     	} catch (SQLException e){
				e.printStackTrace();
				message="Not Successful";
		    	} finally {
				try {
				 conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
		    }
			}

			return message;
		}

		@Override
		public String delete(int customerId) {
			Customer c=new Customer();
			String msg="";
			Connection conn = null;
			try {
				conn = getConnection();
				PreparedStatement pst=conn.prepareStatement("delete from customer where custId=?");
				pst.setInt(1, customerId);
					
				int result = pst.executeUpdate();

					msg=result+" Rows are deleted";
				}catch (ClassNotFoundException e) {
				System.out.println("Driver not found..");
		     	} catch (SQLException e){
				e.printStackTrace();
				msg="Not deleted";
		    	} finally {
				try {
				 conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
		    }
			}
	     return msg;
		}

		@Override
		public List<Customer> listAll() {
			Connection conn = null;
			List<Customer> cusList=new ArrayList<Customer>();
			try {
				conn=getConnection();
				PreparedStatement pst=conn.prepareStatement("select * from customer");
				
				ResultSet rs = pst.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("custId");
					String name = rs.getString("custName");
					String city = rs.getString("address");
					int account = rs.getInt("accountNumber");
					double balance=rs.getDouble("balance");
					cusList.add(new Customer(id,name,city,account,balance));
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

			return cusList;
		}
		
		public Connection getConnection() throws SQLException, ClassNotFoundException
		{
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapientdb", "root", "1234");
			return conn;
		}

	}


