public class reorderList {
  public static void main(String[] args) {

    // listNode list1 = new listNode(1, new listNode(2, null));
    listNode head = new listNode(1, new listNode(2, new listNode(3, new listNode(4, null))));

    listNode slow;
    listNode fast;

    slow = head;
    fast = head.next.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    listNode next = null;
    listNode prev = null;

    while (slow != null) {
      next = slow.next;
      slow.next = prev;
      prev = slow;
      slow = next;
    }

    listNode head2 = prev;
    listNode next2;
    listNode head1 = head;

    while (head2.next != null) {
      next = head1.next;
      next2 = head2.next;

      head1.next = head2;
      head2.next = next;

      head1 = next;
      head2 = next2;
    }

    System.out.println(prev);

  }
}
