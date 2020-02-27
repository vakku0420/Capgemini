package LoanApplication;
import java.util.List;
//creating interface
public interface LoanDao {
	
	public LoanRequest addLoanRequest(LoanRequest reqList);
	public void viewLoanRequest(String accountId);
	}

