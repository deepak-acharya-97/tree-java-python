package dsa;

public class NodeChar {
	public NodeChar(char value) {
		super();
		this.value = value;
		this.left=null;
		this.right=null;
	}
	private char value;
	private NodeChar left;
	private NodeChar right;
	/**
	 * @return the value
	 */
	public char getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(char value) {
		this.value = value;
	}
	/**
	 * @return the left
	 */
	public NodeChar getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(NodeChar left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public NodeChar getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(NodeChar right) {
		this.right = right;
	}
}
