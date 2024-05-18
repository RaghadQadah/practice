public class listNode {
  int val;
  listNode next;

  listNode() {}

  listNode(int val) {
    this.val = val;
  }

  listNode(int val, listNode next) {
    this.val = val;
    this.next = next;
  }
}
