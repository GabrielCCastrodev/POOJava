package POOAula1;
import java.util.Scanner;

public class Main {
	
		public static void main(String[] args) {
			
			Musica musica = new Musica("Andorinhas",1990, "Sertanejo");
			Compositor compositor = new Compositor("Trio parada dura", "Brasileiro");
			musica.adicionarCompositor(compositor);
			System.out.println(musica);
			
		}

}
