package com.mkpits.string;

public class CallingStringBufferOverview {

	String scooterbrand;

	public static void main(String[] args) {

		// Calling getComputerNames() method from StringBufferOverview
		StringBufferOverview bufferOverview = new StringBufferOverview();
		bufferOverview.getComputerNames();

		// Local variable cannot be called in another class you create its global
		// String scooterbrand = "Activa, Jupyter, Vespa";
		// System.out.println(scooterbrand);

		// We are calling below getScooterNames method
		CallingStringBufferOverview b = new CallingStringBufferOverview();
		b.getScooterNames();

		// We are calling below getWatchNames method
		CallingStringBufferOverview csbo = new CallingStringBufferOverview();
		csbo.getWatchNames();

		//// We are calling below getProgrammingLanguges method
		CallingStringBufferOverview languages = new CallingStringBufferOverview();
		csbo.getProgrammingLanguages();

		// Calling getSpaceOrganisationName() method from StringBufferOverview
		StringBufferOverview space = new StringBufferOverview();
		space.getSpaceOrganisationName();
		;

	}

	public void getScooterNames() {
		// TODO Auto-generated method stub
		scooterbrand = "Activa, Jupyter, Vespa";
		System.out.println(scooterbrand);

	}

	public void getWatchNames() {
		String watch = "Rolex, Patek Phillipe, Rado";
		System.out.println(watch);

		// Using indexOf
		int namesofwatches = watch.indexOf("i");
		System.out.println(namesofwatches);

	}

	public void getProgrammingLanguages() {
		// TODO Auto-generated method stub
		StringBuffer programming1 = new StringBuffer("Java");
		StringBuffer programming2 = new StringBuffer("Javascript");
		int nameofprogramminglangauges = programming1.compareTo(programming2);
		System.out.println(nameofprogramminglangauges);
	}

}
