package LoanApplication;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public  class LoanDaoImpl extends LoanRequest implements LoanDao {
//list is working as a database
	List<LoanRequest> reqList = new ArrayList<LoanRequest>();
	
public LoanDaoImpl() {
//User(String userType,long userId,String userName,String userpassword,long userPhone,String userEmail)
		super();
		LoanRequest r1=new LoanRequest("123456123456",1000.0,12,100,9,"Accepted","Home_Loan");
		 reqList.add(r1);
		
	}
	public  LoanRequest addLoanRequest(LoanRequest req) {
	//Adds a new User
	reqList.add(req);
		System.out.println("Record updated ");
		return req;
				}	
	public void viewLoanRequest(String accountIdId) {
	//Shows the details of loan request identifiable by the account id.
	Iterator itr=reqList.iterator();
	while(itr.hasNext()) {
		LoanRequest us=(LoanRequest)itr.next();
		if(accountId.equals(us.getAccountId())) {
System.out.println(us.getAccountId()+" | "+us.getAmount()+" | "+us.getTenure()+" | "+us.getCreditScore()+" | "+us.getRoi()+" | "+us.getStatus()+ "|" + us.getType());
break;		}
	
	}	
}
public void viewAllLoanRequest() {
	//Shows the details of all loan requesters
		Iterator itr=reqList.iterator();
			while(itr.hasNext()) {
				LoanRequest us=(LoanRequest)itr.next();
				System.out.println("\n\nAccount Id:" + us.getAccountId()+"\nAmount: "+us.getAmount()+"\nTenure:"+us.getTenure()+"\nCredit Score:"+us.getCreditScore()+"\nRate of Interest:"+us.getRoi()+"\nLoan Status:"+us.getStatus()+ "\nLoan Type:" + us.getType());
					}
		
		}

	public void validateLoanRequest(LoanRequest req) {
	//Validates the attributes of a user
		Iterator itr=reqList.iterator();
		while(itr.hasNext()) {
			LoanRequest r=(LoanRequest)itr.next();
			//overridding equals method
if(req.equals(r) ) {
	System.out.println("Loan Request Accepted");
	System.out.println("Enter the amount:");
	Scanner sc = new Scanner(System.in);
	double amount = sc.nextInt();
	
	return;
}
		}
		System.out.println("Loan Request Rejected");
}
	}
	

