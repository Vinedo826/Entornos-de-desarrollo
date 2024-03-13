package hola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class holaTest {

	@Test
	void testGetSaldo() {
		hola cuenta1 = new hola("ES123456987894", 100);
		float saldo = cuenta1.getSaldo();
		assertEquals (100, saldo);
	}

	@Test
	void testSetSaldo() {
		hola cuenta1 = new hola("ES123456987894", 0);
		cuenta1.setSaldo(100);
		assertEquals (100, cuenta1.getSaldo());
	}

	@Test
	void testIngresarDinero() {
		hola cuenta1 = new hola ("ES123456987894", 100);
		cuenta1.ingresarDinero(400);
		assertEquals (500, cuenta1.getSaldo());
	}

	@Test
	void testExtraerDinero() {
		hola cuenta1 = new hola ("ES123456987894", 100);
		cuenta1.extraerDinero(20);
		assertEquals (80, cuenta1.getSaldo());
	}
	
}
