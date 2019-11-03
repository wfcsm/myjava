package com.mycollection;

public class TestArrayList<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public TestArrayList(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public TestArrayList(int capacity){
        if(capacity<0){
            throw new RuntimeException("容器的容量不能为负数");
        }else if(capacity==0){
            elementData = new Object[DEFAULT_CAPACITY];
        }else{
            elementData = new Object[capacity];
        }

    }

    public void add(E e){
//        什么时候扩容
        if(size == elementData.length){
//          怎么扩容
            Object[] newArray = new Object[elementData.length+(elementData.length>>1)];
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;
        }
        elementData[size++] = e;
    }

    public E get(int index){
        checkRange(index);
        return (E)elementData[index];
    }

    public void set(E element, int index){
        checkRange(index);
        elementData[index] = element;
    }

    /**
     * 检测索引是否在范围
     * @param index
     */
    public void  checkRange(int index){
        if(index<0 || index>size-1){
//            不合法
            throw new RuntimeException("索引不合法:"+index);
        }
    }

    public void remove(E element){
        for(int i=0; i<size; i++){
            if(element.equals(get(i))){
                remove(i);
            }
        }
    }


    public void remove(int index){
        int numMoved = elementData.length-index-1;
        if(numMoved>0){
            System.arraycopy(elementData,index+1,elementData,index,elementData.length-index-1);
        }
        elementData[--size]=null;

    }

    public  int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0 ? true : false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0; i<size; i++){
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args) {
        TestArrayList<String> t = new TestArrayList();
        for(int i=0; i<400; i++){
            t.add("zyc"+i);
        }
        t.set("weqe",-10);
        System.out.println(t.toString());
        System.out.println(t.get(10));
    }
}
