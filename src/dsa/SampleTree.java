package dsa;

public class SampleTree {
	public static class TreeDefinition {
		public static Node getSampleTree() {
			Node root=new Node(50, new Node(30), new Node(70));
			root.getLeft().setLeftRight(new Node(20), new Node(40));
			root.getRight().setLeftRight(new Node(60), new Node(80));
			return root;
		}
	}
}
