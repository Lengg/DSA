//ArrayQueueDSA.java
//Author name: Lenny Llamado
//Course: BSIS - II
//Github URL: https://github.com/Lengg
//Date: August 24, 2016 

package arrayqueuedsa;

public class ArrayQueueDSA {

    
   private int QSIZE;
    private int[] queue;
    private int nItems;
    
    public ArrayQueueDSA(int size){
        QSIZE = size;
        queue = new int[QSIZE];
    }

    public void showQueue(){
        int i;
        for(i = 0; i < QSIZE; i++){
            System.out.printf("Queue[%d] = %d\n", i, queue[i]);
        }   
    }

    private boolean isEmpty(){
        if(nItems == 0){
        System.out.println("Queue is Empty");
        
        return true;
        
        } else {
            
        return false;
        }
    }

    private boolean isFull(){
        if(nItems == QSIZE){
            System.out.println("Queue is Full");
            return true;
        } else {
            
        return false;
        }
    }

    public boolean enqueue(int num){
        System.out.println();
        System.out.print("Trying to enqueue " + "[" + num + "]" +"... ");
        if(!isFull()){
            queue[nItems] = num;
            
            System.out.println("'" + num + "'" + " was succesfully added.");
            nItems++;
            System.out.println();
            return true;
            
        } else {
            System.out.println("Failed to enqueue " + num);
            System.out.println();
            return false;
        }}
            public void dequeue(){
            System.out.println();
            System.out.print("Dequeuing... ");
            
        if(! isEmpty()){
            int num = queue[0];
            System.out.println("'" + num + "'" + " was succesfully removed.");
            rearrangeQueue();
            System.out.println();
        } else {
            System.out.println("Failed to dequeue");
        }
    }

    private void rearrangeQueue(){
    
        System.out.println("Rearranging Queue");
        int[] temp = new int[nItems];
        int i;
        for(i = 0; i < (nItems - 1); i++){
            temp[i] = queue[i + 1];
        }
        nItems--;
        for(i = 0; i < QSIZE; i++){
            if(i <= nItems){
            queue[i] = temp[i];
        } else {
            queue[i] = 0;
            }
        }
    }
     public int peekFront(){
        return queue[0];
    } 

    public int peekRear(){
        return queue[nItems];
    }

    public static void main(String[] args) {
        ArrayQueueDSA queue = new ArrayQueueDSA(10);
        queue.enqueue(1);
        queue.showQueue();
        queue.enqueue(2);
        queue.showQueue();
        queue.enqueue(3);
        queue.showQueue();
        queue.enqueue(4);
        queue.showQueue();
        queue.enqueue(5);
        queue.showQueue();
        queue.enqueue(6);
        queue.showQueue();
        queue.enqueue(7);
        queue.showQueue();
        queue.enqueue(8);
        queue.showQueue();
        queue.enqueue(9);
        queue.showQueue();
        queue.enqueue(10);
        queue.showQueue();
        queue.dequeue();
        queue.showQueue();
        queue.dequeue();
        queue.showQueue();
        //queue.peekFront();
        //queue.peekRear();
       
    }
}  

