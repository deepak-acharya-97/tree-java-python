package dsa;

public class SampleTree {
	public static class TreeDefinition {
		public static Node getSampleTree() {
			Node root=new Node(50, new Node(30), new Node(70));
			root.getLeft().setLeftRight(new Node(20), new Node(40));
			root.getRight().setLeftRight(new Node(60), new Node(80));
			return root;
		}
		
		public static Node getSampleContinuousTree() {
			Node root=new Node(3, new Node(2),new Node(4));
			root.getLeft().setLeftRight(new Node(1), new Node(3));
			root.getRight().setRight(new Node(5));
			return root;
		}
	}
}
