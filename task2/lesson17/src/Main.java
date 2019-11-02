public class Main {

    public static void main(String[] args) {
        int []mas = new int[10];
        for (int i = 0; i < mas.length; i++){
            mas[i] = i;
        }
        int sum = 0;
        for(int value: mas){
            sum+=value;
        }

        System.out.println(sum);
    }
}
