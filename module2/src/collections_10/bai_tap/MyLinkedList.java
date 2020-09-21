package collections_10.bai_tap;

public class MyLinkedList<E>{
    public class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    private Node head;
    private int numNodes = 0;
    public MyLinkedList(){
    }
    public int size(){
        return numNodes;
    }

    // Phuong thuc tra ve data theo index
    public Object get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    // Kiem tra 1 phan tu co ton tai trong danh sach khong
    public boolean contains(E element){
        Node temp = head;
        while (temp.next != null){
            if (temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    //vi tri index cua phan tu
    public int indexOf(E element){
        Node temp = head;
        for (int i = 0; i < numNodes; i++){
            if (temp.getData().equals(element))
                return i;
            temp = temp.next;
        }
        return -1;
    }
    //them phan tu vao cuoi
    public void addLast(E e){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }
    //them doi tuong vao index dau tien
    public void addFirst(E e){
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    //them doi tuong vao vi tri thu index
    public void add(int index,E data){
        Node temp = head;
        Node holder;
        for(int i = 0; i < index - 1 && temp.next != null; i++){
            temp = temp.next;
        }
        // holder tham chieu den vi tri index
        holder = temp.next;
        //Node tai vi tri index-1 tro den Node moi
        temp.next = new Node(data);
        //Node moi tro toi holder
        temp.next.next = holder;
        numNodes++;
    }

    //xoa doi tuong tai vi tri index
    public E remove(int index){
        if (index < 0 || index > numNodes){
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        // khai bao du lieu Object de nhan gia tri tra ve
        Object data;

        //Neu index = 0 thi tra ve data hien tai va head moi se la Node ke tiep
        if (index == 0){
            data = temp.data;
            head = head.next;
        } else {
            //Neu index > 0 cho con tro chay den index - 1
            for (int i = 0; i < index - 1 && temp.next != null; i++){
                temp = temp.next;
            }
            //data tro den Node index
            data = temp.next.data;
            //Node index tro den Node index + !
            temp.next = temp.next.next;
        }
        numNodes++;
        return (E) data;
    }
    public boolean remove(E element){
        //Remove neu doi tuong la head
        if (head.data.equals(element)){
            remove(0);
            return true;
        } else {
            Node temp = head;
            while (temp.next != null){
                //Neu ton tai 1 phan tu co data bang data truyen vao thi Node do se tro den Node thu 2 ke tiep
                if (temp.next.data.equals(element)){
                    temp.next = temp.next.next;
                    numNodes++;
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }
    public MyLinkedList<E>clone(){
        //Neu phan tu = 0 thi throw Exception
        if (numNodes == 0){
            throw new NullPointerException();
        }
        // Khai bao danh sach tra ve
        MyLinkedList<E> temp = new MyLinkedList<E>();
        Node tempNode = head;
        //add head vao danh sach tra ve
        temp.addFirst((E) tempNode.data);
        //tro den Node ke tiep
        tempNode = tempNode.next;
        //add tat ca Node ke tiep vao danh sach
        while (tempNode != null){
            temp.addLast((E) tempNode.data);
            tempNode = tempNode.next;
        }
        return temp;
    }
}
