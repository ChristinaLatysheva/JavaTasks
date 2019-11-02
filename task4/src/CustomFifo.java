import java.util.ArrayDeque;
import java.util.Arrays;

class CustomFifo {
    private ArrayDeque buffer;

    CustomFifo(){
        this.buffer = new ArrayDeque(8);
    }

    void fifo(int i){
        if(this.buffer.size()==8) {
            this.buffer.pop();
        }

        this.buffer.addLast(i);

        int[] localQueue = getQueue();
        printArray(localQueue);
        Arrays.sort(localQueue);
        System.out.print(" -> ");
        printArray(localQueue);
        System.out.println(" -> " + getMedian());
    }

    private void printArray(int[] array){
        for(Object item: array){
            System.out.print(item);
        }
    }

    private int[] getQueue(){
        int[] queue = new int[this.buffer.size()];
        int i=0;
        for(Object item: this.buffer){
            queue[i] = (int)item;
            i++;
        }
        return queue;
    }

    private double getMedian(){
        double median;
        int[] localQueue = getQueue();
        int size = localQueue.length;
        Arrays.sort(localQueue);
        if(size % 2 == 0){
            median = ((double)localQueue[size / 2] + localQueue[size / 2 - 1]) / 2;
        } else{
            median = localQueue[size / 2];
        }
        return median;
    }
}
