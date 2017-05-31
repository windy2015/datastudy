package com.liuxch.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/***
 *        A
 *     B      C
 *  D    E  F   G   
 * @author landingbj
 *
 */
public class TestTree {
	
	public static void main(String[] args){
		
		TreeNode nodeD = new TreeNode('D');
		TreeNode nodeE = new TreeNode('E');
		
		List<TreeNode> nodeListB = new ArrayList<TreeNode>();
		nodeListB.add(nodeD);
		nodeListB.add(nodeE);
		
		TreeNode nodeB = new TreeNode('B');
		nodeB.setNodes(nodeListB);
		
		TreeNode nodeF = new TreeNode('F');
		TreeNode nodeG = new TreeNode('G');
		
		List<TreeNode> nodeListC = new ArrayList<TreeNode>();
		nodeListC.add(nodeF);
		nodeListC.add(nodeG);
		
		TreeNode nodeC = new TreeNode('C');
		nodeC.setNodes(nodeListC);
		
		List<TreeNode> nodeListA = new ArrayList<TreeNode>();
		nodeListA.add(nodeB);
		nodeListA.add(nodeC);
		
		TreeNode root = new TreeNode('A');
		root.setNodes(nodeListA);
		
		MutiTree tree = new MutiTree(root);
		//List<TreeNode> dpaths =new ArrayList<TreeNode>();
		//tree.findDPath(root, nodeG ,dpaths);
		//tree.printPaths(dpaths);
		
		List<TreeNode> des = new ArrayList<TreeNode>();
		//des.add(nodeD);
		//des.add(nodeG);
		//TreeNode parent = tree.findParent(des);
		//System.out.println(parent.getValue());
		Set<TreeNode> paths = tree.findPaths(nodeD, nodeG);
		Iterator<TreeNode> iterator = paths.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().getValue());
		}
		
		 
		
	}

}
