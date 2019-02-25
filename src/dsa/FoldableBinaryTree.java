package dsa;

import util.Common.Utility;

public class FoldableBinaryTree {
	public boolean isFoldable(Node root) {
		if(Utility.isNull(root)) return true;
		if(Utility.isNull(root.getLeft()) && Utility.isNull(root.getRight())) return true;
		if(Utility.isNull(root.getLeft())) {
			System.out.println("Left Null Case");
			return !Utility.isNull(root.getRight());
		}
		else if(Utility.isNull(root.getRight())) {
			System.out.println("Right Null Case");
			return !Utility.isNull(root.getLeft());
		} else {
			System.out.println("Non Null Case");
			boolean left =  isFoldable(root.getLeft()); 
			boolean right =  isFoldable(root.getRight());
			System.out.println(left+" "+right);
			return left && right;
		}
	}
}
