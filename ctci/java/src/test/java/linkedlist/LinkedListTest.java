package linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

  @Test
  public void whenLinkedListIsInitializedWith1Node_setsHead() {
    assertEquals(
      1,
      (new LinkedList(new Node(1))).getHead().getData()
    );
  }

  @Test
  public void whenLinkedListIsInitializedWith1Node_setsNextAsNull() {
    assertNull(
      (new LinkedList(new Node(1))).getHead().getNext()
    );
  }

  @Test
  public void when2NodesInLinkedList_addsNodeToEnd() {
    LinkedList ll = new LinkedList();
    ll.add(new Node(1));
    ll.add(new Node(2));
    assertEquals(
      ll.getHead().getNext().getData(),
      2
    );
  }
}
