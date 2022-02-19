package gestione_studente;

public class Studente {
	
	public String nome;
	public String cognome;
	public String classe;
	public Valutazione voti[];
	public int i=0;
	
	public Studente(String nome1,String cognome1,String classe1,int n_materie) {
		nome=nome1;
		cognome=cognome1;
		classe=classe1;
		try {
			voti = new Valutazione[n_materie];
		}catch(Exception e) {}
	}
	
	public void registraMateria(String materia1,int voto1) {
		voti[i++] = new Valutazione(materia1,voto1);
	}
	
	public double calcMedia() {
		double sum=0;
		for(int i=0;i<voti.length;i++) {
			sum += voti[i].voto;
		}
		return sum/voti.length;
	}
	
	public int valutazioneMateria(String materia1) {
		for(int i=0;i<voti.length;i++) {
			if(materia1.equals(voti[i].materia)) {
				return voti[i].voto;
			}
		}
		
		return 0;
	}
	
}