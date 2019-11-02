public class Main {

    public static void main(String[] args) {
        int mas[] = new int[10];
        System.out.println(mas.length);
        mas[0] = 5;
        mas[1] = 7;

        System.out.println(mas[0]);

        for(int i = 0; i < mas.length; i++){
            mas[i] = (int) Math.round(Math.random() * 100);
            System.out.println(mas[i]);
        }


        int min = mas[0];

        for(int i = 0; i < mas.length; i++){
            if(mas[i] <  min) min=mas[i];
        }

        System.out.println("min:" + min);

    }
}
