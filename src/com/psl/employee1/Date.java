package com.psl.employee1;

public class Date {

	int day;
	int month;
	int year;

	public Date(int day,int month,int year) {
		this.month=month;
		this.day=day;
		this.year=year;
	}

	public static void main(String args[]){

		Date date=new Date(10,10,2014);
		
		System.out.println(date.calculateDate());
	}
	
	
	public String calculateDate() {
		String date=null;

		if((month <=12 && month>0)&& (year>1900 && year<2015) && (day<=31&&day>0))
		{
			if(month==2 && year%4==0 && day<=29)//leap year
			{
				return ""+day+"/"+month+"/"+year;
			}
			else if(month==2 && year%4!=0 && day<=28)
			{
				return ""+day+"/"+month+"/"+year;
			}
			else if( month==1 || month==3 || month==5 || month==7||month==8||month==10||month==12 && day<=31)
			{
				return ""+day+"/"+month+"/"+year;
			}
			else if(month==4 || month==6 || month==9 || month==11 && day<=30){
				return ""+day+"/"+month+"/"+year;
			}
			else{
				System.out.println("Invalid Date");
			}
		}
		else{
			System.out.println("Invalid date");
		}

		return date;

	}

	public int getYear() {
		return this.year;
	}
	
	
}
