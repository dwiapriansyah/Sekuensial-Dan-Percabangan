import java.util.Scanner;
public class Nilai {
	
	public static void main(String[] args) {
		int nilai;
		System.out.println("Masukkan Nilai Anda:");
		Scanner inputan = new Scanner (System.in);
		nilai = inputan.nextInt();
		
		if ( nilai >= 80 ) {
			   System.out.println("Nilai A");
		}
		if ( nilai >= 70 && nilai < 80 ) {
			   System.out.println("Nilai B");
		}
		if ( nilai >= 59 && nilai < 70 ) {
			   System.out.println("Nilai C");
		}
		if ( nilai >= 45 && nilai < 59 ) {
			   System.out.println("Nilai D");
		}
		if ( nilai < 45 ) {
			   System.out.println("Nilai E");
		}
	}
}