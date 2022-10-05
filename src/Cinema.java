import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int eta , prezzoUnder = 6, sconto = 2, prezzoOver = 10;
		
		System.out.println("Calcolo prezzo biglietto");
		System.out.print("Inserire l'eta del utente: ");
		eta = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Inserire il giorno di oggi: ");
		String giorno = sc.nextLine();
		
		if(eta < 7) {
			
			System.out.println("Il biglietto per questo utente è gratis");
			
		}else if(eta == 7 || eta < 15) {
			
			if(giorno.equalsIgnoreCase("Mercoledi")) {
				System.out.println("Il biglietto per questo utente è di: "+(prezzoUnder - sconto)+" Euro");
			}else {
				System.out.println("Il biglietto per questo utente è di: "+prezzoUnder+" Euro");
			}
			
		}else{
			
			if(giorno.equalsIgnoreCase("Mercoledi")) {
				System.out.println("Il biglietto per questo utente è di: "+(prezzoOver - sconto)+" Euro");
			}else {
				System.out.println("Il biglietto per questo utente è di: "+prezzoOver+" Euro");
			}
		
		}
		
		sc.close();
	}
}
