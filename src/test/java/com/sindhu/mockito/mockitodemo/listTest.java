package com.sindhu.mockito.mockitodemo;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class listTest {

	// Mockito test case for Getting size of a list 
	@Test
	public void testSize() {
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());
	}

	//mockito test case for Getting sizes of multiple lists
	@Test
	public void testSizeMultipleReturns() {
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());

	}
	
	//This is specific
	//mockito test case for getting first element of a list, set it as SomeString
	@Test
	public void testSpecificParameter() {
		List listMock = mock(List.class);
		
		when(listMock.get(0)).thenReturn("SomeString");
		assertEquals("SomeString", listMock.get(0));
		assertEquals(null, listMock.get(1));

	}
	
	//This is Generic. we can use either specific or generic type in testing but not both in single application.
	//mockito test case for getting any element of the list, set it as SomeString
	@Test
	public void testGetGenericParameter() {
		List listMock = mock(List.class);
		
		when(listMock.get(Mockito.anyInt())).thenReturn("SomeString");
		assertEquals("SomeString", listMock.get(0));
		assertEquals("SomeString", listMock.get(1));

	}

}
