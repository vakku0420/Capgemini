package LoanApplication;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LoanDaoImpl implements LoanDao {
	
	public static ArrayList<LoanRequest> accid =new ArrayList<>();
	
   //list is working as a database
   List<LoanRequest> LoanReques;
   LoanRequest request1;
   LoanRequest request2;

   public LoanDaoImpl(){
      LoanReques = new ArrayList<LoanRequest>();		
   }
  
   //retrive list of students from the database
   @Override
   public void getAllLoanRequest() {
	   
   }

@Override
public void getLoanRequest() {
	// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	DataInputStream din=new DataInputStream(System.in);
	System.out.println("Enter accountid");
    try {
		String id = br.readLine();
		if(id.length()==12)
         System.out.println("Account Id:" + id);
		else {
	        throw new Exception("Invalid AccountId");
	    }
	} catch(Exception e){
	    System.out.println ("Invalid AccountId");
	}
    
    System.out.print("Enter amount:");
    try {
    	double amount =Double.parseDouble(br.readLine());;
    	if(amount>=1000 && amount<=10000000 )
    	System.out.println("Amount:" + amount);
    	else {
    		throw new Exception("Enter the amount in range 1000-10000000");
    	}
    }catch(Exception e) {
    	System.out.println("Enter the amount in range 1000-10000000");
    }
    
    System.out.println("Enter tenure:");
    try {
    	int tenure =Integer.parseInt(br.readLine());
    	if(tenure >=12 && tenure <=240)
    	System.out.println("tenure:" + tenure);
    	else {
    		throw new Exception("Enter tenure in range 12-240");
    	}
    }catch(Exception e) {
    	System.out.println("Enter tenure in range 12-240");
    }
    
    System.out.println("Enter Credit Score:");
    try {
    	int creditScore =Integer.parseInt(br.readLine());
    	if(creditScore >=100 && creditScore <=999)
    	System.out.println("Credit Score:" + creditScore);
    	else {
    		throw new Exception("Enter credit score in range 100-999");
    	}
    }catch(Exception e) {
    	System.out.println("Enter credit score in range 100-999");
    }
    
    System.out.println("Enter rate of interest:");
    try {
    	double roi =Double.parseDouble(br.readLine());
    	if(roi>=4 && roi<=15)
    	System.out.println("Rate of Interest:" + roi);
    	else {
    		throw new Exception("Enter rate of interest in range 4-15");
    	}
    }catch(Exception e) {
    	System.out.println("Enter rate of interest in range 4-15");
    }
    
    System.out.println("Enter Loan Status \n1 for Accepted \n2 for Rejected \n3 for Pending");
    try {
    	String status = br.readLine();
    	if(status.equals("Accepted") || status.equals("Rejected") || status.equals("Pending")) 
    		System.out.println("Loan Status :" + status);
    	
    	else {
    		throw new Exception("Select the valid loan status from given options");
    	}
    }catch(Exception e) {
    	System.out.println("Select the valid loan status from given options");
    }
    
    System.out.println("Enter Loan Type:");
    try {
    	String type =br.readLine();
    	if(type.equals("Education Loan") || type.equals("Home Loan") || type.equals("Vehicle Loan"))
    	System.out.println("Loan Type:" + type);
    	else {
    		throw new Exception("Select the valid loan type from given options");
    	}
    }catch(Exception e) {
    	System.out.println("Select the valid loan type from given options");
    }
    
   
}}
