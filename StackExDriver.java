class StackEx<E>{

	E [] arr;
	static final int INITIAL_CAPACITY=10;
	int indx;

	StackEx()
	{
		arr=(E[])new Object[INITIAL_CAPACITY];
	}
	StackEx(int capacity)
	{
		arr=(E[])new Object[capacity];
	}
	public E push(E ele)
	{
		arr[indx]=ele;
		indx++;
		return ele;
	}

	public E pop()
	{
		E temp=arr[size()-1];
		arr[size()-1]=null;
		indx--;
		return temp;
	}

	public int size()
	{
		return indx;
	}

	public boolean empty()
	{
		return indx==0;
	}

	public String toString()
	{
		String data="[";
		if(indx==0)
		return "[]";
		else{
			for(int i=0;i<size()-1;i++)
			{
				data+=arr[i]+", ";
			}
			data+=arr[size()-1]+"]";
		}
		return data;
	}

	public E peek()
	{
		return arr[size()-1];
	}

	public int search(E ele)
	{
		for(int i=size()-1,offset=0;i>=0;i--,offset++)
		{
           if(arr[i].equals(ele))
           {
           	return offset;
           }
		}
		return -1;
	}

}


class StackExDriver
{
	public static void main(String[] args) {

		StackEx<Integer> stack=new StackEx<>();
		System.out.println(stack.empty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack);

		stack.pop();

		System.out.println(stack);

		System.out.println(stack.empty());

		System.out.println(stack.peek());

		System.out.println(stack.search(10));
	}
}