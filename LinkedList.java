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
	public Node pop_front()
	{
		if(is_empty())
		{
			return null;
		}
		else{
			Node safenode=head;
			head=head.getNext();
			safenode.setNext(null);
			return safenode;
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
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(param);
		}
	}
	public Node pop_back()
	{
		if(is_empty())
		{
			return null;
		}
		else{
			Node temp=head;
			while(temp.getNext().getnext()!=null)
			{
				temp=temp.getNext();
			}
			Node safenode=temp.getNext();
			temp.setNext(null);
			return safenode;
		}
	}
}
