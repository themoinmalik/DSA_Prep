package src.tree;

public class HeightBT {


    public static void main(String[] args) {
    
        // int[] root = [3,9,20,null,null,15,7];

    }


    public static int heightBt(Node root) {

        // base condition... 
        if (root == null) {
            return 0;
        }

        // hypothesis... 
        int lh = heightBt(root.leftNode);
        int rh = heightBt(root.rightNode);

        // retrun ... 

        return 1 + Math.max(lh, rh);
        
    }
    
}
