import java.util.*;

class StudentInnerClass 
{
	private String name;
	private Integer rollNo;
	private Long phoneNo;
	private String email;

	public StudentInnerClass(String name,Integer rollNo,Long phoneNo,String email)
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
		List<StudentInnerClass> studentList =new ArrayList<>();
		studentList.add(new StudentInnerClass("Amey",123,9846382902l,"amey674@gmail.com"));
		studentList.add(new StudentInnerClass("Vijay",111,9841234902l,"vijay4@gmail.com"));
		studentList.add(new StudentInnerClass("Kaustubh",23,9847982902l,"kaustubh6@gmail.com"));
		studentList.add(new StudentInnerClass("Zingat",163,9848992902l,"zingat90@gmail.com"));
		studentList.add(new StudentInnerClass("Varun",193,9846356902l,"varun634@gmail.com"));
      

		class SortByName implements Comparator<StudentInnerClass>
		{
           public int compare(StudentInnerClass o1,StudentInnerClass o2)
			{
				return o1.getName().compareTo(o2.getName());
			}
		}

		class SortByRollNo implements Comparator<StudentInnerClass>
		{
           public int compare(StudentInnerClass o1,StudentInnerClass o2)
			{
				return o1.getRollNo().compareTo(o2.getRollNo());
			}
		}
        
		Collections.sort(studentList,new SortByName());
		System.out.println(studentList);
		System.out.println("--------------------------------------------------------------------");

		Collections.sort(studentList,new SortByRollNo());
		System.out.println(studentList);
		System.out.println("---------------------------------------------------------------------");

	}


}