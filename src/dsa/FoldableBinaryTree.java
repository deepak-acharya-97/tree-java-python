package dsa;

import util.Common.Utility;

public class FoldableBinaryTree {
	public boolean isFoldable(Node root) {
		if(Utility.isNull(root)) return true;
		if(Utility.isNull(root.getLeft()) && Utility.isNull(root.getRight())) return true;
		if(Utility.isNull(root.getLeft())) {
			return Utility.isNull(root.getRight()) && isFoldable(root.getRight());
		}
		if(Utility.isNull(root.getRight())) {
			return Utility.isNull(root.getLeft()) && isFoldable(root.getLeft());
		}
		return false;
	}
}
