package fs;

import java.util.ArrayList;

public class pr3 {
    static ArrayList<Integer> answer = new ArrayList();
    public static void main(String[] args) {
        int[] serialization = {3, 5, 6, 8, -1, -1, -1, 1, 7, -1, -1, -1, 4, -1, 2, -1, -1};
      //  int[] serialization = {1, -1, 2, -1, -1, 3, -1, -1};

        //serialization 시작이 -1 일떄 true -1인데 사이즈가 1이 아니면 false 리턴.
        Tree tree = new Tree();

        for(int i=0; i< serialization.length; i++) {
            tree.add(serialization[i]);
        }

        tree.preorder(tree.root);
        System.out.println(answer.size());
        System.out.println(serialization.length);
        if(answer.size() != serialization.length) {
             System.out.println("false");
             return;
        }

        for(int i=0; i< answer.size(); i++) {
            if(serialization[i] != answer.get(i)) {
                System.out.println("false");
                return;
            }
        }
       System.out.println("true");
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node (int data) {
            this.data = data;
        }
    }

    static class Tree {
        Node root;

        public void add (int data) {
            if(root == null) {
                if(data != -1) {
                    root = new Node(data);
                    root.left = new Node(0);
                    root.right = new Node(0);
                }
            } else {
                search(root, data);
            }
        }

        private boolean search(Node root, int data) {
            if(root == null) {
                return false;
            } else if (root.data == 0) {
                root.data = data;
                if(data != -1) {
                    root.left = new Node(0);
                    root.right = new Node(0);
                }
            } else if (root.data == -1) {
                return true;
            } else {
                if(search(root.left, data))
                    return search(root.right, data);
            }
            return false;
        }

        public void preorder(Node root) {
            answer.add(root.data);
            if(root.left != null)
                preorder(root.left);
            if(root.right != null)
                preorder(root.right);
        }
    }
}
