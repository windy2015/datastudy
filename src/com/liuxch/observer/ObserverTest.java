package com.liuxch.observer;

public class ObserverTest {

	public static void main(String[] args) {
		ConcerateSubject sub = new ConcerateSubject();
		ConcerateObserver obv1 = new ConcerateObserver();
		ConcerateObserver obv2 = new ConcerateObserver();
		sub.attachOberver(obv1);
		sub.attachOberver(obv2);
		sub.change("new state");
	}

}
