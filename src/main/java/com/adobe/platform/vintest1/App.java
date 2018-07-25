package com.adobe.platform.vintest1;


/**
 * Hello world!
 *
 */
public class App 
{
	public final static int[] a = new int []{2,4,1,6,7,3, 2, 3, 4, 2,3};

	public volatile int a111 = 0 ;

    public static void main( String[] args ) throws InterruptedException
    {
    	mysingletonclass m = mysingletonclass.getInstance();
    	m.setX(10);
    	
    	mysingletonclass m1 = mysingletonclass.getInstance();
    	m1.setX(20);
    	
    	System.out.println(m.getX());
    	System.out.println(m1.getX());
    	
    	threadsafesingletonclass tsc = threadsafesingletonclass.getInstance();
    	
    	System.out.println(tsc.getSampleString());
    	
//    	kallu();
//    	Runtime r = Runtime.getRuntime();
//    	
//    	r.gc();
//    	
//    	sorting s = new sorting();
//    	s.MyArray(a);
//    	
//    	s.mylist(a);
//    	
//    	s.myarraylist(a);
//    	
//    	s.myqueue(a);
//    	
    	//GCFinalize g = new GCFinalize();
    	//g.runmethod();
    	//System.gc();
    	//Thread.sleep(5000);
    	
    	parentclass p = new parentclass(3);
    	p.m1(10);
 
    	childclass c  = new childclass();
    	c.m1(10);
    	
    	childclass c1 = new childclass();
    	
    	System.out.println(c.x);
    	System.out.println(c.getparentx());
    	System.out.println(c.getx());
    	
    	System.out.println("aksdakd "+((parentclass)c).x);

    	((parentclass)c).m2();
    	parentclass p4 = c;
    	p4.m2();

    	//    	parentclass p2 = c;
//    	System.out.println(p2.x);
//
    	parentclass p1 = new childclass();
    	p1.m1(10);
    	System.out.println(p1.x);
    	
    	System.out.println("this is the end of program");
    	

    }
    public static void kallu() {
    	System.out.println("this is the start of kallu");

    	{
    		Hello h = new Hello('K');
        	h.getnumber();

        	h.m1();
        	
        	// h.m1(2); ambiguity

        	// h.ambiguoustest(null); // Ambiguous
        	
        	h.testpromotion('a'); // this will call int
        	
        	h.testpromotion(100L); // this will promoted to float
        	
        	byte b = 1;
        	h.testpromotion(b); // this will call int
        	
        	// h.testpromotion(10.5); // double can't be promoted as its at highest level
    	
		Hello p = new Hello('M');
    	p.getnumber();
    	}
    	System.out.println("this is the end of kallu");

    }
    
 
}
