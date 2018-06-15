package com.scp.string;

import java.util.ArrayList;
import java.util.Arrays;

public class ImmutabilityDemo {
	public static void main(String[] args) {
		
		Vendor v1=new Vendor(101, "pune");
		

		ArrayList<Integer>listOfNums=new ArrayList<>(Arrays.asList(10,20,30));
		System.out.println(listOfNums.size());
		
		//listOfNums.add(40);
		//System.out.println(listOfNums.size());
		
		
		
		  Mobile m1=Mobile.getMobileInstance(10,"iPhone",listOfNums);
		//m1.mobId=20; ..only access if it public....
		//CE : bcoz...mobid is final so we can't change value
		 
		 ArrayList<Integer>nums=m1.getListofNums();
		 nums.add(40);
		System.out.println(m1);
		//Mobile m2=Mobile.getMobileInstance(20, "MI");
		//System.out.println(m2);
		
		
		//m1=m2;	//CE : bcoz m1 ref is final..we can't change the ref to another ref
		
	}

	

}
final class Mobile{
	final private  int mobId;
	final private String mobName;
	private Vendor vendor;
	private final ArrayList<Integer>listofNums;
	
	
	public Vendor getVendor() {
		return vendor;
	}
	public ArrayList<Integer> getListofNums() {
		//return listofNums;
		return new ArrayList<>(listofNums);
	}
	public  static Mobile getMobileInstance(int mobId, String mobName,ArrayList<Integer>listofNums) {
		// TODO Auto-generated method stub
		Vendor v1=new Vendor(101, "pune");
		
		return new Mobile(mobId, mobName,v1,listofNums);
	}
	private Mobile(int mobId, String mobName,Vendor vendor,ArrayList<Integer>listOfNums) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
		this.vendor=vendor;
		this.listofNums=listOfNums;
		
	}
	public int getMobId() {
		return mobId;
	}
	
	public String getMobName() {
		return mobName;
	}
	
	@Override
	public String toString() {
		return "\nMobile [mobId=" + mobId + ", mobName=" + mobName +", Vendor=" + vendor +", listofNums=" + listofNums + "]";
	}
	
}
final class Vendor{
	
	final private int id;
	final private String city;
	public Vendor(int id, String city) {
		super();
		this.id = id;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Vendor [id=" + id + ", city=" + city + "]";
	}
	
	
}
