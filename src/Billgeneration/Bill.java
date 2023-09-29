package Billgeneration;

import java.util.Scanner;
import Welcome.*;

abstract class payment   //abstract_class,we don't want anyone to create object of this class
{
	public void payAmt(){}; //body_resides_in_inherited _clas
}
interface Account  //interface
{
	
	public abstract int AddToBill(int amount);
	public abstract int GetBill();
	public abstract int getbalance();
}

public class Bill extends  payment implements Account //implementwed class and entended also
{
	private int accountbal=0;
	private String name,ExpDate;
	private double CardNo;
	private int finalbill=0; //these all are private ,data hidig is implemented
	Scanner sc =new Scanner (System.in);
	public void payAmt()
	{
	   System.out.println("Payment processed sucessfully:" + finalbill +"rupees");
	   System.out.println("Thank you visit again");
	}
	public int AddToBill(int amount)
	{

		return finalbill=finalbill+amount;
	}
	public int GetBill()
	{
		return finalbill;
		
	}
	
	public int getbalance()
	{
		return accountbal;
	}
	
	public void CreditCard()
	{
		
		System.out.print("Card holder Name :: ");
		this.name =sc.next();
		System.out.print("Card Number :: ");
		this.CardNo =sc.nextDouble();
		System.out.print("Card Expire Date :: ");
        this.ExpDate =sc.next();	  	 
        
        this.payAmt();
        super.payAmt();
	}
	public void gPay()
    {
		System.out.println("Upi ID==> 123@upi");
		this.payAmt();
        super.payAmt();
	}
	public void cash()
	{
		this.payAmt();
	}
	public void toBePaid()
	{
		System.out.println("Please pay bill via ");
		System.out.print("1.Credit Card \n2.debit card \n3.Google Pay \n4.By cash");
		System.out.print("\n\nEnter the Choice ==>");
		int c=sc.nextInt();

		switch(c) {
		case 1:
			this.CreditCard();
			break;

		case 2:
			this.CreditCard();
			break;

		case 3:
			this.gPay();
			break;
		case 4:
			this.cash();
			break;
		
		default:
			System.out.println("Invalid Payment Mode !!!");// default

		}
	}
}

