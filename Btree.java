import java.util.LinkedList;
import java.util.Queue;

public class Btree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
    static class binarytree{
        static int indx=-1;
        public static Node buildtree(int nodes[]){
            indx++;
            if(nodes[indx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[indx]);
            newNode.left=buildtree(nodes); 
            newNode.right=buildtree(nodes);
            return newNode;          
        }   
    }

    ///complixity is 0(n)
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left); 
        // return the curse here
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelorder(Node root){
        if(root ==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    //time complexity is0(n) 
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes=countNodes(root.left);
        int rightNodes=countNodes(root.right);
        return leftNodes+rightNodes+1;
    }

    public static int sumnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes=sumnodes(root.left);
        int rightNodes=sumnodes(root.right);

        return leftNodes+rightNodes+root.data;
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        int myheight=Math.max(leftheight,rightheight)+1;
        return myheight;
    }

    //time complex is 0(n^2)    
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=height(root.left)+height(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }

    static class Treeinfo{
        int ht;
        int diam;

        Treeinfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    //time complexity 0(n);
    public static Treeinfo diameter2(Node root){
        if(root==null){
            return new Treeinfo(0, 0);
        }
        Treeinfo left=diameter2(root.left);
        Treeinfo right=diameter2(root.right);

        int myheight=Math.max(left.ht,right.ht)+1;
        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht+1;

        int mydiam=Math.max(Math.max(diam1,diam2),diam3);

        Treeinfo myinfo=new Treeinfo(myheight, mydiam);
        return myinfo;
    }
    public static void main(String[] args) {
	    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		binarytree tree=new binarytree();
		Node root=tree.buildtree(nodes);
        System.out.println(diameter2(root).diam);

	}
}