package Bankproject;
import java.util.*;
public class user {
	private int id;
	private  String name;
	private  String email;
	private String password;
	private String contact;
	private int balance;
	private String accNum;
	private int loan;
	private int Loan;
	public user(int id,String name,String email,String contact,String password,String accNum,int balance,int loan) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.password=password;
		this.contact=contact;
		this.accNum=accNum;
		this.balance=balance;
        this.loan=loan;

	}
	public int getLoan() {
		return loan;
	}
	public void setLoan(int loan) {
		this.loan=loan;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}

	public String toString() {
		return id+"\t"+name+"\t"+email+"\t"+password;
	}
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum=accNum; 
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name; 
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email; 
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String Contact) {
		this.contact=contact; 
	}
	public int getBalance() {
		return balance;

	}
	public void setbalance(int balance) {
		this.balance=balance; 
	}



}


