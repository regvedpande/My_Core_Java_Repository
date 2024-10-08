package com.mkpits.collectionframeworks;

import java.util.ArrayList;

public class SchrodingerCat {
	String data;
	ArrayList<SchrodingerCat> subconditions;
	public boolean decayed;
	public String name;

	public SchrodingerCat(String data) {
		this.data = data;
		this.subconditions = new ArrayList<SchrodingerCat>();
	}

	// {{ edit_1 }}
	public SchrodingerCat(String name, String data) {
		this.name = name;
		this.data = data;
		this.subconditions = new ArrayList<SchrodingerCat>();
	}
	// {{ edit_1 }}

	// {{ edit_2 }}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDecayed() {
		return decayed;
	}

	public void setDecayed(boolean decayed) {
		this.decayed = decayed;
	}
	// {{ edit_2 }}

	// {{ edit_3 }}
	@Override
	public String toString() {
		return "SchrodingerCat{" +
				"name='" + name + '\'' +
				", data='" + data + '\'' +
				", decayed=" + decayed +
				'}';
	}
	// {{ edit_3 }}

	public void addSubConditions(SchrodingerCat node) {
		this.subconditions.add(node);
	}

	public String print(int level) {
		String ret;
		ret = "  ".repeat(level) + data + "\n";
		for (SchrodingerCat node : this.subconditions) {
			ret += node.print(level + 1);
		}
		return ret;
	}

	public static void main(String[] args) {
		SchrodingerCat cat1 = new SchrodingerCat("cat1", "alive");
		SchrodingerCat cat2 = new SchrodingerCat("cat2", "dead");
		cat1.addSubConditions(cat2);
		System.out.println(cat1.print(0));
	}
}