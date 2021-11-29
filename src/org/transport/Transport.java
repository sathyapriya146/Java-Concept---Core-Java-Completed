package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
public void transportForm() {
	System.out.println("vehicles");
}
public static void main(String[] args) {
	Transport t = new Transport();
	t.transportForm();
	System.out.println();
	Road r = new Road();
	r.bike();
	r.cycle();
	r.bus();
	r.car();
	System.out.println();
	Air a = new Air();
	a.aeroplane();
	a.helicopter();
	System.out.println();
	Water w = new Water();
	w.boat();
	w.ship();
}
}
