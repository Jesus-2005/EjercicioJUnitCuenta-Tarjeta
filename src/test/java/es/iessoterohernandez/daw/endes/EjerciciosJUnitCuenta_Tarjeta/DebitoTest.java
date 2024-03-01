package es.iessoterohernandez.daw.endes.EjerciciosJUnitCuenta_Tarjeta;


import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DebitoTest {
	
	private static Debito tarjeta;
	
	@BeforeEach
	void setUp() throws Exception {
		tarjeta = new Debito("123456789", "Titular", new Date());
	}

	@Test
	void testRetirar() throws Exception {
		Cuenta cuenta = new Cuenta("Cuenta de prueba", "Titular");
        cuenta.ingresar(1000.0);
        tarjeta.setCuenta(cuenta);

        
        tarjeta.retirar(500.0);

        
        assertThat(tarjeta.getSaldo(), is((1000.0 - 500.0)));
	}

	@Test
	void testIngresar() throws Exception {
		Cuenta cuenta = new Cuenta("Cuenta de prueba", "Titular");
        cuenta.ingresar(1000.0);
        tarjeta.setCuenta(cuenta);
        tarjeta.ingresar(200.0);

        
        assertThat(tarjeta.getSaldo(), is((1000.0 + 200.0)));
	}

	@Test
	void testPagoEnEstablecimiento() throws Exception {
		Cuenta cuenta = new Cuenta("Cuenta de prueba", "Titular");
        cuenta.ingresar(1000.0);
        tarjeta.setCuenta(cuenta);

        // Act
        tarjeta.pagoEnEstablecimiento("Supermercado", 100.0);

        // Assert
        assertThat(tarjeta.getSaldo(), is(1000.0 - 100.0));
	}

}
