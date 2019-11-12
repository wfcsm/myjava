package com.mycollection;

public class LinkedList<E> {
    private Node first;
    private Node last;

    private int size;

    public void add(E obj){
        Node node = new Node(obj);
        if (first == null){
            first = node;
            last = node;
        }else{
            node.previous = last;
            node.next = null;
            last.next = node;
            last = node;
        }
        size++;
    }

    public void add(int index, E obj){
        checkRange(index);
        Node newNode = new Node(obj);
        Node temp = getNode(index);
        if (temp!=null){
            Node up=temp.previous;
            up.next = newNode;
            newNode.previous=up;
            newNode.next=temp;
            temp.previous=newNode;
        }
        size++;
    }

    public E get(int index){
       checkRange(index);
        Node temp = getNode(index);
        return (E)temp.element;
    }

    private void checkRange(int index){
        if(index<0 || index > size-1){
            throw new RuntimeException("索引数字不合法");
        }
    }

    private Node getNode(int index){
        checkRange(index);
        Node temp = null;
        if(index <= (size>>1) ){
            temp = first;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
        }else{
            temp = last;
            for(int i=size-1; i>index; i--){
                temp=temp.previous;
            }
        }
        return temp;
    }

    public void  remove(int index){
        checkRange(index);
        Node temp = getNode(index);
        if(temp!=null){
             Node up=temp.previous;
             Node down=temp.next;
             if(up != null) {
                 up.next = down;
             }
             if(down != null){
                 down.previous = up;
             }
             if(index == 0){
                 first= down;
             }
             if(index ==size-1){
                 last = up;
             }

            size--;
        }

    }

    @Override
    public String toString() {
//        [a,b,c]
        StringBuilder sb = new StringBuilder("[");
        Node temp = first;
        while( temp != null ){
            sb.append(temp.element+",");
            temp = temp.next;
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list.toString());
//        list.toString();
//        System.out.println(list.get(0));
        list.remove(2);
        System.out.println(list);
    }
}
