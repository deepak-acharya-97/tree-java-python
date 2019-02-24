package dsa;
import util.Common.Utility;
public class ContinuosTree {
	private boolean isNumbersContinous(Node prev, Node curr) {
		return Math.abs(prev.getData() - curr.getData()) == 1;
	}
	public boolean isContinuos(Node root) {
		if(Utility.isNull(root)) return true;
		if(Utility.isNull(root.getLeft()) && Utility.isNull(root.getRight())) return true;
		if(Utility.isNull(root.getLeft())) {
			return isNumbersContinous(root, root.getRight()) && isContinuos(root.getRight());
		}
		if(Utility.isNull(root.getRight())) {
			return isNumbersContinous(root, root.getLeft()) && isContinuos(root.getLeft());
		}
		return isNumbersContinous(root, root.getLeft()) && isNumbersContinous(root, root.getRight()) && isContinuos(root.getLeft()) && isContinuos(root.getRight()); 
	}
}
