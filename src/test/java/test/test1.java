package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test1 {
	@Test
public void m1() {
	System.out.println("m1");
}
	@BeforeClass
public void m2() {
	System.out.println("m2");
}
}
