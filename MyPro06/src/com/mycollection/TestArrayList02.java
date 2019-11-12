package com.mycollection;

import javax.management.ObjectName;

public class TestArrayList02<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFAULT_CAPACITY=10;

    public TestArrayList02(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public TestArrayList02(int capacity){
        elementData = new Object[capacity];
    }

    public void add(E e){
//      扩容
        if(size == elementData.length){
            Object[] newArray = new Object[elementData.length + (elementData.length>>1)];
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;
        }
        elementData[size++] = e;
    }

    public void  remove(E e){
        for (int i=0; i<size; i++){
            if(e.equals(elementData[i])){
                remove(i);
            }
        }
    }

    public void remove(int index){
        int removeNum = elementData.length-index-1;
        isCheck(index);
        System.arraycopy(elementData,index+1,elementData,index,removeNum);
        elementData[--size]=null;

    }

    public void isCheck(int index){
        if (index<0 || index > size-1){
            throw new RuntimeException("下标不在范围内："+index);
        }

    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
//        if (size==0){
//            return true;
//        }else {
//            return false;
//        }
        return size ==0 ? true : false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for(int i=0; i<size; i++){
            stringBuilder.append(elementData[i]+",");
        }
        stringBuilder.setCharAt(stringBuilder.length()-1,']');
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        TestArrayList02<String> t = new TestArrayList02(2);
        t.add("aa");
        t.add("bb");
        t.add("cc");
        t.remove(0);
        System.out.println(t.toString());
    }
}
