// import java.util.*;

// class ComparableEx
// {
// 	public static void main(String[] args) {
// 		ArrayList<Integer> list=new ArrayList<>();
// 		list.add(10);
// 		list.add(20);
// 		list.add(30);
// 		list.add(40);
// 		list.add(50);
// 		list.add(60);

// 		Collections.shuffle(list);

// 		System.out.println(list);

// 		Collections.sort(list);
// 		System.out.println(list);

// 	}
// }

import java.util.*;

class ComparableEx
{
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		Collections.shuffle(list);

		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);

	}
}