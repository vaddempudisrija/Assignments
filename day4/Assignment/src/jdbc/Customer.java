package jdbc;

	public class Customer {

		private int custId;
		private String custName;
		private String address;
		private int accountNumber;
		private double balance;
		
		public Customer() {
			
		}

		public Customer(int custId, String custName, String address, int accountNumber, double balance) {
			this.custId = custId;
			this.custName = custName;
			this.address = address;
			this.accountNumber = accountNumber;
			this.balance = balance;
		}

		public int getCustId() {
			return custId;
		}

		public void setCustId(int custId) {
			this.custId = custId;
		}

		public String getCustName() {
			return custName;
		}

		public void setCustName(String custName) {
			this.custName = custName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		@Override
		public String toString() {
			return custId+" "+custName+" "+address+" "+accountNumber+" "+balance;
		}
		 
	}


