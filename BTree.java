public class BTree <E>{
    Node<E> root;
    int size;

    public BTree() {
        this.root = null;
        this.size = 0;
    }
    public boolean addByPath(E data, String path){
        Node<E> cur =root;
        if (path.isEmpty()){
            if(root!=null){
                return false;
            }
            this.root=new Node<>(data,null,null);
            size++;
            return true;
        }

        for (int i = 0; i < path.length()-1; i++) {
            if (path.charAt(i)=='R'){
                if(cur.getRightSon()==null){
                    return false;
                }
                cur=cur.getRightSon();
            }
           else if (path.charAt(i)=='L'){
                if(cur.getLeftSon()==null){
                    return false;
                }
                cur=cur.getLeftSon();
            }
        }
        if (path.charAt(path.length()-1)=='R'&&cur.getRightSon()!=null){
                return false;
        }
       else if (path.charAt(path.length()-1)=='L'&&cur.getLeftSon()!=null){
            return false;
        }
       else{
           size++;
            if (path.charAt(path.length()-1)=='R'){
                cur.setRightSon(new Node<>(data,null,null));
                return true;
            }
            else if (path.charAt(path.length()-1)=='L') {
                cur.setLeftSon(new Node<>(data,null,null));
                return true;
            }
        }
     return false;

    }

    public String preOrderS(Node<E> node) {
        if (node == null) {
            return "";
        }
        String cur = node.getData().toString();
        String leftStr = preOrderS(node.getLeftSon());
        String rightStr = preOrderS(node.getRightSon());


        if (!leftStr.isEmpty() && !rightStr.isEmpty()) {
            return cur + " " + leftStr + " " + rightStr;
        } else if (!leftStr.isEmpty()) {
            return cur + " " + leftStr;
        } else if (!rightStr.isEmpty()) {
            return cur + " " + rightStr;
        } else {
            return cur;
        }
    }
    public String pre (){

    return preOrderS(root);
        
    }

    public int getSize() {
        return size;
    }
    public E findByPath(String path){
        Node<E> cur =root;
        if (path.isEmpty()){
            return cur.getData();
        }
        for (int i = 0; i < path.length()-1; i++) {
            if (path.charAt(i)=='R'){
                if(cur.getRightSon()==null){
                    return null;
                }
                cur=cur.getRightSon();
            }
            else if (path.charAt(i)=='L'){
                if(cur.getLeftSon()==null){
                    return null;
                }
                cur=cur.getLeftSon();
            }
        }
        if (path.charAt(path.length()-1)=='R'&&cur.getRightSon()!=null){
            return cur.getRightSon().getData();
        }
        else if (path.charAt(path.length()-1)=='L'&&cur.getLeftSon()!=null){
            return cur.getLeftSon().getData();
        }

    return null;
    }


}
