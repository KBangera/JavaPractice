
public class LinkedList {

    public ListNode head;
    public int size;

    public LinkedList(){
        head=null;
    }

    public void addAtBegin(int data) {
        ListNode n=new ListNode(data);
        n.next=head;
        head=n;
        size++;
    }

    public int deleteAtBegin() {
       int temp=head.data;
       head=head.next;
       size--;
       return temp;
    }

    public void deleteAtEnd() {
    ListNode current=head;
    if(head.next==null){
        head=null;
    }
    else{
        while(current.next.next!=null){
            current=current.next;
        }
        int temp=current.next.data;
        current.next=null;
        size--;
    }
    }

    public void addAtEnd(int data) {
        if(head==null){
            addAtBegin(data);
        }
        else{
            ListNode node=new ListNode(data);
            ListNode current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=node;
            size++;
        }
    }

    public int getSize(){
        return size;
    }

    public int elementAt(int index){
        if(index>size){
            return -1;
        }
        ListNode node=head;
        while(index-1!=0){
            node=node.next;
            index--;
        }
        return node.data;
    }

    public int search(int data){
        ListNode node=head;
        int count=1;
        while(node!=null){
            if(node.data==data){
                return count;
            }
            else{
                node=node.next;
                count++;
            }
        }
        return -1;
    }

    public void addAtIndex(int data, int position){
    if(position==1){
        addAtBegin(data);
    }
    int len=size;
    if(position>len+1 || position<1){
        System.out.println("\nINVALID POSITION");
    }
    if(position==len+1){
        addAtEnd(data);
    }
    if(position<=len && position>1){
        ListNode node=new ListNode(data);
        ListNode current=head;
        while((position-2)>0){
            current=current.next;
            position--;
        }
        node.next=current.next;
        current.next=node;
        size++;
    }
    }

    public void display() {
        System.out.println("");
        ListNode current=head;
        while(current!=null){
            System.out.print("->"+current.data);
            current=current.next;
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        LinkedList a = new LinkedList();
        a.addAtBegin(5);
        a.addAtBegin(15);
        a.addAtEnd(20);
        a.addAtEnd(21);
        a.deleteAtBegin();
        a.deleteAtEnd();
        a.addAtIndex(10, 2);
        a.addAtEnd(15);
        a.display();
        System.out.println("\n Size of the list is: " + a.size);
        System.out.println(" Element at 2nd position : " + a.elementAt(2));
        System.out.println(" Searching element 20, location : " + a.search(15));
    }
}
