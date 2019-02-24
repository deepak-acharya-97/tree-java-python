package dsa;

public class DSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(50, new Node(30), new Node(70));
		root.getLeft().setLeftRight(new Node(20), new Node(40));
		root.getRight().setLeftRight(new Node(60), new Node(80));	
		printBst(root);
	}
	
	public static <T> void Print(T message) {
		System.out.println(message);
	}
	
	public static <T> boolean isNotNull(T obj) {
		return (obj != null);
	}

	private static void printBst(Node root) {
		// TODO Auto-generated method stub
		if(!isNotNull(root)) {
			return;
		}
		Print(root.getData());
		printBst(root.getLeft());
		printBst(root.getRight());
	}

}
