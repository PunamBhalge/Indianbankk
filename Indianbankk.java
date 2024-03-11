package com.bank.core;

import java.util.Scanner;

import javax.annotation.processing.Generated;

public class Indianbankk {

	private static int generatedOTP;

	static int getOTP() {
		return (int) (Math.random()*9000+1000);
	}

	public static void main(String[] args) {

		int accno=777, ss;
		String pass= "Punam";
		long custmono=8788361434L;

		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter accno and pass");
		int accno1=scanner.nextInt();
		scanner.nextLine();
		String pass1= scanner.nextLine();
		boolean flag = true;
		if (accno1==accno && pass.equals(pass1)) {
			System.out.println("welcome to bank");
		}
		else {
			System.out.println("invalid Details try again....");
		}
		flag=true;
		int accbal = 555;
		System.out.println("1. deposit 2.withdraw  3.transfer 4.change mobile number");
		ss=scanner.nextInt();
		switch (ss) {

		case 1:
			System.out.println("account bal before deposit"+accbal);
			System.out.println("please enter amount to deposit");
			int amount =scanner.nextInt();
			accbal=accbal+amount;
			System.out.println("deposit successful your bal is"+accbal);
			break;

		case 2:
			System.out.println("account bal before withdraw"+accbal);
			System.err.println("please enter withdraw ammount");
			int amount1=scanner.nextInt();

			boolean punam = false;
			if (accbal>amount1) {
				accbal = accbal-amount1;
				System.out.println("withdraw successful accbal is"+accbal); }
			else {
				System.out.println("insufficient bal");
			}
			punam =false;
			break;

		case 3:
			//System.out.println("check your account bal"+accbal);

			int otp;
			System.out.println(" account bal before transfer: "+accbal);

			System.out.println(" account no to transfer money: ");
			accno=scanner.nextInt();

			System.out.println("please enter amount to transfer");
			int amount2=scanner.nextInt();

			if (accbal>amount2)
			{
				generatedOTP=getOTP();
				System.out.println("\n Enter OTP: "+generatedOTP);

				otp=scanner.nextInt();

				if (otp==generatedOTP) {
					accbal=accbal-amount2;
					System.out.println("Successfull: "+accbal);
				} else {
					System.out.println("Invalid Otp");
				}
			}
			else {
				System.out.println("insufficient bal");
			}
			break;
		
			case 4: 
				System.out.println("enter your current mobile number");
				long num=scanner.nextLong();
				if (custmono==num) {
					System.out.println("please enter new mobile number");
					num=scanner.nextLong();
					custmono=num;
					System.out.println("your updated mo no is ::"+ custmono);
					
				}
				else {
					System.out.println("invalid current mobile number ::: please try again");
				}
				
				break;

			default:
				break;
			}


		}
		
	}

