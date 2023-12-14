
package Bankproject;
import java.util.Scanner;


public class execute {
	int id;
	String name;
	String email;
	String password;
	String contact;
	String accNum;
	int count;
	int key;
	int balance;
	int amount;
	int key1;
	String newpassword;
	int loan;
	//   int deposit;
	//   int withdraw;
	user arr[]=new user[10];
	Scanner sc=new Scanner(System.in);





	public void REGISTER() {
		do{


			System.out.println("1---------Register page-----");
			System.out.println("2-------login-----------");
			key=sc.nextInt();
			switch (key) { 
			case 1: 
				System.out.println("id name email contact password balance");
				id=sc.nextInt();
				name=sc.next();
				email=sc.next();
				contact=sc.next();
				password=sc.next();
				balance=0;
				loan=0;
				String accNum=new StringBuffer(contact).reverse().toString();
				System.out.println("Your account Number is : "+accNum);
				arr[count]=new user(id,name,email,contact,password,accNum,balance,loan);
				count++;
				System.out.println("register succesfully");
				System.out.println("\n");
				break;
			case 2:
				System.out.println("enter account");
				accNum=sc.next();
				System.out.println("enter password");
				password=sc.next();

				for(user u:arr) {
					if(u!=null && u.getPassword().equals(password)&&u.getAccNum().equals(accNum) ) {
						System.out.println("login succesfully");
						check(u);
						break;
					}


				}
				//  break;
			default:
				System.out.println("========your password or account number is wrong========");
			}
		}while(key!=0) ; 	  

	}
	public void check(user u) {
		//  REGISTER();
		do {
			System.out.println("1.check  user details");
			System.out.println("2.check  balance");
			System.out.println("3.update details");
			System.out.println("4.deposit");
			System.out.println("5.withdraw");
			System.out.println("6.change password");
			System.out.println("7.overdraft amount ");

			System.out.println("8.delete account");

			System.out.println("0.logout");

			key1=sc.nextInt();
			switch (key1) {
			case 1: 
				System.out.println(u);
				System.out.println("\n");
				break;
			case 2:
				System.out.println("=========check balance=====");
				System.out.println(u.getBalance());
				System.out.println("\n");
				break;
			case 3:
				System.out.println("===============update details by id=============");
				System.out.println("id,name,email,contact");
				for(int i=0;i<arr.length;i++) {

					if(arr[i]!=null && arr[i].getAccNum().equals(u.getAccNum())) {
						id=sc.nextInt();
						name=sc.next();
						email=sc.next();
						contact=sc.next();
						arr[i]=u;
						u.setId(id);
						u.setName(name);
						u.setEmail(email);
						u.setContact(contact);

						System.out.println("=======updated succesfully========="); 
						System.out.println("\n");
					}
				}
				break;

			case 4:
				System.out.println("==========deposit===========");
				for(int i=0;i<arr.length;i++) {
					if(arr[i]!=null && arr[i].getAccNum().equals(u.getAccNum())) {
						System.out.println("enter amount");
						amount=sc.nextInt();

						balance=balance+amount;
						arr[i].setbalance(balance);	
						System.out.println("======amount is deposited succesfully=============");
						System.out.println("\n");
					}
				}	
				break;

			case 5:
				for(int i=0;i<arr.length;i++) {
					if(arr[i]!=null && arr[i].getAccNum().equals(u.getAccNum())) {
						System.out.println("enter amount");
						amount=sc.nextInt();

						balance=balance-amount;
						arr[i].setbalance(balance);	
						System.out.println("======amount is witdrwan succesfully=============");
						System.out.println("\n");
					}
				}	
				break;
			case 6:System.out.println("=============change pin==============");
			System.out.println("enter old password");
			String	password=sc.next(); 

			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=null && arr[i].getAccNum().equals(u.getAccNum())&& arr[i].getPassword().equals(password)) {
					System.out.println("enter new password");
					String	 newpassword =sc.next();
					arr[i].setPassword(newpassword);
					System.out.println(" your new password has been generated :"+ newpassword );
					System.out.println("\n");
				}
			}
			break;
			case 7: System.out.println("===========overdraft===========");
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=null && arr[i].getAccNum().equals(u.getAccNum()))	{	               
					System.out.println("enter amount");
					amount=sc.nextInt();   

					if(amount>balance && amount<=50000 ) {
						System.out.println("your amount is exceding over your amount");
						loan=amount-arr[i].getBalance();
						System.out.println("youo have a loan amount of rupees:"+ loan);
						arr[i].setbalance(balance-amount);
					}
					else {
						System.out.println("you cannot exceed up to 50000");
						System.out.println("\n");

					}
				}

			}
			break;

			case 8:
				System.out.println("===========delete account===========");
				//	System.out.println("enter account number for deleting account");
				//	accNum=sc.next();
				for(int i=0;i<arr.length;i++) {
					if(arr[i]!=null && arr[i].getAccNum().equals(u.getAccNum())) {
						arr[i]=null;
					}
					System.out.println("=====account deleted succesfully==========");
					System.out.println("\n");
					break;
				}


			case 0:System.out.println("logout");	
			if(key1==0) {
				System.out.println("===========log out succesfully===========");
				break;
			}


			default:
				System.out.println("===========enter valid number=======");
			}


		}while(key1!=0);
	}







	public static void main(String[] args) {
		execute a= new execute();
		a.REGISTER();
	}
}
