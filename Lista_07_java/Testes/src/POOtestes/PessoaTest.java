package POOtestes;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class PessoaTest {

	@Test
	public void testFaixa1() {
		Pessoa p = new Pessoa("joão",1500.00,0,20);
		assertEquals(0,p.calculaImposto(),0);
		
		p = new Pessoa("maria",1500.00,1,50);
		assertEquals(0,p.calculaImposto(),0);
	
		System.out.println("Passou Teste 1 -  primeira faixa");
	}
	
	@Test
	public void testFaixa2() {
		
		Pessoa p = new Pessoa("joão",2000.00,0,60);
		assertEquals(15.91,p.calculaImposto(),0.1);
		
		p = new Pessoa("joão",2000.00,2,50);
		assertEquals(0,p.calculaImposto(),0);

		System.out.println("Passou Teste 2 - segunda faixa");
	}

	@Test
	public void testFaixa3() {
		Pessoa p = new Pessoa("paulo",3500.00,0,20);
		assertEquals(189.97,p.calculaImposto(),0.1);
		
		p = new Pessoa("paulo",3500.00,1,20);
		assertEquals(10.26,p.calculaImposto(),0.1);

		p = new Pessoa("paulo",3500.00,2,40);
		assertEquals(0,p.calculaImposto(),0);

		System.out.println("Passou Teste 3 - terceira faixa");
	}

	@Test
	public void testFaixa4() {
		
		Pessoa p = new Pessoa("paulo",4400.00,0,40);
		assertEquals(387.04,p.calculaImposto(),0.1);
		
		p = new Pessoa("paulo",4400.00,1,30);
		assertEquals(207.33,p.calculaImposto(),0.1);

		p = new Pessoa("paulo",4400.00,2,40);
		assertEquals(27.62,p.calculaImposto(),0.1);

		p = new Pessoa("paulo",4400.00,3,20);
		assertEquals(0,p.calculaImposto(),0);

		System.out.println("Passou Teste 4 - quarta faixa");
	}

	@Test
	public void testFaixa5() {
		
		Pessoa p = new Pessoa("jose",7000.00,0,50);
		assertEquals(1098.85,p.calculaImposto(),0.1);
		
		p = new Pessoa("jose",7000.00,2,30);
		assertEquals(739.43,p.calculaImposto(),0.1);

		p = new Pessoa("paulo",7000.00,6,40);
		assertEquals(20.59,p.calculaImposto(),0.1);

		p = new Pessoa("paulo",7000.00,7,20);
		assertEquals(0,p.calculaImposto(),0);

		System.out.println("Passou Teste 5 - quinta faixa");
	}
	
	@Test
	public void testeIdade() {
		
		Pessoa p = new Pessoa("Fulano de Tal", 100000.00, 0, 75);
		
		if (p.getIdade() >= 65 && p.calculaImposto() == 0) {
			System.out.println("Passou no teste de idade maior do que 65 anos");
		}
	}

	
	@BeforeClass
	public static void inicializaClass() {
		System.out.println("iniciou série de teste");
	}
	
	@AfterClass
	public static void finalizaClass() {
		System.out.println("Finalizou série de teste");
	}

}