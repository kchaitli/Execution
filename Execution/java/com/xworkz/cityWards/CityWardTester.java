package com.xworkz.cityWards;

import com.xworkz.contants.Ward;

public class CityWardTester {
	public static void main(String[] args) {
		CityWard cityward = new CityWard();
		cityward.cityWardInfo(12, Ward.RajajiNagar, 6000);
		cityward.setArea(12000);
		cityward.setCorporatorName("surya");
		cityward.setPopulation(4000);
		cityward.setWardNum(12);
		cityward.setWardName(Ward.Vidyaranyapura);
		cityward.diplayInfo();
		cityward.corporatorInfo();
		cityward.searchCity();
	
	
	}
}
