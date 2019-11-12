package com.training.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestStudentMarks {
	
	private StudentMarks s1;
	private StudentMarks s2;
	private StudentMarks s3;
	@Before
	public void setUp() {
		s1 = new StudentMarks(60,70,80);
		 s2= new StudentMarks(65,75,35);
		 s3=new StudentMarks(20,30,40);
		
	}
	@Test
	public void testTotalAndAvgOfEachStudent() {
		
		
		assertEquals(210, s1.totalOfEachStudent());
		assertEquals(70, s1.avgOfEachStudent());
		assertEquals(175, s2.totalOfEachStudent());
		assertEquals(58, s2.avgOfEachStudent());
		assertEquals(90, s3.totalOfEachStudent());
		assertEquals(30, s3.avgOfEachStudent());
	}
	
	@Test
	public void testTotalScoredByInEachSubject() {
		StudentMarks s = new StudentMarks();
		assertEquals(145,s.totalScoredByStudentsInSubjectA() );
		assertEquals(175,s.totalScoredByStudentsInSubjectB() );
		assertEquals(155,s.totalScoredByStudentsInSubjectC() );
	}
	
	
	

}
