package com.mkpits.datatype;

public class DataTypeMainClass {
	public static void main(String[] args) {
		// Creating instances of classes
		DataTypeDeclaration initData = new DataTypeDeclaration();
		DataTypeInitialization addData = new DataTypeInitialization();
		PrintingDataTypeClass printData = new PrintingDataTypeClass();

		// Adding values to the initialized data types
		addData.addValues(initData);

		// Printing the values
		printData.printValues(initData);
	}
}
