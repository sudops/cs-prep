package linkedlist;

import lombok.Data;

@Data
public class LinkedList {
  private Node head;

  public LinkedList() {
  }

  public LinkedList(Node n) {
    head = n;
  }

  public LinkedList(int ... a) {
    for(int i: a) {
      add(i);
    }
  }

  public void add(Node n) {
    if(head == null) head = n;
    else {
      Node current = head;
      while(current.getNext() != null) current = current.getNext();
      current.setNext(n);
    }
  }

  public void add(int a) {
    if(head == null) head = new Node(a);
    else {
      Node current = head;
      while(current.getNext() != null) current = current.getNext();
      current.setNext(new Node(a));
    }
  }

  public int size() {
    if(head == null) return 0;
    int size = 1;
    Node current = head;
    for(;current.getNext() != null; size ++) current = current.getNext();
    return size;
  }

  public void delete(Node a) {
    if (a == null || a.getNext() == null) return;
    a.setData(a.getNext().getData());
    a.setNext(a.getNext().getNext());
  }

  public boolean equalsByData(int ... data) {
    boolean sizeIsSame = data.length == this.size();
    if (!sizeIsSame) return false;
    Node current = head;
    boolean notEqual = false;
    for(int d : data) {
      if (d != current.getData()) {
        notEqual = true;
        break;
      }
      current = current.getNext();
    }
    return !notEqual;
  }
}
