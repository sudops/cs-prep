package linkedlist;

import lombok.Data;

@Data
public class Node {
  private int data;
  private Node next;

  public Node(int data) {
    this.data = data;
  }

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }
}
