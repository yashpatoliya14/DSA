class Tree {
    int val;
    Tree left = null;
    Tree right = null;
    int height = 1;

    Tree(int val) {
        this.val = val;
    }
}

public class AVL {
    static int height(Tree n) {
        return n == null ? 0 : n.height;
    }

    public static Tree insert(Tree node, int val) {
        if (node == null) {
            return new Tree(val);
        }

        if (node.val > val) {
            node.left = insert(node.left, val);
        } else {
            node.right = insert(node.right, val);
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = height(node.left) - height(node.right);

        if (balance < -1 && val > node.right.val) {
            return leftRotate(node);
        }
        if (balance > 1 && val < node.left.val) {
            return rightRotate(node);
        }

        if (balance < -1 && val < node.right.val) {
            return rightLeftRotate(node);
        }
        if (balance > 1 && val > node.left.val) {
            return leftRightRotate(node);
        }

        return node;
    }

    public static Tree leftRotate(Tree node) {
        Tree x = node.right;
        node.right = x.left;
        x.left = node;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x;

    }

    public static Tree rightRotate(Tree node) {
        Tree x = node.left;
        node.left = x.right;
        x.right = node;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x;

    }

    public static Tree rightLeftRotate(Tree node) {
        node.right = rightRotate(node.right);
        return leftRotate(node);
    }

    public static Tree leftRightRotate(Tree node) {
        node.left = leftRotate(node.left);
        return rightRotate(node);
    }

    public static void main(String[] args) {
        Tree root = null;
        Tree head = new Tree(-10);
        head.right = new Tree(-3);
        head.right.right = new Tree(0);
        head.right.right.right = new Tree(5);
        head.right.right.right.right = new Tree(9);

        while (head != null) {
            root = insert(root, head.val);
            head = head.right;
        }

        printTree(root, "", false);
        
        inorder(root);
    }

    static void inorder(Tree root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
   static void printTree(Tree root, String prefix, boolean isLeft) {
    if (root == null) return;

    System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.val);

    printTree(root.left, prefix + (isLeft ? "│   " : "    "), true);
    printTree(root.right, prefix + (isLeft ? "│   " : "    "), false);
}
}