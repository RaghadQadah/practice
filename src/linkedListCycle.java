import java.util.HashMap;
import java.util.HashSet;

public class linkedListCycle {
  public static void main(String[] args) {

    listNode list1 = new listNode(1, new listNode(2, new listNode(4, null)));
    list1.next.next.next=list1;

    HashSet map = new HashSet();

    listNode temp = new listNode();
    temp.next = list1;

    while (temp != null) {
      if (!map.contains(temp)) {
        map.add(temp);
      } else {
        System.out.println(true);
        return;
      }
      temp = temp.next;
    }
    System.out.println(false);
  }
}
