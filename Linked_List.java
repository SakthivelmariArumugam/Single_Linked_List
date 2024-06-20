import java.util.Iterator;

public class Linked_List<T> implements Iterable<T>{
    Node head;
    class Node{
        T data;
        Node next;
        Node(T val)
        {
            data=val;
            next=null;
        }
    }
    Linked_List()
    {
        head=null;
    }
    public void insertAtBegining(T val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }

    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void insertAtPos(int pos,T val)
    {
        if(pos==0)
        {
            insertAtBegining(val);
            return;
        }
        Node newNode=new Node(val);
        Node temp=head;
        for(int i=1;i<pos;i++)
        {
            temp=temp.next;
            if(temp==null)
            {
                throw new IllegalArgumentException("Invalid Poistion:"+pos);
            }
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void deleteAtPos(int pos)
    {
        if(head==null)
        {
            throw new IndexOutOfBoundsException("list is empty");
        }
        if(pos==0)
        {
            head=head.next;
            return;
        }
        Node temp=head;
        Node prev=null;
        for(int i=1;i<=pos;i++)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
    public T getElementPos(int pos)
    {
        Node temp=head;
        for(int i=1;i<=pos;i++)
        {
            temp=temp.next;
            if(temp==null)
            {
                throw new IllegalArgumentException("Invalid Position:"+pos);
            }
        }
        return temp.data;
    }
    public void UpdateValPos(int pos,T val)
    {
        Node temp=head;
        for(int i=1;i<=pos;i++)
        {
            temp=temp.next;
            if(temp==null)
            {
                throw new IllegalArgumentException("Invalid Position:"+pos);
            }
        }
        temp.data=val;
    }
    public void DeleteAtEnd()
    {
        Node temp=head;
        Node prev=null;
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }
    public void insertAtEnd(T val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;

    }
    public int SearchValue(T val)
    {
        Node temp=head;
        int pos=0;
        while(temp!=null)
        {
            if(val==temp.data)
            {
                return pos;
            }
            temp=temp.next;
            pos++;
        }
        return 0;
    }
    public boolean Contains(T val)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(val==temp.data)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public int length()
    {
        int len=0;
        Node temp=head;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        return len;
    }
    public Iterator<T> iterator()
    {
        return new Iterator<T>() {
            Node temp = head;

            public boolean hasNext() {
                return temp != null;
            }

            public T next() {
                T val = temp.data;
                temp = temp.next;
                return val;
            }

        };
    }
    public void reverseList()
    {
        Node prev=null;
        Node current=head;
        Node next=head.next;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

}

