import java.util.*;

class DLL1<E>
{
	Node<E> head;
	Node<E> tail;
	int indx;

	public class Node<E>
	{
		Node<E> next;
		Node<E> prev;
		E ele;

		public Node(Node<E> prev,E ele)
		{
			this.next=next;
			this.prev=prev;
			this.ele=ele;
		}
	}

	public String toString()
	{
		String data="[";
		if(indx==0)return "[]";
		else{
			Node<E> currNode=head;
			for(int i=0;i<size()-1;i++)
			{
				data+=currNode.ele+", ";
				currNode=currNode.next;
			}
			data+=currNode.ele+"]";
		}
		return data;
	}

	public void add(E ele)
	{
		Node<E> newNode=new Node<>(tail,ele);
		if(indx==0)
		{
			head=newNode;
			tail=newNode;
		}else{
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
		indx++;
	}

	public int size()
	{
		return indx;
	}

	public void addFirst(E ele)
	{
		Node<E> newNode=new Node<>(null,ele);
		if(indx==0)
		{
			head=newNode;
			tail=newNode;
		}else{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		indx++;
	}

	public void addLast(E ele)
	{
		add(ele);
	}

	public E get(int indx)
	{
		Node<E> currNode=head;
		for(int i=0;i<indx;i++)
		{
			currNode=currNode.next;
		}
		return currNode.ele;
	}

	public E remove(int indx)
	{
		Node<E> currNode=head;
		for(int i=0;i<indx;i++)
		{
			currNode=currNode.next;
		}		
		E temp=currNode.ele;
			currNode.prev.next=currNode.next;
			currNode.next.prev=currNode.prev;
		this.indx--;
		return temp;
	}

	public E removeFirst()
	{
		E temp=head.ele;
		head=head.next;
		head.prev=null;

		indx--;
		return temp;
	}

	public E removeLast()
	{
		E temp=tail.ele;
		tail=tail.prev;
		tail.next=null;
		indx--;
		return temp;
	}
}

class DoublyLinkedListEx
{
	public static void main(String[] args) {
		DLL1<Integer> dll=new DLL1<>();
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.add(40);

		System.out.println(dll);

		dll.addFirst(1000);

		System.out.println(dll);

		dll.addLast(90000);

		System.out.println(dll);

		System.out.println(dll.get(0));
		System.out.println(dll.get(3));
		System.out.println(dll.get(5));
		// System.out.println(dll.get(10));//NullPointerException

		dll.remove(3);
		System.out.println(dll);

		dll.removeFirst();
		System.out.println(dll);

		dll.removeLast();
		System.out.println(dll);




	}
}