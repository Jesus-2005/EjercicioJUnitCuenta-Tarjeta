package es.iessoterohernandez.daw.endes.EjerciciosJUnitCuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	private static Cuenta c;
	
	@BeforeEach
	public void init() {
		c = new Cuenta("1111","Rosario");
	}

	@Test
	void testIngresarDouble() throws Exception {
		c.ingresar(100.0);
		assertThat(c.getSaldo(), is(100.0));
	}

	@Test
	void testRetirarDouble() throws Exception {
		c.ingresar(200.0);
		c.retirar(100.0);
        assertThat(c.getSaldo(), is(100.0));
	}



}
