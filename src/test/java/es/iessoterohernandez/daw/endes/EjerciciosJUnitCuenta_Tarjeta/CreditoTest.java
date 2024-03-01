package es.iessoterohernandez.daw.endes.EjerciciosJUnitCuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.Date;
class CreditoTest {

	private static Credito tarjeta;
	@BeforeEach
	void setUp() throws Exception {
		tarjeta = new Credito("123456789", "Titular", new Date(), 1000.0);
	}

	@Test
	void testRetirar() throws Exception {
		 
	     
	     tarjeta.mCuentaAsociada = new Cuenta("Cuenta de prueba", "Titular");
	     tarjeta.mCuentaAsociada.ingresar(1000.0);

	     tarjeta.retirar(500.0);

	     assertThat(tarjeta.getSaldo(), is((25.0)));
	}

	@Test
	void testIngresar() throws Exception {
		tarjeta.mCuentaAsociada = new Cuenta("Cuenta de prueba", "Titular");
        tarjeta.mCuentaAsociada.ingresar(1000.0);

        tarjeta.ingresar(200.0);

        assertThat(tarjeta.getSaldo(), is(200.0));
	}

	@Test
	void testPagoEnEstablecimiento() throws Exception {
		tarjeta.mCuentaAsociada = new Cuenta("Cuenta de prueba", "Titular");
        tarjeta.mCuentaAsociada.ingresar(1000.0);

        // Act
        tarjeta.pagoEnEstablecimiento("Supermercado", 100.0);

        // Assert
        assertThat(tarjeta.getSaldo(), is(100.0));
	}



}
