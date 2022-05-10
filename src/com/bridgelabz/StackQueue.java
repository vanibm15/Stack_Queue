package com.bridgelabz;
class StackQueue<T>{

    Node<T> head;
    Node<T> tail;

public void add(T data) {
        Node<T> obj2 = new Node<>(data);
        if (head == null) {
        head = obj2;
        tail = obj2;
        } else {
        tail.next = obj2;
        tail = obj2;
        }
        }
// public void insertBetween(T insertData){
//   Node<T> obj2=new Node<>(insertData);
// head.next=obj2;
//obj2.next=tail;


public void print() {
        Node<T> temp = head;
        while (temp != null) {
        System.out.print(temp.data + "=>");
        temp = temp.next;
        }
        }

public Node<T> search(T searchData) {
        Node<T> temp = head;
        Node<T> searchNode = null;
        while (temp != null) {
        if (temp.data.equals(searchData)) {
        searchNode = temp;
        }
        temp = temp.next;
        }
        return searchNode;
        }


public T pop() {
        Node<T> popElement=head;
        T element = popElement.data;
        Node<T> nextelement=popElement.next;
        popElement.data=null;
        popElement.next=null;
        head=nextelement;
        return element;
        }
        }