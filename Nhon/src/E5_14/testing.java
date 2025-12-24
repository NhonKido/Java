package E5_14;

import junit.framework.TestCase;

public class testing extends TestCase {
	public void testConstructor() {
	/**
	 * -------------------------------------------------------------------
	 * [Mouth: Cửa Biển (Gốc)]
	                            |
	                 (Đoạn sông chính dài 20km)
	                            |
	               [Confluence 2: Ngã Ba Cái Bè] <-------------------------+
	              /                             \                          |
	     (Nhánh trái dài 10km)            (Nhánh phải - Source)            |
	            /                                   \                      |
	 [Confluence 1: Ngã Ba Cai Lậy]         [Source: Suối Vàng]            |
	       /             \                     (Dài 50km)                  |
	  [Source]         [Source]                                            |
	(Suối Tiên)       (Suối Mơ)                                            |
	(Dài 10km)        (Dài 15km)                                           |
	-------------------------------------------------------------------
	 */
		
		Location locS1 = new Location(1, 1, "Suối Tiên");
        Location locS2 = new Location(1, 5, "Suối Mơ");
        Location locS3 = new Location(5, 5, "Suối Vàng");  

        // ten cac con song
        IRiver suoiTien = new Source(locS1, 10.0);
        IRiver suoiMo = new Source(locS2, 15.0); 
        IRiver suoiVang = new Source(locS3, 50.0); 

       // confluence songNho noi voi suoi tien va suoi mo tai Nga Ba Cai Lay
        Location locC1 = new Location(3, 3, "Ngã Ba Cai Lậy");
        IRiver songNho = new Confluence(locC1, 10.0, suoiTien, suoiMo);
        
        // confluence songChinh noi voi songNho va suoi vang tai Nga Ba Cai Be
        Location locC2 = new Location(5, 3, "Ngã Ba Cái Bè");
        IRiver songChinh = new Confluence(locC2, 20.0, songNho, suoiVang);

        // tao Mouth cuaBien
        Location locMouth = new Location(10, 10, "Cửa Biển");
        Mouth cuaBien = new Mouth(locMouth, songChinh);		
		
	}
	
	public void testMethod() {
		Location a = new Location(5, 5, "Confluence-a-");
		Location b = new Location(3,3,"Confluence-b-");
		Location m = new Location(7,5,"Mouth-m-");
		Location s = new Location(1,1,"Source-s-");
		Location t = new Location(1,5,"Source-t-");
		Location u = new Location(3,7,"Source-u-");
		
		IRiver srcS = new Source(s, 120);
		IRiver srcT = new Source(t, 50);
		IRiver srcU = new Source(u, 100);
		
		IRiver ConfB = new Confluence(b,60.0,srcS,srcT);
		IRiver ConfA = new Confluence(a,30,ConfB,srcU);
		
		Mouth mouth = new Mouth(m, ConfA);
		
		System.out.println(mouth.howManySource());
		
		assertTrue(mouth.inRiverSys(b));
		assertFalse(mouth.inRiverSys(new Location(0, 0, "o")));
		
		assertTrue(mouth.totalMiles()==(120+50+100+60+30));
		
		assertTrue(mouth.inRadius(4, u));
		assertFalse(mouth.inRadius(1, new Location(100,100,"abc")));
		
		assertTrue(mouth.maxLen()==120);
		
		assertTrue(mouth.confluences()==2);
		
		//tests locationsList
		ILocation locs = mouth.locationsList();
		System.out.println(locs.toString());
	}
}
