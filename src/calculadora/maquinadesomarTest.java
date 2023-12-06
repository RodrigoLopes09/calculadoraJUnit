package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class maquinadesomarTest {
	maquinadesomar cal =new maquinadesomar();

	@Test
	void test() {
		double soma =cal.somar(-1,-2,-3);
		assertEquals(-6, soma);
	}

}
