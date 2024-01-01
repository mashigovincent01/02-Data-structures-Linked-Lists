public class LinkedList{
    ListNode head;
    private int length = 0;

    public LinkedList(){
        length = 0;
        head = null;
    }

    public synchronized ListNode getHead(){
        return this.head;
    }

    public synchronized void insertAtBegin(ListNode node){
        node.setNext(head);
        head = node;
        length++;
    }

    public synchronized void insertAtEnd(ListNode node){
        if(head == null){
            head = node;
        }
        else{
            
            ListNode temp = head;
            for(; temp.getNext() != null; temp = temp.getNext());
            temp.setNext(node);
        }
    }

    public void insert(int data, int position){
        if(head == null){
            head = new ListNode(data);
        }
        else if(position == 0){
            ListNode temp = new ListNode(data);
            temp.setNext(head);
            head = temp;
        }
        else{
            //MUST FIX HERE
            ListNode p = head;
            ListNode c = head.getNext();
            ListNode newNode = new ListNode(data);
            int i = 0;
            for(; i != position; i++, p = p.getNext(), c = c.getNext()){
                System.out.println("Here");
            };
            p.setNext(newNode);
            newNode.setNext(c);
        }

        length++;
    }
    public String toString(){
        String res = "[ ";
        if(head != null){
            ListNode temp = head;
            while(temp != null){
                System.out.println("Hello world");
                res += temp.getData() + " ";
                temp = temp.getNext();
            }
        }
        res += "]";
        return res;
    }
}