package dsa;
import util.Common.Utility;
import dsa.SampleTree.TreeDefinition;

public class DSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = TreeDefinition.getSampleTree();	
		printBst(root);
	}
	
	private static void printBst(Node root) {
		// TODO Auto-generated method stub
		if(!Utility.isNotNull(root)) {
			return;
		}
		Utility.Print(root.getData());
		printBst(root.getLeft());
		printBst(root.getRight());
	}

}
