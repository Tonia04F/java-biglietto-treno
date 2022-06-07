package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		/*chiedere all’utente il numero di chilometri che vuole percorrere e l’età del passeggero. 
		 * Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
			il prezzo del biglietto è definito in base ai km (0.21 € al km)
			va applicato uno sconto del 20% per i minorenni
			va applicato uno sconto del 40% per gli over 65 */

		//chiedo all utente di inserire la sua età ed i km da percorrere
		int km;
		int eta;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("inserisci km da percorrere: ");
 		km = sc.nextInt();
 		System.out.println("inserisci età passeggero: ");
 		eta = sc.nextInt();
 		
 		double prezzoBiglietto = km * 0.21;
		double prezzoScontatoRagazzo = prezzoBiglietto - (prezzoBiglietto * 0.2);
		double prezzoScontatoAnziano = prezzoBiglietto - (prezzoBiglietto * 0.4);
		
 
 		
 		if(eta<=18) {
 			System.out.println("il passeggero è minorenne quindi il prezzo del biglietto è: " + prezzoScontatoRagazzo);
 		}
 		else if (eta>=65) {
 			System.out.println("il passeggero è anziano quindi il prezzo del biglietto è: " + prezzoScontatoAnziano);
 			
 		}
 		
 		System.out.println("Buon viaggio");
 		
 		
	}

}
