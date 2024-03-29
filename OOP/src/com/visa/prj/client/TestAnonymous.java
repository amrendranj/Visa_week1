package com.visa.prj.client;

@FunctionalInterface // only one method to implement
interface Computation {
	int compute(int x, int y);
}

public class TestAnonymous {

	public static void main(String[] args) {
		Computation c1 = new Computation() {

			@Override
			public int compute(int x, int y) {
				return x + y;
			}
		};

		System.out.println(c1.compute(5, 4));

		/*
		 * Java8 introduced Lambda Expression as a shorter form for Anonymous class.
		 * 
		 * Limitations: works only for functional interfaces
		 */

		Computation c2 = (int x, int y) -> {
			return x - y;
		};
		System.out.println(c2.compute(5, 4));

		// Type interface
		Computation c3 = (x, y) -> x * y;
		System.out.println(c3.compute(5, 4));
	}

}
