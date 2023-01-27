
public class Main {

    public static void main(String[] args) {

        Employee Baim = new Employee("Baim", "Wong", 1);
        Employee Rafi = new Employee("Rafi", "Ahmad", 2);
        Employee Dadadang = new Employee("Dadadang", "Naser", 3);
        Employee Rizky = new Employee("Rizky", "Muhammad", 4);
        Employee Asep = new Employee("Asep", "Saepuloh", 5);

        LinkedStack stack = new LinkedStack();

        stack.push(Baim);
        stack.push(Rafi);
        stack.push(Dadadang);
        stack.push(Rizky);
        stack.push(Asep);

        System.out.println("\n");
        System.out.println("Show After Stack :");
        stack.printStack();

        System.out.println("\n");
        System.out.println("Insert Front After Stack :");
        System.out.println(stack.peek());

        stack.pop();

        System.out.println("\n");
        System.out.println("After Deletion Stack :");
        stack.printStack();
        System.out.println("\n");
    }
}