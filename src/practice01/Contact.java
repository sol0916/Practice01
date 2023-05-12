package practice01;

import java.util.Scanner;

public class Contact {
	private String name;
	private long phoneNum;
	private String eMail;
	private String address;
	private int birthday;
	private String group;
		
	
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("핸드폰 번호를 입력하세요");
		phoneNum = sc.nextInt();
		System.out.println("이메일 주소를 입력하세요");
		eMail = sc.next();
		System.out.println("생일을 입력하세요");
		birthday = sc.nextInt();
		System.out.println("그룹을 입력하세요");
		group = sc.next();
		System.out.println();
	}
	
	public void print() {
		System.out.println("-------------------");
		System.out.println("이름 : "+getName());
		System.out.println("번호 : "+getPhoneNum());
		System.out.println("메일 : "+getEMail());
		System.out.println("생일 : "+getBirthday());
		System.out.println("그룹 : "+getGroup());
		System.out.println("-------------------");
	}
	
	public String getName() {
		return name;
	}
	
	public long getPhoneNum() {
		return phoneNum;
	}
	
	public String getEMail() {
		return eMail;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getBirthday() {
		return birthday;
	}
	
	public String getGroup() {
		return group;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void setEMail(String eMail) {
		this.eMail = eMail;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	

}
