import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MyTest {

	@Test
    public void test1() {
		Coffee order = new Sugar(new Cream( new ExtraShot(new BasicCoffee())));
		double cost = order.makeCoffee();
        String result = "" + cost;
        assertEquals("6.19", result);
    }
	
	@Test
    public void test2() {
		Coffee order = new Cream( new ExtraShot(new BasicCoffee()));
		double cost = order.makeCoffee();
        String result = "" + cost;
        assertEquals("5.69", result);
    }
	
	@Test
    public void test3() {
		Coffee order = new ExtraShot(new BasicCoffee());
		double cost = order.makeCoffee();
        String result = "" + cost;
        assertEquals("5.19", result);
    }
	
	@Test
    public void test4() {
		Coffee order = new BasicCoffee();
		double cost = order.makeCoffee();
        String result = "" + cost;
        assertEquals("3.99", result);
    }
	
	@Test
    public void test5() {
		Coffee order = new Vanilla(new BasicCoffee());
		double cost = order.makeCoffee();
        String result = "" + cost;
        assertEquals("4.49", result);
    }
	
	@Test
    public void test6() {
		Coffee order = new Caramel(new BasicCoffee());
		double cost = order.makeCoffee();
        String result = "" + cost;
        assertEquals("4.49", result);
    }
	
	@Test
    public void test7() {
		Coffee order = new Sugar(new Vanilla( new ExtraShot(new BasicCoffee())));
		double cost = order.makeCoffee();
        String result = "" + cost;
        assertEquals("6.19", result);
    }
	
	@Test
    public void test8() {
		Coffee order = new Sugar(new Caramel( new ExtraShot(new BasicCoffee())));
		double cost = order.makeCoffee();
        String result = "" + cost;
        assertEquals("6.19", result);
    }
	
	@Test
    public void test9() {
		Coffee order = new Sugar(new Vanilla(new Caramel(new Cream( new ExtraShot(new BasicCoffee())))));
		double cost = order.makeCoffee();
        String result = "" + cost;
        assertEquals("7.19", result);
    }
	
	@Test
    public void test10() {
		Coffee order =  new BasicCoffee();
		double cost = order.makeCoffee()*2;
        String result = "" + cost;
        assertEquals("7.98", result);
    }
	
	

}

/*

			
			double cost5 = new BasicCoffee().makeCoffee();
			System.out.println("Total: "+cost5);
			
			double cost6 = new Vanilla(new BasicCoffee()).makeCoffee();
			System.out.println("Total: " +cost6);
			

*/