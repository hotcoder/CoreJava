import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
public class ArrayBlockingQueue1 {
  public static void main(String args[]) {
    ArrayBlockingQueue abq = new ArrayBlockingQueue(10);
    abq.add(1);
    abq.add(2);
    abq.add(3);
    abq.add(4);
    abq.add(5);
    System.out.println("Elements of queue1= " + abq);
    ArrayBlockingQueue abq1 = new ArrayBlockingQueue(10);
    abq1.offer("A");
    abq1.offer("B");
    abq1.offer("C");
    abq1.offer("D");
    abq1.offer("E");
    abq1.offer("F");
    System.out.println("Elements of queue2 = " + abq1);
    int i = abq.drainTo(abq1, 4);
    System.out.println("Now elements of queue2 = " + abq1);
    System.out.println("Elements of queue1= " + abq);
    System.out.println("Rest element of queue1 = " + abq);
    Iterator it = abq1.iterator();
    System.out.println("Elements of queue2 using iterator = ");
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    Object obj = abq1.peek();
    System.out.println("The head element of queue2 = " + obj);
    Object obj1 = abq1.poll();
    System.out.println("Elements of queue2 = " + abq1);
    System.out.println("The removed head element = " + obj1);
    int i1 = abq1.size();
   System.out.println("Size of queue2 = " + i1);
    int i2 = abq.size();
    System.out.println("Size of queue1 = " + i2);
  }
}