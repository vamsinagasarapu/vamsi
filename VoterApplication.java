package vamsi;

public class VoterApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to voter application");
		VoterDetails vd=new VoterDetails();
		vd.setVoterID("BDCPN0012K");
		vd.setVoterName("Vamsi Krishna");
		System.out.println("Voter ID is :"+vd.getVoterID()+"\nVoter Name is :"+vd.getVoterName());
		System.out.println("\n the Voter details are as shown above :");
		System.out.println("\n End of the application");
		

	}

}
