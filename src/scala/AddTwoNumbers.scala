/**
 * Definition for singly-linked list.
 */
class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}


object Solution {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {

    var result:ListNode = new ListNode((l1.x + l2.x)%10);
    var extraOne = (l1.x + l2.x)/10;
    var nextL1 = l1.next;
    var nextL2 = l2.next;
    var prevNode = result;
    while(nextL1 != null || nextL2 != null || extraOne != 0) {
      val nextVal = (if ( nextL1 != null) nextL1.x else 0) + (if ( nextL2 != null) nextL2.x else 0) + extraOne;
      val nextNode = new ListNode(nextVal%10);
      extraOne = nextVal/10;
      prevNode.next = nextNode;
      nextL1 = if ( nextL1 != null) nextL1.next else null;
      nextL2 = if ( nextL2 != null) nextL2.next else null;
      prevNode  =  nextNode;
    }
    result;
  }
  def main(args: Array[String]): Unit = {
    /**
    [2,4,3]
    [5,6,4]
    */
    val l1Test  = new ListNode(2,new ListNode(4, new ListNode(3)))
    val l2Test  = new ListNode(5,new ListNode(6, new ListNode(4)))
    addTwoNumbers(l1Test, l2Test);
  }
}