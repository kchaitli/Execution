package com.xworkz.cityWards;

import java.util.Scanner;

import com.xworkz.contants.Ward;

/**
 * 
 * @author chaitli cityWard is a class consisting of city information parameters
 *         the class also consists of methods to check the city info
 */
class CityWard {
	public int wardNum;
	public Ward wardName;
	public String corporatorName;
	public int population;
	public int area;
	Scanner scan = new Scanner(System.in);
	
	/**
	 * 
	 * @param wardNum
	 * @param wardName
	 * @param population This method accepts mulitple city ward info
	 */
	public void cityWardInfo(int wardNum, Ward wardName, int population) {
		System.out.println("cityWardInfo invoked");
		System.out.println(population);
		if (population > 5000) {
			System.out.println("population is above 5000");
		} else {
			System.out.println("population is less than 5000");
		}

	}
	/**
	 * searches for city ward info based on the number
	 */
	public void searchCity() {
		System.out.println("search city invoked");
		System.out.println("enter ward number");
		System.out.println("available ward numbers are 11,12,13,14");
		wardNum= scan.nextInt();
		System.out.println("the following is the ward name of ward number  "+ wardNum);
		if(wardNum==11) {
			System.out.println("Rajaji nagar");
		}else if(wardNum==12) {
			System.out.println("Yeshwanthpura");
		}else if(wardNum==13) {
			System.out.println("Yelahanka");
		}
		else if(wardNum==14) {
			System.out.println("vidyaranyapura");
		}	
	}

	public void corporatorInfo() {
		System.out.println("corporator info method is invoked");
		System.out.println("enter the option");
		System.out.println("1.Rajaji nagar");
		System.out.println("2.Yeshwanthpura");
		System.out.println("3.Yelahanka");
		System.out.println("4.Vidyaranyapura");
		System.out.println("enter your ward option");
		int wardOption = scan.nextInt();
		
		if(wardOption==1) {
			String corporatorName= "Suresh";
			System.out.println("Rajaji nagar corporator is "+corporatorName );
		}else if(wardOption==2) {
			String corporatorName= "Ramesh";
			System.out.println("Yeshwanthpur corporator is "+corporatorName);
		}else if(wardOption==3) {
			String corporatorName= "Rajesh";
			System.out.println("Yelahanka corporator is "+corporatorName);
		}else if(wardOption==4) {
			String corporatorName= "Basavaraj";
			System.out.println("Vidyaranyapura corporator is "+corporatorName);
		}

	}

	/**
	 * display method helps to display all the ward details
	 */
	public void diplayInfo() {
		System.out.println("display method is invoked");
		System.out.println("The following is the city ward info");
		System.out.println("ward number is: " + this.wardNum);
		System.out.println("ward name is: " + this.wardName);
		System.out.println("corporator name is: " + this.corporatorName);
		System.out.println("population is: " + this.population);
		System.out.println("Area is: " + this.area);
	}

	public int getWardNum() {
		return wardNum;
	}

	public void setWardNum(int wardNum) {
		this.wardNum = wardNum;
	}

	public Ward getWardName() {
		return wardName;
	}

	public void setWardName(Ward wardName) {
		this.wardName = wardName;
	}

	public String getCorporatorName() {
		return corporatorName;
	}

	public void setCorporatorName(String corporatorName) {
		this.corporatorName = corporatorName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
}
