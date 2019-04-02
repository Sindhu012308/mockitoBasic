package com.sindhu.mockito.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;

public class SomeBusinessMockAnnotationsTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		//fail("Not yet implemented");
		DataService dataserviceMock = mock(DataService.class);
		when(dataserviceMock.retrieveAllData()).thenReturn(new int[] {24,16,8});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataserviceMock);
		int result = businessImpl.findTheGreatestFromAllData();
	
		assertEquals(24,result);
	}
	
	@Test
	public void testFindTheGreatestFromAllDataForOneValue() {
		//fail("Not yet implemented");
		DataService dataService1 = mock(DataService.class);
		when(dataService1.retrieveAllData()).thenReturn(new int[] {2308});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataService1);
		int data = businessImpl.findTheGreatestFromAllData();
		
		assertEquals(2308,data);
	}

}


/*
class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[]{24, 6,8};
	}
	
}*/