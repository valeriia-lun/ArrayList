public class Main {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        System.out.println(list.isEmpty());

        for (int i = 1; i <= 10; i++) {
            list.put(i);
        }

        list.print();
        System.out.println("======================================");

        list.isEmpty();

        list.remove(4);
        try {
            list.remove(29);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        list.print();
        System.out.println("======================================");

        System.out.println(list.contains(8));
        System.out.println(list.contains(25));

        list.put(15);
        list.put(20);

        list.print();
        System.out.println("======================================");

        for (int i = 30; i < 35; i++) {
            list.put(i);
        }
        list.print();
        System.out.println("======================================");

        System.out.println("Число по индексу 5 = " + list.get(5));

        list.clear();
        System.out.println(list.isEmpty());

    }
}