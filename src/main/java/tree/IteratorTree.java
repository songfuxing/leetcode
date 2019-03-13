package tree;

/**
 * Created by songfuxing on 2019/1/7.
 */
public class IteratorTree {

    /**
     * 前序遍历；根-左-右
     * @param node
     */
    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 中序遍历: 左-根-右
     * @param node
     */
    public void midOrder(TreeNode node){
        if (node == null) {
            return;
        }
        midOrder(node.left);
        System.out.println(node.value);
        midOrder(node.right);
    }

    /**
     * 后序遍历：左-右-根
     * @param node
     */
    public void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        inOrder(node.right);
        System.out.println(node.value);
    }

}
