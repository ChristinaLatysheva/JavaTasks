public class Main {

    public static void main(String[] args) {
	    int [][]mas = new int[10][10];
	    int diag = 0;
	    for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int)(Math.round(Math.random()));
                if(i==j){
                    diag += mas[i][j];
                }
                System.out.print((mas[i][j] + "  "));
            }
            System.out.println();
        }
	    System.out.println(diag);
    }
}
