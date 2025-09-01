import java.util.*;

class SortByRollNo implements Comparator<Student>
{
	public int compare(Student o1,Student o2)
	{
		return o1.getRollNo().compareTo(o2.getRollNo());
	}
}