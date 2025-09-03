import java.util.*;

class Ticket 
{
	static int tkt=123456;
	static int seat=12;
	String name;
	char gender;
	int age;
	String ticketNo;
	String seatNo;

	Ticket(String name,char gender,int age)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	{
		ticketNo="TKT-"+tkt++;
        seatNo="SE"+seat++;
	}

	public String toString()
	{
		return "Ticket No :"+ticketNo+" , SeatNo :"+seatNo+" , Name :"+name+" , Gender :"+gender+" , Age :"+age;
	}
}

class TicketNoSortAscending implements Comparator<Ticket>
{
	public int compare(Ticket t1,Ticket t2)
	{
		return t1.ticketNo.compareTo(t2.ticketNo);
	}
}
class TicketNoSortDescending implements Comparator<Ticket>
{
	public int compare(Ticket t1,Ticket t2)
	{
		return t2.ticketNo.compareTo(t1.ticketNo);
	}
}

class ComparatorEx
{
	public static void main(String[] args) {

		ArrayList<Ticket> ticketList=new ArrayList<>();
		ticketList.add(new Ticket("Vishal",'M',22));
		ticketList.add(new Ticket("Vivek",'M',25));
		ticketList.add(new Ticket("Aayush",'M',23));
		ticketList.add(new Ticket("Renuka",'F',20));
		ticketList.add(new Ticket("Shrutika",'F',21));

		Collections.shuffle(ticketList);
		ticketList.stream().forEach(ele->System.out.println(ele));

		for( ; ; )
		{
			System.out.println();
			System.out.println("1.Ascending TicketNo");
			System.out.println("2.Descending TicketNo");
			System.out.println("3.Ascending SeatNo");
			System.out.println("4.Descending SeatNo");
			System.out.println("5.Ascending Name");
			System.out.println("6.Descending Name");
			System.out.println("7.Ascending Age");
			System.out.println("8.Descending Age");
			System.out.println("Enter choice :");
			int opt=new Scanner(System.in).nextInt();

			switch(opt)
			{
			case 1->{
				System.out.println("----------------------------------------------------------------------------");

				Collections.sort(ticketList,new TicketNoSortAscending());
				ticketList.stream().forEach(ele->System.out.println(ele));
			        }
			case 2->{
				System.out.println("----------------------------------------------------------------------------");

				Collections.sort(ticketList,new TicketNoSortDescending());
				ticketList.stream().forEach(ele->System.out.println(ele));
			       }
			case 3->{
				System.out.println("----------------------------------------------------------------------------");
				Collections.sort(ticketList,new Comparator<Ticket>(){
                     public int compare(Ticket t1,Ticket t2)
                     {
                     	return t1.seatNo.compareTo(t2.seatNo);
                     }
				});
				ticketList.stream().forEach(ele->System.out.println(ele));
			      }
			case 4->{
				System.out.println("----------------------------------------------------------------------------");
				Collections.sort(ticketList,new Comparator<Ticket>(){
                     public int compare(Ticket t1,Ticket t2)
                     {
                     	return t2.seatNo.compareTo(t1.seatNo);
                     }
				});
				ticketList.stream().forEach(ele->System.out.println(ele));
			       }
			case 5->{
				System.out.println("----------------------------------------------------------------------------");
				Collections.sort(ticketList,(t1,t2)->t1.name.compareTo(t2.name));
				ticketList.stream().forEach(ele->System.out.println(ele));
			       }
			case 6->{
				System.out.println("----------------------------------------------------------------------------");
				Collections.sort(ticketList,(t1,t2)->t2.name.compareTo(t1.name));
				ticketList.stream().forEach(ele->System.out.println(ele));
			       }
			case 7->{
				System.out.println("----------------------------------------------------------------------------");
				Collections.sort(ticketList,(t1,t2)->t1.age-t2.age);
				ticketList.stream().forEach(ele->System.out.println(ele));
			        }
			case 8->{
				System.out.println("----------------------------------------------------------------------------");
				Collections.sort(ticketList,(t1,t2)->t2.age-t1.age);
			 	ticketList.stream().forEach(ele->System.out.println(ele));
			        }

			}
		}
	}
}