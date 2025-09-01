import java.util.*;

class Student 
{
	private String name;
	private Integer rollNo;
	private Long phoneNo;
	private String email;

	public Student(String name,Integer rollNo,Long phoneNo,String email)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.phoneNo=phoneNo;
		this.email=email;
	}

	public String toString()
	{
		return "Name : "+name+" , RollNo :"+rollNo+" , Phone No :"+phoneNo+" , Email :"+email;
	} 

	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}

	public Integer getRollNo()
	{
		return rollNo;
	}

	public Long getPhoneNo()
	{
		return phoneNo;
	}

	public static void main(String[] args) {
		List<Student> studentList =new ArrayList<>();
		studentList.add(new Student("Amey",123,9846382902l,"amey674@gmail.com"));
		studentList.add(new Student("Vijay",111,9841234902l,"vijay4@gmail.com"));
		studentList.add(new Student("Kaustubh",23,9847982902l,"kaustubh6@gmail.com"));
		studentList.add(new Student("Zingat",163,9848992902l,"zingat90@gmail.com"));
		studentList.add(new Student("Varun",193,9846356902l,"varun634@gmail.com"));
      

		System.out.println(studentList);

		System.out.println("------------------------------------------------------------------------------------");


		Collections.sort(studentList,new SortByName());

		System.out.println(studentList);

		System.out.println("-----------------------------------------------------------------------------------");

		Collections.sort(studentList,new SortByRollNo());

		System.out.println(studentList);

		System.out.println();


	}


}