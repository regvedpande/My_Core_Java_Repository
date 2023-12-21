package com.mkpits.string;

public class StringBufferOverview {

	public static void main(String[] args) {

		// We are calling below getBuffers method
		StringBufferOverview sb = new StringBufferOverview();
		sb.getComputerNames();

		// Calling getScooterNames() method from CallingStringBufferOverview
		CallingStringBufferOverview scooter = new CallingStringBufferOverview();
		scooter.getScooterNames();

		// For watches calling another class method
		CallingStringBufferOverview watches = new CallingStringBufferOverview();
		watches.getWatchNames();

		CallingStringBufferOverview languages = new CallingStringBufferOverview();
		languages.getProgrammingLanguages();

	}

	// String Buffer cannot take values in the form of double quotes you have to
	// create object for it
	// String is Mutable and StringBuffer is Immutable

	public void getComputerNames() {

		String computer = "Dell is a American Company";
		StringBuffer details = new StringBuffer(computer);

		String anothercomputer = "Hp is also Another American Company";

		// Using StringBuffer append
		StringBuffer manufacturer = details.append(" " + anothercomputer);
		System.out.println(manufacturer);

		// Using another StringBuffer append
		StringBuffer manufacturer1 = details.append(" " + anothercomputer, 5, 15);
		System.out.println(manufacturer1);

		// Return the Current Capacity
		System.out.println(manufacturer.capacity());

		// Returns the char value in this sequence at the specified index.
		System.out.println(details.charAt(55));

		// Removes the characters in a substring of this sequence.
		System.out.println(manufacturer.delete(10, 20));

	}

	public void getSpaceOrganisationName() {

		String spaceorganisation = "Isro";

		int name = spaceorganisation.length();
		System.out.println(name);
	}

	String aboutandroid = "Android is owned by Google which is used by 5 Billion Devices on planet Earth from mobile to televisions to chromebooks";
	// aboutandroid.ensureCapacity(90); we cannot call it or print it

}
