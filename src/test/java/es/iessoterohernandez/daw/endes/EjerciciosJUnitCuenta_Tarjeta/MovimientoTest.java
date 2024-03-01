package es.iessoterohernandez.daw.endes.EjerciciosJUnitCuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
class MovimientoTest {

	private static Movimiento m;

	@BeforeEach
	void init() throws Exception {
		m = new Movimiento();
	}

	@Test
	void testGetAndSetImporte() {

		m.setImporte(1000);
		assertThat(m.getImporte(), is(1000.0));
	}

	@Test
	void testGetAndSetConcepto() {
		m.setConcepto("Pago del agua");
		assertNotNull(m.getConcepto());
		assertThat(m.getConcepto(), is("Pago del agua"));
	}

	@Test
	void testGetAndSetFecha() {
		Date mFecha = new Date();
		m.setFecha(mFecha);
		assertThat(m.getFecha(), is(mFecha));
	}

}
