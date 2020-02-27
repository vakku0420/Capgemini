package LoanApplication;
import java.util.Scanner;
import LoanApplication.LoanDao;
import LoanApplication.LoanDaoImpl;
import LoanApplication.LoanRequest;
import Validator.Validator;
public class LoanApplication {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validator validator = new Validator();
		LoanDao loan= new LoanDaoImpl();
		System.out.println("Enter \n1.Loan Request \n2.Loan Disbursal");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option) {
		case 1:{
         // Loan Request
			
System.out.println("Enter the AccountId: ");
			String accountId=sc.next();
			try {
			validator.validateAccountId(accountId);}
			catch(Exception e) {
				System.out.println(e);
				break;
			}
System.out.println("Enter the amount:");
			double amount = sc.nextDouble();
			try {
				validator.validateAmount(amount);}
				catch(Exception e) {
					System.out.println(e);
					break;
					}
System.out.println("Enter the tenure:");
			int tenure = sc.nextInt();
			try {
				validator.validateTenure(tenure);}
				catch(Exception e) {
					System.out.println(e);
					break;
					}
System.out.println("Enter the credit score:");
			int creditScore = sc.nextInt();
			try {
				validator.validateCreditScore(creditScore);}
				catch(Exception e) {
					System.out.println(e);
					break;
					}
System.out.println("Enter the rate of interest:");
			double roi = sc.nextDouble();
			try {
				validator.validateRoi(roi);}
				catch(Exception e) {
					System.out.println(e);
					break;
					}
System.out.println("Enter the loan status: \n1.Accepted \n2.Rejected \n3.Pending");
            
			String status=sc.next();
			try {
				validator.validateStatus(status);}
				catch(Exception e) {
					System.out.println(e);
					break;
					}
			
System.out.println("Enter the loan type: \n1.Home_Loan \n2.Education_Loan \n3.Vehicle_Loan");
			String type = sc.next();
			try {
				validator.validateType(type);}
				catch(Exception e) {
					System.out.println(e);
					break;
					}


			LoanDaoImpl l=new LoanDaoImpl();
			LoanRequest r = new LoanRequest(accountId,amount,tenure,creditScore,roi,status, type);
			l.addLoanRequest(r);

			l.viewAllLoanRequest();
		     break;

			
		}
		case 2:{
			
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the AccountId");
			String accountId=sc1.nextLine();
			
					
			LoanDaoImpl ux=new LoanDaoImpl();
			LoanRequest userlog = new LoanRequest(accountId);
		    ux.validateLoanRequest(userlog);
			//viewing LoanRequest details by AccountId 
		    ux.viewLoanRequest("1234");
			break;
		}
		}
		}
	}
