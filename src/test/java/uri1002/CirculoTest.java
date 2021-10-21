package uri1002;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void testGetArea() {
		Circulo c = new Circulo(); // criando um circulo
		c.setRadius(2.0); // valor de entrada eh 2.0
		double expected = 12.5664; // valor esperado
		double actual = c.getArea();  // o que o programa fez até agora, ou seja, saida calculada
		assertEquals(expected, actual, 0.0001); // compara as duas saidas com precisao de 3 casas depois da virgula
		
	}

}
