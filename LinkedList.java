public class LinkedList extends Node
{
	private head;
	public LinkedList()
	{
		head=null;
	}
	public boolean is_empty()
	{
		return (head==null);
	}
	public void push_front(Node param)
	{
		if(is_empty())
		{
			head=param;
		}
		else
		{
			Node temp=head;
			head=param;
			param.setNext(temp);
		}
	}
	public void push_back(Node param)
	{
		if(is_empty())
		{
			head=param;
		}
		else
		{
			Node temp=head;
			while(temp.getNext())
			{
				
			}
		}
	}
}
