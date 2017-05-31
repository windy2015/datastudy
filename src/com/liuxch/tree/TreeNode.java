package com.liuxch.tree;

import java.util.List;

/***
 * 多叉树的节点
 * @author landingbj
 *
 */
public class TreeNode {
	
	//节点的值
	private Object value;
	
	//子节点集合
	private List<TreeNode> nodes;
	
	//构造函数
	public TreeNode(Object value, List<TreeNode> nodes){
	     this.value = value;
	     this.nodes = nodes;	     
	}
	
	public TreeNode(Object value){
		this(value,null);
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public List<TreeNode> getNodes() {
		return nodes;
	}

	public void setNodes(List<TreeNode> nodes) {
		this.nodes = nodes;
	}
	
	/***
	 * 判断节点是否是叶子节点
	 * @param node
	 * @return
	 */
	public boolean isLeafNode(TreeNode node){
		boolean isLeaf = false;
		if(node.getNodes() ==  null || node.getNodes().isEmpty()){
			isLeaf = true;
		}
		return isLeaf;
	}

}
