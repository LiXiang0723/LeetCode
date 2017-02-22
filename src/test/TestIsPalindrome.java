package test;

import static org.junit.Assert.*;

import main.IsPalindrome;

import org.junit.Test;

public class TestIsPalindrome {

	@Test
	public void test() {
		assertTrue(IsPalindrome.isPalindrome(121));
	}

}
