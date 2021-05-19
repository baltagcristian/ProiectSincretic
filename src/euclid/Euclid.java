package euclid;

import java.util.*;
import java.lang.*;

public class Euclid {
	
	//Algoritmul lui Euclid
	
public static int cmmdc(int a, int b)
{
	
	if(a == 0)
    return b;
	return cmmdc(b % a, a);
}

public static void main(String[] args)
  {
	int opt;
	int a=10, b=15, g;
	Scanner sc = new Scanner(System.in);
	while(true)
	{
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("1.Cmmdc dintre 10 si 15");
		System.out.println("2.Cmmdc dintre 35 si 10");
		System.out.println("3.Cmmdc dintre 31 si 2");
		System.out.println("4.Cmmdc dintre 68 si 7");
		System.out.println("0.Iesire");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Alegerea dvs. este:");
		
		opt= sc.nextInt();
		
		System.out.println("");
		
		switch(opt)
		{
		case 1:
			a=10;
			b=15;
		    g=cmmdc(a,b);
		    System.out.println("Cel mai mare divizor comun dintre "+a+" si "+b+" este: ("+a+","+ b +") = " +g);
		break;
		case 2:
			a=35;
			b=10;
			g=cmmdc(a,b);
			System.out.println("Cel mai mare divizor comun dintre "+a+" si "+b+" este: ("+ a +","+b+") = " +g);
		break;
		case 3:
			a=31;
			b=2;
			g=cmmdc(a,b);
			System.out.println("Cel mai mare divizor comun dintre "+a+" s "+b+" este: ("+ a + "," + b + ") = "+g);
			break;
		case 4:
			a=68;
			b=7;
			g=cmmdc(a,b);
			System.out.println("Cel mai mare divizor comun dintre "+a+" s "+b+" este: ("+ a + "," + b + ") = "+g);
		break;
		case 0:
			return;
				
			
		}
	}
  }
}


