package com.liuxch.tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/***
 * 多叉树数据结构
 * 
 * @author landingbj
 * 
 */
public class MutiTree {

	// 多叉树根节点
	private TreeNode root;

	private List<TreeNode> paths = new ArrayList<TreeNode>();

	public MutiTree(TreeNode root) {
		this.root = root;
	}

	public void printPaths(List<TreeNode> paths) {
		System.out.println("----------------path start------------------");
		for (int i = paths.size() - 1; i >= 0; i--) {
			System.out.print(paths.get(i).getValue() + "->");
		}
		System.out.println("\n--------------path   end------------------");
	}

	/***
	 * B是A的直接子节点寻找路径 先把最近共同的父节点找出来，然后将路径一分为二,分别遍历
	 * 
	 * @param nodeA
	 * @param nodeB
	 * @param paths
	 */
	public void findAndPath(TreeNode nodeA, TreeNode nodeB, List<TreeNode> paths) {
		List<TreeNode> nodes = nodeA.getNodes();
		if (nodes == null) {
			return;
		} else if (nodes.contains(nodeB)) {
			paths.add(nodeB);
		} else {
			int childnum = nodes.size();
			for (int i = 0; i < childnum; i++) {
				TreeNode newnode = nodes.get(i);
				findDPath(newnode, nodeB, paths);
			}

		}
		List<TreeNode> allnodes = new ArrayList<TreeNode>();
		getAllChilds(nodeA, allnodes);
		if (allnodes.contains(nodeB)) {
			paths.add(nodeA);
		}

	}

	/**
	 * A B是并列节点,有共同的父节点
	 * 
	 * @param nodeA
	 * @param nodeB
	 * @param paths
	 */
	public void findDPath(TreeNode nodeA, TreeNode nodeB, List<TreeNode> paths) {
		List<TreeNode> nodes = nodeA.getNodes();
		if (nodes == null) {
			return;
		} else if (nodes.contains(nodeB)) {
			paths.add(nodeB);
		} else {
			int childnum = nodes.size();
			for (int i = 0; i < childnum; i++) {
				TreeNode newnode = nodes.get(i);
				findDPath(newnode, nodeB, paths);
			}

		}
		List<TreeNode> allnodes = new ArrayList<TreeNode>();
		getAllChilds(nodeA, allnodes);
		if (allnodes.contains(nodeB)) {
			paths.add(nodeA);
		}

	}

	/**
	 * 某个节点下的所有子节点（包括间接子节点,包括自己）
	 * 
	 * @param node
	 */
	public void getAllChilds(TreeNode node, List<TreeNode> paths) {
		List<TreeNode> nodes = node.getNodes();

		if (nodes == null) {
			paths.add(node);
			return;
		} else {
			int childNumber = nodes.size();
			for (int i = 0; i < childNumber; i++) {
				TreeNode treeNode = nodes.get(i);
				getAllChilds(treeNode, paths);
			}
		}
		paths.add(node);
	}

	/***
	 * 查找共同父节点
	 * 
	 * @param parent
	 */
	public TreeNode findParent(List<TreeNode> des) {
		List<List<TreeNode>> nodelist = new ArrayList<List<TreeNode>>();
		List<TreeNode> nodes = new ArrayList<TreeNode>();
		getAllChilds(root, nodes);
		int num = nodes.size();		
		for (int i = 0; i < num; i++) {
			TreeNode newNode = nodes.get(i);
			List<TreeNode> childs = new ArrayList<TreeNode>();
			getAllChilds(newNode, childs);
			if (childs.containsAll(des)) {
				nodelist.add(childs);				
			}
		}

		int index = -1;
		return nodes.get(index);
	}

}
