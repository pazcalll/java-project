package week10;

public class SinglyLinkedList {
    Node head;
    int size;
    public SinglyLinkedList(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void addFirst(int item){
        Node baru = new Node(item);
        if (isEmpty()) {
            head = baru;
        }else{
            baru.next=head;
            head =baru;
        }
        size++;
    }
    void addLast(int item){
        Node baru = new Node(item);
        if (isEmpty()) {
            head = baru;
        }else{
            Node tmp = head;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next = baru;
        }
        size++;
    }
    public void add(int item, int index){
        if (index<0 || index>size) {
            System.out.println("Index out of bound");
        }else if(isEmpty() || index==0){
            addFirst(item);
        }else if(index == size){
            addLast(item);
        }else{
            Node baru = new Node(item);
            Node tmp=head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            baru.next=tmp.next;
            tmp.next=baru;
        }
        size++;
    }
    void addd(int item, int key){
        if (key<0 ) {
            System.out.println("Index out of bound");
        }else if(isEmpty() || key==0){
            addFirst(item);
        }else if(key == size){      
            addLast(item);
        }else{
            Node baru = new Node(item);
            Node tmp=head;
            try{
                while (tmp.data != key) {
                    tmp = tmp.next;
                }
            }catch(Exception e){System.out.println("out of bound");}
            System.out.println("------------------------"+tmp.data);
            baru.next=tmp.next;
            tmp.next=baru;
        }
        size++;
    }
    int getFirst()throws Exception{
        if(isEmpty()) throw new Exception("List is empty!");
        return head.data;
    }
    int getLast() throws Exception{
        if (isEmpty()) throw new Exception("List is empty!");
        Node tmp = head;
        while(tmp.next!=null){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    int get(int index) throws Exception{
        if(isEmpty()||index<0||index>=size)
            throw new Exception("List is empty or invalid index!");
        Node tmp = head;
        for (int i = 1; i <= index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    void removeFirst(){
        if(!isEmpty()){
            Node tmp = head;
            head = tmp.next;
            tmp=null;
        }else{
            System.out.println("List is empty!");
        }
    }
    void removeLast(){
        if (!isEmpty()) {
            if (head.next==null)
                removeFirst();
            else{
                Node tmp = head;
                while(tmp.next.next!=null){
                    tmp = tmp.next;
                }
                tmp.next = null;
            }
        }
        else{
            System.out.println("List is empty!");
        }
    }
    void remove(int index){
        if(isEmpty()||index<0||index>=size){
            System.out.println("List is empty or invalid index!");
        }else{
            if (index==0)
                removeFirst();
            else if(index==size-1)
                removeLast();
            else{
                Node tmp = head;
                for (int i = 1; i < index; i++) {
                    tmp = tmp.next;
                }
                tmp.next=tmp.next.next;
                size--;
            }
        }
    }
    void removee(int key){
        if(isEmpty()||key<0){
            System.out.println("List is empty or invalid key!");
        }else{
            if (head.data==key){
                removeFirst();
            }
            else{
                    Node tmp=head;
                if (head.data!=key) {
                    for (int i=1;tmp.data!=key;i++) {
                        tmp = tmp.next;
                    }
                    int tmp1 = tmp.next.data;
                    tmp.data=tmp1;
                tmp.next=tmp.next.next;
                }
                    size--;
            }
        }
    }
    void clear(){
        head = null;
        size = 0;
    }
    void print(){
        Node tmp = head;
        System.out.println("Size = "+size);
        while(tmp!=null){
            System.out.println(""+tmp.data);
            tmp = tmp.next;
        }
        System.out.println("--------------------");
    }
}
