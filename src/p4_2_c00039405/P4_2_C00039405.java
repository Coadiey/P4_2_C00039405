// Your Name: Coadiey Bryan
// Your ID: C00039405
// CMPS 261
// Programming Project: #4
// Due Date : 9/20/18 23:00 CST
// Program Description: Modifying classes that implement stacks and queues
// and making classes that implemenet stacks and queues
// Certificate of Authenticity:
// I certify that the code in the method functions including method function main of this project are entirely my own work.
package p4_2_c00039405;

import listapi.*;

/**
 *
 * @author cxb02
 */
public class P4_2_C00039405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        listapi.GenericQueue<Integer> queue = new listapi.GenericQueue<>();
        queue.enqueue(5);
        System.out.println(queue.toString());
        queue.enqueue(10);
        System.out.println(queue.toString());
        queue.enqueue(15);
        System.out.println(queue.toString());
        queue.enqueue(20);
        System.out.println(queue.toString());
        queue.enqueue(25);
        System.out.println(queue.toString());
        listapi.GenericStack<Integer> stack = new listapi.GenericStack<>();
        stack.push(queue.dequeue());
        System.out.println(stack.toString() + " " + queue.toString());
        stack.push(queue.dequeue());
        System.out.println(stack.toString() + " " + queue.toString());
        stack.push(queue.dequeue());
        System.out.println(stack.toString() + " " + queue.toString());
        stack.push(queue.dequeue());
        System.out.println(stack.toString() + " " + queue.toString());
        stack.push(queue.dequeue());
        System.out.println(stack.toString() + " " + queue.toString());
        listapi.MyArrayList<Integer> arrayList = new listapi.MyArrayList<>();
        arrayList.add(stack.pop());
        System.out.println("ArrayList: " + arrayList.toString() + " " + stack.toString());
        arrayList.add(stack.pop());
        System.out.println("ArrayList: " + arrayList.toString() + " " + stack.toString());
        arrayList.add(stack.pop());
        System.out.println("ArrayList: " + arrayList.toString() + " " + stack.toString());
        arrayList.add(stack.pop());
        System.out.println("ArrayList: " + arrayList.toString() + " " + stack.toString());
        arrayList.add(stack.pop());
        System.out.println("ArrayList: " + arrayList.toString() + " " + stack.toString());
    }

}
