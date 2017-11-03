//https://www.compilejava.net/

public class PE {
	public static void main(String[] args) {
		System.out.println("Programming Exercises");	
		BHN_Stuff.DoubleLongSep(args);
		PE.one(args);
	}



	public static void one(String[] args) {
		System.out.println("Part 1");	
		BHN_Stuff.DoubleShortSep(args);
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Computer Science");
		System.out.println("Programming is Fun");
		BHN_Stuff.LongSep(args);
		PE.two(args);
	}



	public static void two(String[] args) {
		System.out.println("Part 2");	
		BHN_Stuff.DoubleShortSep(args);
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		BHN_Stuff.LongSep(args);
		PE.three(args);
	}



	public static void three(String[] args) {
		System.out.println("Part 3");	
		BHN_Stuff.DoubleShortSep(args);
		System.out.println("a 	a^2	a^3");
		System.out.println("1 	1 	1");
		System.out.println("2 	4 	8");
		System.out.println("3 	9 	27");
		System.out.println("4 	16 	64");
		BHN_Stuff.LongSep(args);
		PE.four(args);
	}



	public static void four(String[] args) {
		double i = (9.5*4.5-2.5*3)/(45.5-3.5);
		System.out.println("Part 4");	
		BHN_Stuff.DoubleShortSep(args);
		System.out.println("(9.5*4.5-2.5*3)/(45.5-3.5) is, "+Double.toString(i));
		BHN_Stuff.LongSep(args);
		PE.five(args);
	}



	public static void five(String[] args) {
		System.out.println("Part 5");	
		BHN_Stuff.DoubleShortSep(args);
		System.out.println("1+2+3+4+5+6+7+8+9 is, "+Integer.toString(1+2+3+4+5+6+7+8+9));
		BHN_Stuff.LongSep(args);
		PE.six(args);
	}



	public static void six(String[] args) {
		double π1 = 4*(1.0-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
      	double π2 = 4*(1.0-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)+(1.0/13));
		System.out.println("Part 6");	
		BHN_Stuff.DoubleShortSep(args);
		System.out.println("π ~ "+Double.toString(π1)+", or, "+Double.toString(π2));
		BHN_Stuff.LongSep(args);
		PE.seven(args);
	}



	public static void seven(String[] args) {
		double π/*Alt+227*/ = Math.PI;
		double radius = 5.5;
		double perimeter = 2*radius*π;
		double area = radius*radius*π;
		System.out.println("Part 7");		
		BHN_Stuff.DoubleShortSep(args);
		System.out.println("Radius: "+Double.toString(radius));
		BHN_Stuff.ShortSep(args);
		System.out.println("Perimeter: "+Double.toString(perimeter));
		System.out.println("Area: "+Double.toString(area));
		BHN_Stuff.LongSep(args);
		PE.eight(args);
	}



	public static void eight(String[] args) {
		double width = 4.5;
		double length = 7.9;
		double perimeter = 2*(width+length);
		double area = width*length;
		System.out.println("Part 8");		
		BHN_Stuff.DoubleShortSep(args);
		System.out.println("Width: "+Double.toString(width));
		System.out.println("Length: "+Double.toString(length));
		BHN_Stuff.ShortSep(args);
		System.out.println("Perimeter: "+Double.toString(perimeter));
		System.out.println("Area: "+Double.toString(area));
		BHN_Stuff.LongSep(args);
		PE.nine(args);
	}



	public static void nine(String[] args) {
		double km = 14;
		double minutes = 45;
		double secconds = 30;
		double hours = (minutes+(secconds/100))/60;
		double meters = km/1.6;
		double mph = meters/hours;
		System.out.println("Part 9");		
		BHN_Stuff.DoubleShortSep(args);
		System.out.println("Kilometers: "+Double.toString(km));
		System.out.println("Time: "+Double.toString(minutes)+":"+Double.toString(secconds));
		BHN_Stuff.ShortSep(args);
		System.out.println("Meters: "+Double.toString(meters));
		System.out.println("Hours: "+Double.toString(hours));
		System.out.println("MPH: "+Double.toString(mph));
		BHN_Stuff.LongSep(args);
		PE.ten(args);
	}



	public static void ten(String[] args) {
		double meters = 24;
		double hours = 1;
		double minutes = 40;
		double secconds = 35;
		double tHours = hours+((minutes+(secconds/100))/60);
		double km = meters*1.6;
		double kph = km/hours;
		System.out.println("Part 10");		
		BHN_Stuff.DoubleShortSep(args);
		System.out.println("Meters: "+Double.toString(meters));
		System.out.println("Time: "+Double.toString(hours)+":"+Double.toString(minutes)+":"+Double.toString(secconds));
		BHN_Stuff.ShortSep(args);
		System.out.println("Kilometers: "+Double.toString(km));
		System.out.println("Total Hours: "+Double.toString(tHours));
		System.out.println("KPH: "+Double.toString(kph));
		BHN_Stuff.DoubleLongSep(args);
	}
}


public class BHN_Stuff { //Separator 
	public static void LongSep(String[] args) {
		System.out.println("──────────────────────────────────────────────");
	}
	public static void ShortSep(String[] args) {
		System.out.println("─────────────────────────");
	}
	public static void DoubleLongSep(String[] args) {
		System.out.println("══════════════════════════════════════════════");
	}
	public static void DoubleShortSep(String[] args) {
		System.out.println("═════════════════════════");
	}
}





/*
┌───────────────────────────────────────────────┐
│												│
╞═══════════════════════════════════════════════╡
│												│
├───────────────────────────────────────────────┤
│												│
╞═══════════════════════						│
│												│
├───────────────────────						│
│												│
╘═══════════════════════════════════════════════╛
*/
