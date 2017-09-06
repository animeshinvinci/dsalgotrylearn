package io.algo;

public class StackRecursion {

        public static void main(String[] args) {


            Node n = new Node(3);

            Node n1 = new Node(9);

            n.next = n1;

            Node n2 = new Node(7);

            n.next.next = n2;

            StackRecursion sc =  new StackRecursion();
            sc.printNode(n);

        }

        void printNode(Node n){

            if (n.next != null){
                printNode(n.next);
            }
            System.out.println(" Current NOde  -  " + n.data);


        }
    }



    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }


