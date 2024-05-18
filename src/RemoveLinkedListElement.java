public class RemoveLinkedListElement {
  public static void main(String[] args) {

    listNode head = new listNode(7, new listNode(7, new listNode(7, new listNode(7, null))));
    int val = 7;

    if (head != null && head.val == val) head = head.next;

    listNode temp = head;

    while (temp != null && temp.next != null) {

      if (temp.val == val) {
        temp = temp.next;
      }
      if (temp.next.val == val) {
        temp.next = temp.next.next;
      }
      temp = temp.next;
    }

    System.out.println(head);
    //         return head;
  }
}
