package org.TV;

import org.laptop.Intel;
import org.phone.Nokia;

public class Sony {
	public void sony32() {
		System.out.println("32 inches");
	}
	public static void main(String[] args) {
		Sony T = new Sony();
		T.sony32();
		Nokia N = new Nokia();
		N.nokia1();
		Intel I = new Intel();
		I.displayIntel();
	}
}

