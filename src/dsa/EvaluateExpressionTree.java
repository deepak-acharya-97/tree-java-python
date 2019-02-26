package dsa;

import util.Common.Utility;

public class EvaluateExpressionTree {
	public double evaluateExpressionTree(NodeChar root) {
		if(Utility.isNull(root)) return 0;
		if(Utility.isNull(root.getLeft()) && Utility.isNull(root.getRight())) {
			return (double)root.getValue();
		}
		double leftSum=evaluateExpressionTree(root.getLeft());
		double rightSum=evaluateExpressionTree(root.getRight());
		return calculate(leftSum, root.getValue(), rightSum);
	}

	private double calculate(double leftSum, char value, double rightSum) {
		// TODO Auto-generated method stub
		switch(value) {
		case '+': return leftSum+rightSum;
		case '-': return leftSum-rightSum;
		case '*': return leftSum*rightSum;
		case '/': return leftSum/rightSum;
		default: return 0;
		}
	}
}
