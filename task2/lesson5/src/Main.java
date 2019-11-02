public class Main {

    public static void main(String[] args) {
        int a = 6;
        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(--a);
        System.out.println(a);

        int b = 10;
        int res = (a++ - a-- + ++b) * (++a - --b);
        System.out.println(res);
    }
}
