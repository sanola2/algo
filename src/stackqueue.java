import java.util.LinkedList;

public class stackqueue {
    public static void main(String[] args) {
        St stack = new St();

       /* stackqueue.push(3);
        stackqueue.push(4);
        stackqueue.push(5);
        stackqueue.push(6);

        System.out.println(stackqueue.pop());
        System.out.println(stackqueue.pop());
        System.out.println(stackqueue.pop());
        stackqueue.push(10);
        System.out.println(stackqueue.pop());
        System.out.println(stackqueue.pop());*/

       Qu queue = new Qu();
        LinkedList a = new LinkedList();
       queue.add(1);
       queue.add(2);
       queue.add(3);
       queue.add(4);
       queue.add(5);

       System.out.println(queue.poll());
       queue.add(5);
       System.out.println(queue.poll());
       queue.add(6);
       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.poll());

    }

    static class St {
        int[] array = new int[1000];
        int cusor = 0;

        void push(int num) {
            array[cusor++] = num;
        }

        int pop() {
            return array[--cusor];
        }
    }

    static class Qu {
        int max = 5;
        int[] array = new int[max];
        int front = 0;
        int rear = 0;

        void add(int num) {
            if((rear+1)%max == front){
                System.out.println("overflow");
                return;
            }
            array[rear] = num;
            rear = (rear+1)%max;
        }

        int poll() {
            int i;
            if(front == rear) {
                System.out.println("empty");
                return -1;
            }
            i = array[front];
            front = (front+1)%max;
            return i;
        }

    }
}
