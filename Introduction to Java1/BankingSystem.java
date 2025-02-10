public class BankingSystem {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        BOI boi = new BOI();
        ICICI icici = new ICICI();
        System.out.println(sbi);
        System.out.println(boi);
        System.out.println(icici);
	}
}
class Bank {
    	private String name;
    	private String headOfficeAddress;
    	private String chairmanName;
    	private int branchCount;
    	private double fdInterestRate;
    	private double personalLoanInterestRate;
    	private double homeLoanInterestRate;
   	 public String getName(){
		return name;
	 }
    	public void setName(String name){
		 this.name = name;
	 }
    	public String getHeadOfficeAddress(){
		 return headOfficeAddress;
	 }
    	public void setHeadOfficeAddress(String headOfficeAddress){
		 this.headOfficeAddress = headOfficeAddress;
	 }
    	public String getChairmanName(){
		 return chairmanName;
	 }
    	public void setChairmanName(String chairmanName){
		 this.chairmanName = chairmanName;
	 }
    	public int getBranchCount(){
		 return branchCount;
	 }
    	public void setBranchCount(int branchCount){
		 this.branchCount = branchCount;
	 }
   	 public double getFdInterestRate(){
		 return fdInterestRate;
	 }
    	public void setFdInterestRate(double fdInterestRate){
		 this.fdInterestRate = fdInterestRate;
	 }
    	public double getPersonalLoanInterestRate(){
		 return personalLoanInterestRate;
	 }
    	public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
		 this.personalLoanInterestRate = personalLoanInterestRate;
	 }
    	public double getHomeLoanInterestRate(){
		 return homeLoanInterestRate;
	 }
    	public void setHomeLoanInterestRate(double homeLoanInterestRate){
		 this.homeLoanInterestRate = homeLoanInterestRate;
		}
    	public String toString(){
        return "Bank Name: " + name +"\nHead Office: " + headOfficeAddress +"\nChairman: " 
		+ chairmanName +"\nBranch Count: " + branchCount +"\nFD Interest Rate: " + fdInterestRate + " " +
               "\nPersonal Loan Interest Rate: " + personalLoanInterestRate + " " +
               "\nHome Loan Interest Rate: " + homeLoanInterestRate + "%\n"; }
	}
class SBI extends Bank {
    public SBI() {
        setName("SBI");
        setHeadOfficeAddress("Okhla Vihar, New Delhi");
        setChairmanName("Zaid Khan");
        setBranchCount(2800);
        setFdInterestRate(7.4);
        setPersonalLoanInterestRate(11.6);
        setHomeLoanInterestRate(7.5);
	}
}
class BOI extends Bank {
    public BOI() {
        setName("BOI");
        setHeadOfficeAddress("Rohini,New Delhi");
        setChairmanName("Aryan Sharma");
        setBranchCount(8100);
        setFdInterestRate(5.1);
        setPersonalLoanInterestRate(10.8);
        setHomeLoanInterestRate(7.3);
	}
}
class ICICI extends Bank {
    public ICICI() {
        setName("ICICI");
        setHeadOfficeAddress("Sector 143, Noida");
        setChairmanName("Nitin Kumar");
        setBranchCount(5000);
        setFdInterestRate(5.2);
        setPersonalLoanInterestRate(10.2);
        setHomeLoanInterestRate(8.7);
	}
}

