package dsa;
import util.Common.Utility;
import dsa.SampleTree.TreeDefinition;

public class DSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Node root = TreeDefinition.getSampleTree(); printBst(root); ContinuosTree
		 * continuosTree=new ContinuosTree(); boolean result =
		 * continuosTree.isContinuos(TreeDefinition.getSampleContinuousTree());
		 * result=continuosTree.isContinuos(root); Utility.Print(result);
		 */
		//Utility.Print(new FoldableBinaryTree().isFoldable(TreeDefinition.getSampleNonFoldableTree()));
		char[] postfixCharArray = "ab+ef*g*-".toCharArray();
		printBst(new GenerateExpressionTree().generateExpressionTree(postfixCharArray));
	}
	
	private static void printBst(Node root) {
		// TODO Auto-generated method stub
		if(!Utility.isNotNull(root)) {
			return;
		}
		printBst(root.getLeft());
		Utility.Print(root.getData());
		printBst(root.getRight());
	}
	
	private static void printBst(NodeChar root) {
		// TODO Auto-generated method stub
		if(!Utility.isNotNull(root)) {
			return;
		}
		printBst(root.getLeft());
		Utility.Print(root.getValue());
		printBst(root.getRight());
	}
}
