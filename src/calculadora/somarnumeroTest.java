package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class somarnumeroTest {
	
	somarnumero cal = new somarnumero();

	@Test
	void test() {
		
		double soma = cal.somar(1,2);
		assertEquals(3, soma);
	}

}
