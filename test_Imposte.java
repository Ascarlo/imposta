import java.util.Scanner;
public class test_Imposte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x = new Scanner (System.in);
		Scanner y = new Scanner (System.in);

		Imposte oggetto1 = new Imposte();
		int scelta = 0;
		
		System.out.print("inserisci l'ammontare dell'imposta: ");
		double imposta = x.nextInt();
		
		System.out.println("l'attuale imposta base è del 4% e quella di lusso è del 10%");
		System.out.print("vuoi cambiarle? ");
		if (y.nextLine().equals("si")) {
			
			System.out.print("inserisci 1 per cambiare l'imposta di base, 2 per cambiare l'imposta di lusso: ");
			scelta = x.nextInt();
			if (scelta == 1) {
					
				System.out.print("inserisci il valore della nuova imposta di base: ");
				oggetto1.cambiaImpostaBase(x.nextDouble());
			}
			else if (scelta == 2) {
					
				System.out.print("inserisci il valore della nuova imposta di lusso: ");
				oggetto1.cambiaImpostaLusso(x.nextDouble());
			}
			else {
					
				System.out.println("non hai inserito un numero valido, reisnerisci");
			}
		}
		
		System.out.println("inserisci 1 per visualizzare l'imposta sommata all'aumento dell'imposta di base");
		System.out.println("inserisci 2 per visualizzare l'imposta sommata all'aumento dell'imposta di lusso");
		scelta = x.nextInt();
		if (scelta == 1) {
				
			double prezzo = oggetto1.ComputaCostoBase(imposta);
			System.out.println("valore dell'imposta di base: " + prezzo);
		}
		else if (scelta == 2) {
				
			double prezzo = oggetto1.ComputaCostoLusso(imposta);
			System.out.println("valore dell'imposta di lusso: " + prezzo);
		}
		else{
				
			System.out.println("non hai inserito un numero valido, reisnerisci");
		}	
	}
}