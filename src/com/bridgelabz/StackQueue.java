package com.bridgelabz;

public class StackQueue<T> {
    public void push(int i) {
        Node <T> head;
        Node<T> tail;
        public void push(T data);
        {
            Node<T>obj2=new Node<>(data);
            if (head==null) {
                head = obj2;
                tail = obj2;
            }
            else {
                obj2.next=head;
                head=obj2;
            }
        }
        public void print() {
            Node<T>temp=head;
            while (temp!= null){
                System.out.print(temp.data +"=>");
                temp=temp.next;
            }
        }
    }}


