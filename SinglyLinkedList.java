package lab03_duyanhng_haluu;

import java.util.Stack;


// 3-1
// a)

// The class SinglyLinkedList is erroneous and cannot be compiled 
// because the class should implement the interface HTWList 
// but the methods "remove(int idx)" and "isEmpty()" are not implemented in here.

public class SinglyLinkedList<E> implements HTWList<E>{
    private SinglyLinkedNode<E> head = null;

    // add element to the start of the list
    public void addFirst(E o) {
        SinglyLinkedNode<E> node = new SinglyLinkedNode<>();
        node.value = o;
        node.next = head;
        head = node;
    }

    public E valueOfHead() {
        return head.value;
    }

    public void add(E o) {
        SinglyLinkedNode<E> node = new SinglyLinkedNode<>();
        node.value = o;
        if (head == null) {
            head = node;
            return;
        }
        SinglyLinkedNode<E> cursor = head;
        while (cursor.next != null) {
            cursor = cursor.next;
        }
        cursor.next = node;
    }

// b)
    @Override
    public void remove(int idx){
        if(idx < 0 || idx >= this.size()){
            throw new IndexOutOfBoundException();
        }
        if(idx == 0){
            head = head.next;
            return;
        }
        int counter = 0;
        SinglyLinkedNode<E> cursor = head;
        while (counter < idx-1) {
            counter ++;
            cursor = cursor.next;
        }
        cursor.next = cursor.next.next; // skips the next Node
    }

    public int size() {
        int c = 0;
        SinglyLinkedNode<E> cursor = head;
        while (cursor != null) {
            c++;
            cursor = cursor.next;
        }
        return c;
    }

// b) 
    @Override
    public boolean isEmpty(){
        return this.head == null;
    }

    public E get(int i) {
        SinglyLinkedNode<E> cursor = head;
        int c = 0;
        while (c < i) {
            c++;
            cursor = cursor.next;
        }
        return cursor.value;
    }

    public int indexOf(Object obj) {
        int c = 0;
        SinglyLinkedNode<E> cursor = head;
        while (cursor != null) {
            if (cursor.value.equals(obj)) {
                return c;
            }
            c++;
            cursor = cursor.next;
        }
        return -1;
    }

// c)
    public void removeFirst(){
        remove(idx:0);
    }

// c)
    public void removeLast(){
        if(this.head == null){
            throw new IndexOutOfBoundsException();
        }
        if(head.next == null){
            head = null;
            return;
        }
        SinglyLinkedNode<E> cursor = head;
        while(cursor!=null){
            cursor = cursor.next;
        }
        cursor.next = null;
    }

// c)
    @Override
    public void clear(){
        this.head == null;
    }

// c)
    public String toString(){
        String res = "";
        SinglyLinkedNode<E> cursor = head;
        while (cursor != null) {
            res = res + cursor.value.toString() + ", ";
            cursor = cursor.next;
        }
        if(res.length > 0){
            res = res.substring(beginIndex:0, res.length()-1);
        }
        return res;
    }

    public SinglyLinkedList<E> reverse(){
        Stack<E> stack = new Stack<>();
        SinglyLinkedList<E> cursor = head;
        while(cursor!=null){
            stack.push(cursor.value);
            cursor = cursor.next;
        }
        SinglyLinkedList<E> res = new SinglyLinkedList<>();
        while(!stack.isEmpty()){
            E value = stack.pop();
            res.add(value);
        }
        return res;
    }
    //time complexity : O(n)
    //-> stack = O(n) & result list = O(n) -> O(2n) = O(n)

    public SinglyLinkedList<E> tail() {
        if (head == null) {
            throw new EmptyListException();
        }
        SinglyLinkedList<E> newList = new SinglyLinkedList<>();
        newList.head = head.next;
        return newList;
    }


}
