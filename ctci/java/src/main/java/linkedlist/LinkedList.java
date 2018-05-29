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

  public void add(Node n) {
    if(head == null) head = n;
    else {
      Node current = head;
      while(current.getNext() != null) current = current.getNext();
      current.setNext(n);
    }
  }
}
