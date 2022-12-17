public class Ifnestedexample {
	public static void main(String[] args) {
		int umur=17;
		boolean hamil=false;
		if(umur>=18) {
			if(hamil==false) {
				System.out.println("Vaksin AstraZeneca");
			} else {
				System.out.println("Vaksin Sinovac");
				System.out.println("Vaksin Pfizer");
				System.out.println("Vaksin Moderna");
			}
		} else {
			System.out.println("Vaksin Sinovac");
		}
	}
}