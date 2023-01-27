
public class Main {

    public static void main(String[] args) {
        Tree IntTree = new Tree();
        IntTree.insert(17);
        IntTree.insert(88);
        IntTree.insert(76);
        IntTree.insert(44);
        IntTree.insert(62);
        IntTree.insert(25);
        IntTree.insert(86);
        IntTree.insert(77);
        IntTree.insert(8);

        System.out.print("\n");
        System.out.print("Transferse Order :\n");
        IntTree.traverseInOrder();
        System.out.print("\n\n");

        System.out.print("Insert :\n");
        System.out.println(IntTree.get(44));
        System.out.println(IntTree.get(86));

        System.out.print("\n");
        System.out.print("Min Dan Max\n");
        System.out.print("Data Terkecil :");
        System.out.println(IntTree.min());

        System.out.print("Data Terbesar :");
        System.out.println(IntTree.max() + "\n");

        System.out.print("Element size :");
        System.out.println(IntTree.size() + "\n");
    }
}