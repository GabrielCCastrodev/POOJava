package POOLocacao;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String args[]){
		ArrayList <Item> auxfilme = new ArrayList<Item>();
		ArrayList <Item> auxcd = new ArrayList<Item>();
		ArrayList <Item> auxjogo = new ArrayList<Item>();	
		
		//titulo,ano,duração,comentario,diretor
		auxfilme.add(new Filme("Titanic", 1997, 2,"O Titanic ta afundando!","Iceberg Productions"));
		auxfilme.add(new Filme("Titanic e o retorno do navio", 1998, 3,"O Titanic ressurge!","Iceberg Productions"));
		auxfilme.add(new Filme("Titanic e o Iceberg contrataca", 1999, 2,"O iceberg não pode ganhar!","Iceberg Productions"));
		auxfilme.add(new Filme("Titanic e o modo cruzeiro", 2000, 4,"O Titanic virou um cruzeiro!","Iceberg Productions"));
		auxfilme.add(new Filme("Titanic derrete o iceberg", 2001, 1,"O Titanic tem FOGOOOO!","Iceberg Productions"));
		auxfilme.add(new Filme("Titanic o iceberg indestrutivel parte 1", 2002, 8,"O Titanic tem que ganhar!","Iceberg Productions"));
		auxfilme.add(new Filme("Titanic o iceberg indestrutivel parte 2", 2003, 3,"O TITANIC TEM QUE GANHARRR!","Iceberg Productions"));
		auxfilme.add(new Filme("Titanic derrete iceberg", 2008, 1,"Derreteeeuuuu!","Iceberg Productions"));
		auxfilme.add(new Filme("Titanic e o iceberg revoltado", 2015, 5,"O iceberg voltaa!","Iceberg Productions"));
		auxfilme.add(new Filme("Titanic que aprendeu a voar", 2022, 10,"O navio agora avua e da tchau pro iceberg!","Iceberg Productions"));
		
		auxcd.add(new CD("Cheer up 1.0", 2013, 3, "Muito animadora a musica!", "TWICE", 10));
		auxcd.add(new CD("Cheer up 2.0", 2014, 3, "Muito animadora a musica!", "TWICE", 10));
		auxcd.add(new CD("Cheer up 3.0", 2015, 3, "Muito animadora a musica!", "TWICE", 10));
		auxcd.add(new CD("Cheer up 4.0", 2016, 3, "Muito animadora a musica!", "TWICE", 10));
		auxcd.add(new CD("Cheer up 5.0", 2017, 3, "Muito animadora a musica!", "TWICE", 10));
		auxcd.add(new CD("Cheer up 6.0", 2018, 3, "Muito animadora a musica!", "TWICE", 10));
		auxcd.add(new CD("Cheer up 7.0", 2019, 3, "Muito animadora a musica!", "TWICE", 10));
		auxcd.add(new CD("Cheer up 8.0", 2020, 3, "Muito animadora a musica!", "TWICE", 10));
		auxcd.add(new CD("Cheer up 9.0", 2021, 3, "Muito animadora a musica!", "TWICE", 10));
		auxcd.add(new CD("Cheer up 10.0", 2022, 3, "Muito animadora a musica!", "TWICE", 10));
		
		auxjogo.add(new Jogos("Rainbow six siege 1", 2013, 3, "Melhor jogo de tiro!", 20000, "Computador e consoles"));
		auxjogo.add(new Jogos("Rainbow six siege 2", 2014, 3, "Melhor jogo de tiro!", 40000, "Computador e consoles"));
		auxjogo.add(new Jogos("Rainbow six siege 3", 2015, 3, "Melhor jogo de tiro!", 80000, "Computador e consoles"));
		auxjogo.add(new Jogos("Rainbow six siege 4", 2016, 3, "Melhor jogo de tiro!", 30000, "Computador e consoles"));
		auxjogo.add(new Jogos("Rainbow six siege 5", 2017, 3, "Melhor jogo de tiro!", 90000, "Computador e consoles"));
		auxjogo.add(new Jogos("Rainbow six siege 6", 2018, 3, "Melhor jogo de tiro!", 200000, "Computador e consoles"));
		auxjogo.add(new Jogos("Rainbow six siege 7", 2019, 3, "Melhor jogo de tiro!", 10000, "Computador e consoles"));
		auxjogo.add(new Jogos("Rainbow six siege 8", 2020, 3, "Melhor jogo de tiro!", 30000, "Computador e consoles"));
		auxjogo.add(new Jogos("Rainbow six siege 9", 2021, 3, "Melhor jogo de tiro!", 10000, "Computador e consoles"));
		auxjogo.add(new Jogos("Rainbow six siege 10", 2022, 3, "Melhor jogo de tiro!", 990000, "Computador e consoles"));
		
		System.out.print(auxfilme);
		System.out.print(auxcd);
		System.out.print(auxjogo);
	
	}
}