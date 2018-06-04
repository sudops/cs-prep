package linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteTest {

  @Test
  public void deletesMiddleNode () {
    Node first = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);
    Node fifth = new Node(5);

    LinkedList ll = new LinkedList(first);

    ll.add(second);
    ll.add(third);
    ll.add(fourth);
    ll.add(fifth);

    assertEquals(5, ll.size());

    ll.delete(fourth);

    assertEquals(4, ll.size());

    assertTrue(ll.equalsByData(1, 2, 3, 5));
  }
}
