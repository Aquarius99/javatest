package javatestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		javatestunitclass Junit = new javatestunitclass ();
		int result = Junit.addnumbers (100, 200) ;
		assertEquals (300, result);
		}
	}

