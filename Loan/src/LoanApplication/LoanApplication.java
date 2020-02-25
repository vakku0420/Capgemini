package LoanApplication;

import java.util.Scanner;

public class LoanApplication {

	public static void main(String[] args) {
		LoanDaoImpl oanDao = new LoanDaoImpl();
		//System.out.print("Account Id:");
		oanDao.getLoanRequest();
	}
}