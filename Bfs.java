package Trees;
//Breadth first search algorithm using queues
//time complexity=O(n) :n=number of nodes
//Space complexity=O(n)
import java.util.*;
class Node{
	int key;
	Node left,right;
	
      Node(int value){
		key=value;
		left=right=null;
	}
}

public class Bfs {
	Node root;
	
	void printlevelorder() {
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp= q.poll();
			System.out.print(temp.key +" ");
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
	}
	
	public static void main(String[] args) {
	Bfs tree=new Bfs();
	tree.root=new Node(1);
	tree.root.left=new Node(2);
	tree.root.right=new Node(3);
	tree.root.left.left=new Node(4);
	tree.root.left.right=new Node(5);
	tree.root.right.left = new Node(6);
	tree.root.right.right = new Node(7);
    tree.root.left.left.left = new Node(8);
	tree.root.left.right.left = new Node(9);
	System.out.println("Level order (bfs) traversal of binary tree is:-");
	tree.printlevelorder();
}
}
