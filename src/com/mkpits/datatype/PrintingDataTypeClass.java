package com.mkpits.datatype;

public class PrintingDataTypeClass {
	// Method to print the values of initialized and added data types
	public void printValues(DataTypeDeclaration data) {
		// Printing primitive data types
		System.out.println("Boolean Value: " + data.booleanValue);
		System.out.println("Char Value: " + data.charValue);
		System.out.println("Byte Value: " + data.byteValue);
		System.out.println("Short Value: " + data.shortValue);
		System.out.println("Int Value: " + data.intValue);
		System.out.println("Long Value: " + data.longValue);
		System.out.println("Float Value: " + data.floatValue);
		System.out.println("Double Value: " + data.doubleValue);

		// Printing user-defined data type
		System.out.println("Person Information:");
		System.out.println("Name: " + data.person.getName(null));
		System.out.println("Age: " + data.person.getAge(null));
	}
}
