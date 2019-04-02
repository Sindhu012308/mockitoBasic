package com.sindhu.mockito.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {
	
	@Mock
	DataService dataService;

	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	@Test
	public void testFindTheGreatestFromAllData() {
		//fail("Not yet implemented");
		when(dataService.retrieveAllData()).thenReturn(new int[] {24,16,8});
		assertEquals(24,businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	public void testFindTheGreatestFromAllDataForOneValue() {
		//fail("Not yet implemented");
		when(dataService.retrieveAllData()).thenReturn(new int[] {2308});		
		assertEquals(2308,businessImpl.findTheGreatestFromAllData());
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