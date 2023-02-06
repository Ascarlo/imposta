import java.text.DecimalFormat;
public class Imposte {

	private static double ImpostaBase = 4;
	private static double ImpostaLusso = 10;

	public static void cambiaImpostaLusso(double nuovaImpostaLusso) {
		ImpostaLusso = nuovaImpostaLusso;
	}

	public static void cambiaImpostaBase(double nuovaImpostaBase) {
		ImpostaBase = nuovaImpostaBase;
	}
	
	//metodo per aumentare l'imposta base
	public static double ComputaCostoBase (double prezzo) {
		
		//calcolo dell'aumento
		double aumento = (prezzo / 100) * ImpostaBase;
		return prezzo + ArrotondaCentesimoVicino(aumento);
	}
	
	//metodoaumentare l'imposta di lusso
	public static double ComputaCostoLusso (double prezzo) {
		
		//calcolo dell'aumento
		double aumento = (prezzo / 100) * ImpostaLusso;
		return prezzo + ArrotondaCentesimoVicino(aumento);
	}
	
	//metodo per diminuire a arrotondare per eccesso e diminuire a 2 il numero di decimali
	public static double ArrotondaCentesimoVicino(double aumento) {
		
		double taglio = Math.round(aumento * 100.0) / 100.0;
		return taglio;
	}
}