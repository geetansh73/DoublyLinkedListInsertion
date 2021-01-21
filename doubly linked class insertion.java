public class doublylinkedlist
{
    Node head=null;
    class Node
    {
    int data;
    Node next,prev;
    Node(int d)
    {
    data=d;
    }
    }
    void push(int data)
    {
        Node o=new Node(data);
        o.next=head;
        o.prev=null;
        if (head!=null)
        {
        head.prev=o;
        }
        head=o;
    }
    void append(int data)
    {
    Node o=new Node(data);
    o.next=null;
    if (head==null)
    {
    head=o;
    o.prev=null;
    }
    Node last=head;
    while(last.next!=null)
    {
    last=last.next;
    }
    last.next=o;
    o.prev=last;
    }
    void insertafter(Node prev,int data)
    {
    Node o=new Node(data);
    o.next=prev.next;
    prev.next=o;
    o.prev=prev;
    if (o.next!=null)
    {
    o.next.prev=o;
    }
    }
    
    void print()
    {
    Node g=head;
    while(g!=null)
    {
    System.out.println(g.data+" ");
    g=g.next;
    }
    }
    
    
public static void main(String g[])
{
doublylinkedlist obj=new doublylinkedlist();
obj.push(1);
obj.append(2);
obj.push(3);
obj.append(4);
obj.append(5);
obj.insertafter(obj.head.next.next,6);
obj.print();
}
}