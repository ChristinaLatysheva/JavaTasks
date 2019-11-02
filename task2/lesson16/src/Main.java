public class Main {

    public static void main(String[] args) {
	    int [][]mas = new int[5][];
	    for(int i = 0; i < mas.length; i++){
	        mas[i] = new int[i + 1];
	        for(int j = 0; j<mas[i].length; j++){
	            mas[i][j] = 1;
	            System.out.print(mas[i][j] + "   ");
            }
	        System.out.println();

        }
    }
}
