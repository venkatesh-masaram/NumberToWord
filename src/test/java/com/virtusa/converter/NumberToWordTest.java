package com.virtusa.converter;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberToWordTest {

	@Test
	public void testConvertToWord_when_pass_0() {
		assertEquals("Zero", NumberToWord.convertToWord(0));
	}

	@Test
	public void testConvertToWord_when_pass_21() {
		assertEquals("Twenty One", NumberToWord.convertToWord(21));
	}
	
	@Test
	public void testConvertToWord_when_pass_105() {
		assertEquals("One Hundred Five", NumberToWord.convertToWord(105));
	}
	
	@Test
	public void testConvertToWord_when_pass_1269() {
		assertEquals("One Thousand Two Hundred Sixty Nine", NumberToWord.convertToWord(1269));
	}
	
	@Test
	public void testConvertToWord_when_pass_14158() {
		assertEquals("Fourteen Thousand One Hundred Fifty Eight", NumberToWord.convertToWord(14158));
	}
	
	@Test
	public void testConvertToWord_when_pass_812158() {
		assertEquals("Eight Hundred Twelve Thousand One Hundred Fifty Eight", NumberToWord.convertToWord(812158));
	}
	
	@Test
	public void testConvertToWord_when_pass_9680164() {
		assertEquals("Nine Million Six Hundred Eighty Thousand One Hundred Sixty Four", NumberToWord.convertToWord(9680164));
	}
	
	@Test
	public void testConvertToWord_when_pass_29530164() {
		assertEquals("Twenty Nine Million Five Hundred Thirty Thousand One Hundred Sixty Four", NumberToWord.convertToWord(29530164));
	}

	@Test
	public void testConvertToWord_when_pass_56945781() {
		assertEquals("Fifty Six Million Nine Hundred Forty Five Thousand Seven Hundred Eighty One", NumberToWord.convertToWord(56945781));
	}

}
