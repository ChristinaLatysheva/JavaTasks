public class Main {

    public static void main(String[] args) {
	    CustomFifo fifo = new CustomFifo();
	    for(int i = 0; i < 100; i++){
	        fifo.fifo((int)(Math.random() * 10));
        }
    }
}
