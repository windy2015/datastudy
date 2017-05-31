package com.liuxch.tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/***
 * 多叉树数据结构
 * 
 * @author landingbj
 * 
 */
public class MutiTree {

	// 多叉树根节点
	private TreeNode root;

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
	
	
	public Set<TreeNode> findPaths(TreeNode nodeA, TreeNode nodeB){
		Set<TreeNode> finalPath = new HashSet<TreeNode>();
		List<TreeNode> nodeAChilds = new ArrayList<TreeNode>();
		List<TreeNode> nodeBChilds = new ArrayList<TreeNode>();
		getAllChilds(nodeA, nodeAChilds);
		getAllChilds(nodeB, nodeBChilds);
		
		if(nodeAChilds.contains(nodeB)){
			List<TreeNode> path1 = new ArrayList<TreeNode>();
			findDPath(nodeA, nodeB, path1);
			finalPath.addAll(path1);
		}else if(nodeBChilds.contains(nodeA)){
			List<TreeNode> path2 = new ArrayList<TreeNode>();
			findDPath(nodeB, nodeA, path2);
			finalPath.addAll(path2);
		}else{
			//List<TreeNode> path3 = new ArrayList<TreeNode>();
			//this.findAndPath(nodeA, nodeB, path3);
			List<TreeNode> des = new ArrayList<TreeNode>();
			des.add(nodeA);
			des.add(nodeB);
			TreeNode parent = findParent(des);
			List<TreeNode> a_parent = new ArrayList<TreeNode>();
			List<TreeNode> parent_b = new ArrayList<TreeNode>();
			this.findDPath(nodeA, parent, a_parent);
			this.findDPath(parent, nodeB, parent_b);
			finalPath.addAll(a_parent);
			finalPath.addAll(parent_b);
		}
		
		return finalPath;
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
	 * A B是父子节点
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
		Map<Integer,Integer> childsMap = new TreeMap<Integer,Integer>(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				//order by desc
				return o1.compareTo(o2);
			}
			
		});
		for (int i = 0; i < num; i++) {
			TreeNode newNode = nodes.get(i);
			List<TreeNode> childs = new ArrayList<TreeNode>();
			getAllChilds(newNode, childs);
			if (childs.containsAll(des)) {
				nodelist.add(childs);
				childsMap.put(i, childs.size());
			}
		}
		Set<Integer> keys = childsMap.keySet();
		Iterator<Integer> it = keys.iterator();
		Integer firstKey = it.next();
		return nodes.get(firstKey);
	}

}
