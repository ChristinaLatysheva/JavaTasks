public class Main {

    public static void main(String[] args) {
        int [][][]mas = new int[10][10][10];
        int sum = 0;
        for(int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for(int k = 0; k < mas[i][j].length; k++){
                    mas[i][j][k] = i + j + k;
                    sum += mas[i][j][k];
                }
            }
        }
    }

}
