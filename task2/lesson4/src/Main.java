public class Main {

    public static void main(String[] args) {
	    String s1 = "45";
	    String s2 = "56";
	    String res = s1 + s2;

	    int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int resInt = a + b;

        System.out.println(resInt);

        String r = String.valueOf(resInt);

        System.out.println(r);

        int i1 = 10;
        int i2 = 3;

        double doubRes = (double) i1 / i2;
        System.out.println(doubRes);
    }
}
