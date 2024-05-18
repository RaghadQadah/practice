public class mergeTwoSortedList {
  public static void main(String[] args) {
    ListNode1 list1 = new ListNode1(1, new ListNode1(2, new ListNode1(4, null)));
    ListNode1 list2 = new ListNode1(1, new ListNode1(3, new ListNode1(4, null)));
    mergeTwoSortedLists(list1, list2);
  }

  private static ListNode1 mergeTwoSortedLists(ListNode1 list1, ListNode1 list2) {
    ListNode1 node = new ListNode1();
    ListNode1 tail = node;
    while (true) {

      if (list1 == null) {
        tail.next = list2;
        break;
      }
      if (list2 == null) {
        tail.next = list1;
        break;
      }

      if (list1.val < list2.val) {
        tail.next = list1;
        list1 = list1.next;
      } else {
        tail.next = list2;
        list2 = list2.next;
      }
      tail = tail.next;
    }
    return node.next;
  }
}

class ListNode1 {
  int val;
  ListNode1 next;

  ListNode1() {}

  ListNode1(int val) {
    this.val = val;
  }

  ListNode1(int val, ListNode1 next) {
    this.val = val;
    this.next = next;
  }
}
