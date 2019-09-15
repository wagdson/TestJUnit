package br.com.senaigo.testValores;

import org.junit.Test;

import br.com.senaigo.valores.Valores;
import junit.framework.TestCase;

public class TestValores extends TestCase {

	private Valores valores;

	protected void setUp() throws Exception {
		super.setUp();
		valores = new Valores();
	}

	@Test
	public void testIns1() {

		boolean rt = valores.ins(30);
		assertTrue(rt == true);

	}

	@Test
	public void testIns2() {

		boolean rt = valores.ins(-30);
		assertFalse(rt == true);

	}

	@Test
	public void testDel() {
		valores.ins(30);
		valores.ins(20);
		valores.ins(-20);
		valores.ins(10);

		int v = valores.del(2);
		assertTrue(v == 10);

	}

	@Test
	public void testSize() {
		valores.ins(30);
		valores.ins(20);
		valores.ins(-20);
		valores.ins(10);
		int t = valores.size();
		assertTrue(t == 3);

	}

	@Test
	public void testMean() {
		valores.ins(8);
		valores.ins(4);
		double m = valores.mean();

		assertTrue(m == 6.0);

	}

	@Test
	public void testGreater() {
		valores.ins(8);
		valores.ins(4);
		valores.ins(9);
		valores.ins(3);

		int m = valores.greater();

		assertTrue(m == 9);
		assertFalse(m == 3);

	}

	@Test
	public void testLower() {
		valores.ins(8);
		valores.ins(4);
		valores.ins(9);
		valores.ins(3);

		int m = valores.lower();

		assertEquals(m, 3);
		

	}

}
