package com.mycollection;

public class TestHashMap {

    Node2[] table; //位桶数组
    int size;

    public  TestHashMap(){
        table = new Node2[16];
    }

    public void put(Object key,Object value){
        Node2 newNode = new Node2();
        //确实该节点的hash值
        newNode.hash = myHash(key.hashCode(),table.length);
        newNode.key=key;
        newNode.value= value;
        newNode.next = null;
//        System.out.println(newNode.hash);
        Node2 temp = table[newNode.hash];
//        正在遍历最后一个元素
        Node2 iterLast = null;
        boolean keyRepeat = false;
        if (temp == null){
//             此处数组元素为空，则直接将节点放进去
            table[newNode.hash] = newNode;
            size++;
        }else{
            while( temp != null){
                if(temp.key.equals(key)){
                    keyRepeat = true;
                    temp.value = value;
                    break;
                }else{
                    iterLast = temp;
                    temp = temp.next;
                }
            }
            if(!keyRepeat){
                iterLast.next = newNode;
                size++;
            }
        }

    }

    public int myHash(int v,int length){
        return v & (length-1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for(int i=0; i< table.length; i++){
            Node2 temp = table[i];
            while(temp != null){
                sb.append(temp.key+":"+temp.value+",");
                temp = temp.next;
            }
        }
        sb.setCharAt(sb.length()-1,'}');

        return sb.toString();
    }

    public Object get(Object key) {
        int hash=myHash(key.hashCode(),table.length);
        Object value = null;

        if(table[hash] != null){
            Node2 temp = table[hash];

            while(temp != null){
                if(temp.key.equals(key)){
                    value = temp.value;
                    break;
                }else{
                    temp = temp.next;
                }
            }
        }

        return value;
    }

    public static void main(String[] args) {
        TestHashMap m = new TestHashMap();
        m.put(10,"aa");
        m.put(20,"bb");
        m.put(30,"cc");
        System.out.println(m);
//        System.out.println(8 % (18-1));
    }

}
