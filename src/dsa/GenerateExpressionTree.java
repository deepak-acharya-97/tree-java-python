package dsa;

import java.util.Stack;

public class GenerateExpressionTree {
	private boolean isOperator(char operator)
	{
		switch(operator) {
		case '+' :
		case '-' :
		case '*' :
		case '/' :
		case '^' : return true;
		default: return false;
		}
	}
	public NodeChar generateExpressionTree(char[] prefix)
	{
		Stack<NodeChar> stack = new Stack<>();
		char current;
		NodeChar temp, temp1, temp2;
		for(int ind=0; ind<prefix.length; ind++) {
			current=prefix[ind];
			if(!isOperator(current)) {
				stack.push(new NodeChar(current));
			} else {
				temp=new NodeChar(current);
				temp1=stack.pop();
				temp2=stack.pop();
				temp.setLeft(temp2);
				temp.setRight(temp1);
				stack.push(temp);
			}
		}
		NodeChar root=stack.pop();
		return root;
	}
}