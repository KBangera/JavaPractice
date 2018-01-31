/**
 * Created by yogendra on 20-12-2017.
 */
public class MainCircularQueueArray {


    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayCircularQueue queue=new ArrayCircularQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
       // queue.remove();
        queue.add(marySmith);
      //  queue.remove();
        queue.add(mikeWilson);
      //  queue.remove();
        queue.add(billEnd);
       // queue.remove();
       // queue.add(janeJones);

        queue.printQueue();

        queue.remove();
        queue.remove();
        queue.printQueue();

        System.out.println(queue.peek());
    }
}
