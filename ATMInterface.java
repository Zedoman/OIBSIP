package oasis;

public interface ATMInterface {
	    public void viewBalance();
	    public void withdrawAmount(double withdrawAmount);
	    public void depositAmount(double depositAmount );
	    public void viewMiniStatement();
		public void transfer(int fromacc, int toacc, int amount);

}
