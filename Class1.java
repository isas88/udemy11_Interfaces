package udemy11_Interfaces;

import java.util.ArrayList;

public class Class1 implements ISaveable {

	public String firstElement;
	public String secondElement;
	public String thirdElement;
	public String fourthElement;
	public ArrayList<String> strvar = new ArrayList<String>();
	
	public Class1() {
		// TODO Auto-generated constructor stub
		strvar.add("One");
		strvar.add("Two");
		strvar.add("Three");
		strvar.add("Four");
	}

	public ArrayList<String> rtnarry(){
		System.out.println("rtnarry executed");
		return strvar;
	}
	
	public void popfields(ArrayList<String> vals){
		
		System.out.println("popfields executed");
		firstElement = vals.get(0).toString();
		secondElement = vals.get(1).toString();
		thirdElement = vals.get(2).toString();
		fourthElement = vals.get(3).toString();
		
		for (int i=0;i<vals.size();i++) {
			System.out.println("Element1 :" +vals.get(i).toString());
		}
	}
	
	public String toString() {
		System.out.println("toString executed");
		return "test";
	}

	
}
