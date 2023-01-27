public class Main {
    public static void main(String[] args) {

        Employee RizkyAkmal = new Employee("Rizky", "Akmal", 1);
        Employee OpikSlebew = new Employee("Opik", "Slebew", 2);
        Employee ReppyGimang = new Employee("Reppy", "Gimang", 3);
        Employee DidhanDidnot = new Employee("Didhan", "Didnot", 4);
        Employee RadianArmor = new Employee("Radian", "Armor", 5);

        ArrayQueue queue = new ArrayQueue(10);

        queue.enqueue(RizkyAkmal);
        queue.enqueue(OpikSlebew);
        queue.enqueue(ReppyGimang);
        queue.enqueue(DidhanDidnot);
        queue.enqueue(RadianArmor);

        System.out.println("\n");
        System.out.println("Show All Queue :");
        queue.printQueue();

        System.out.println("\n");
        System.out.println("After Deletion Queue :");
        queue.dequeue();
        queue.printQueue();

        System.out.println("\n");
        System.out.println("Insert Rear Queue :");
        queue.printQueue();
        System.out.println(queue.peekRear());
        System.out.println("\n");
    }
}