public class Main {

    public static void main(String[] args) {
        label: for(int i = 0; i < 100; i++){
            for(int j = 0; j <100; j++){
                if(j > 5) continue label;
                System.out.println("aaa");
            }
        }
    }
}
