class TreeNode{
    int key, val;
    TreeNode left,right;

    public TreeNode(int key, int val) {
        this.key = key;
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class TreeMap {
    TreeNode root;

    public TreeMap() {
        root = null;
    }

    public void insert(int key, int val) {
        root = insertNode(root, key, val);
    }
        public TreeNode insertNode(TreeNode node, int key, int val) {
            if(node == null){
                return new TreeNode(key, val);
            }
            if(key<node.key){
                node.left = insertNode(node.left, key, val);            
            }
            else if(key>node.key){
                node.right = insertNode(node.right, key, val);
            }
            else{
                node.val = val;
            }
            return node;
        }
        
    

    public int get(int key) {
        TreeNode curr = root;
        while (curr != null){
            if(key<curr.key){
                curr = curr.left;
            }
            else if(key>curr.key){
                curr = curr.right;
            }else{
                return curr.val;
            }

        }
        return -1;
        }
        

    public int getMin() {
        TreeNode curr = findMin(root);
        return (curr != null) ? curr.val : -1;
        

        }

        private TreeNode findMin(TreeNode node) {
            while(node != null && node.left != null){
                node = node.left;
            }
            return node;
        }
    
    

    public int getMax() {
        TreeNode current = root;
        while (current != null && current.right != null){
            current = current.right;
        }
        return (current != null) ? current.val : -1;
    }

    

    public void remove(int key) {
      root = helperRemove(root, key); 
    }

    public TreeNode helperRemove(TreeNode curr, int key) {
        if(curr == null){
            return null;
        }
        if(key > curr.key){
            curr.right = helperRemove(curr.right, key);
        }
        else if(key < curr.key){
            curr.left = helperRemove(curr.left, key);
        } else {
            if(curr.left == null){
                return curr.right;
            }
            else if(curr.right == null) {
                return curr.left;
            }
            else {
                TreeNode minNode = findMin(curr.right);
                curr.key = minNode.key;
                curr.val = minNode.val;
                curr.right = helperRemove(curr.right, minNode.key);
            }
        }
        return curr;
    }

    public List<Integer> getInorderKeys() {
         List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    private void inorderTraversal(TreeNode root, List<Integer> result) {
        if (root != null) {
            inorderTraversal(root.left, result);
            result.add(root.key);
            inorderTraversal(root.right, result);
        }
    }

}