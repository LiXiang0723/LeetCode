package test;

import static org.junit.Assert.*;

import org.junit.Test;

import implementations.IsPalindrome;

public class TestIsPalindrome {

	@Test
	public void test() {
		assertTrue(IsPalindrome.isPalindrome(121));
	}

}
