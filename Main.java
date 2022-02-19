package gestione_studente;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		int n_studenti=0,n_materie=0,voto=0;
		Studente st[];
		String dato="",nome="",cognome="",classe="",materia="";
		
	    InputStreamReader input = new InputStreamReader(System.in);
	    BufferedReader tastiera= new BufferedReader (input);
	    
	    try {
	    	System.out.print("Inserire il numero di materie: ");
	    	dato=tastiera.readLine();
	    	System.out.print("\n");
	    	n_materie = Integer.valueOf(dato).intValue();
	    	System.out.print("Inserire il numero di studenti: ");
	    	dato=tastiera.readLine();
	    	System.out.print("\n");
	    	n_studenti = Integer.valueOf(dato).intValue();
	    }catch(Exception e) {}
	    
	    st = new Studente[n_studenti];
		
		for(int i=0;i<n_studenti;i++) {
			try {
				System.out.println("Inserire il nome dello studente "+(1+i)+": ");
				nome = tastiera.readLine();
				System.out.println("Inserire il cognome dello studente "+(1+i)+": ");
				cognome = tastiera.readLine();
				System.out.println("Inserire la classe dello studente "+(1+i)+": ");
				classe = tastiera.readLine();	
			}catch(Exception e) {System.out.println("errore d'inserimento");}
			
			st[i] = new Studente(nome,cognome,classe,n_materie);
			
			
			for(int j=0;j<n_materie;j++) {
				try{
					System.out.println("Inserire la materia n."+(1+j)+ " :");
					materia = tastiera.readLine();
					System.out.println("Inserire il voto della materia "+materia+" : ");
					dato = tastiera.readLine();
					voto = Integer.valueOf(dato).intValue();
				}catch(Exception e) {}
				
				st[i].registraMateria(materia, voto);
			}
		}
		

	}

}