package com.starkaku.javabasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class CollectionFunctionUsage {

	/*
	* char[] / int[] / int[][]
	*/
	char[] charArray;
	int[]  intArray;
	int[][] intMatrix;

	public void arrayActions() {
		charArray = new char[]{'a','b','c'};
	    int length = charArray.length;
	    intMatrix = new int[][]{{'a','c'},{'b','d'}};
	    int x = intMatrix.length;
	    int y = intMatrix[0].length;
	    System.out.println("charArray Length = " + length);
	    System.out.println("x = " + x);
	    System.out.println("y = " + y);
	}



	/*
	* String 
	*/
	String string1 = "abcde";
	public void stringActions() {
		int sizeOfString = string1.length();
		System.out.println("Size Of abcde = " + sizeOfString);
	 
	}


	/*
	* ArrayList/ LinkedList
	*/
	LinkedList<String> linkedList;
	ArrayList<String> stringArrayList;
	List<String> stringList;

	public void ListActions() {
	    stringArrayList = new ArrayList<String>(Arrays.asList("abc", "bcd", "dce"));
	    System.out.println("Init ArrayList");
	    for(String s : stringArrayList) {
	        System.out.println(s);
	    }
	    
	    linkedList = new LinkedList<String>();
	    linkedList.add("ABC");
	    linkedList.remove("ABC");
	    
	    System.out.println("LinkedList Size = " + linkedList.size());
	    
	    stringList = new ArrayList<String>();
	    stringList.subList(0, 1);
	    System.out.println("stringList Size = " + stringList.size());
	 
	}

	/*
	* HashMap / HashSet
	*/
	HashMap<Integer, String> hashmap;
	HashSet<String> hashset;
	public void hashActions() {
	    hashmap = new HashMap<Integer, String>();
	    hashmap.put(1, "string1");
	    hashmap.put(2, "string2");
	    String s1 = hashmap.get(1);
	    
	    if(hashmap.containsKey(1)) {
	        System.out.println("hashmap contains string1");
	    }
	    hashmap.remove(2);
	    if(hashmap.containsKey(2)) {
	        System.out.println("hashmap doesn't contains string2");
	    }
	    System.out.println("hashmap size = " + hashmap.size());

	    hashset = new HashSet<String>();
	    hashset.add("abc");
	    hashset.remove("abc");
	    if (hashset.contains("abc")) {
	        System.out.println("Hashset contains abc");
	    } else {
	        System.out.println("Hashset doesn't contains abc");
	    }
	    
	}

	/*
	* Stack / Queue
	*/
	Stack<String> stack;
	Queue<String> queue;
	Queue<String> pQueue;
	public void stackActions() {
	    stack = new Stack<String>();
	    stack.push("abc");
	    System.out.println("Stack peek() = " + stack.peek());
	    System.out.println("Stack pop() = " + stack.pop());
	    if(stack.empty()) {
	       System.out.println("Stack is empty");
	    } else {
	       System.out.println("Stack is not empty");
	    }
	    System.out.println("Stack size = " + stack.size());
	}

	public void queueActions() {
	    queue = new LinkedList<String>();
	    pQueue = new PriorityQueue<String>();
	    
	    queue.offer("abc");
	    System.out.println("Peek of queue is " + queue.peek());
	    
	    System.out.println("Size of queue is " + queue.size());
	    queue.poll();
	    System.out.println("Size of queue is changed to " + queue.size());
	}


	/*
	*  Binary Tree
	*/
	private class TreeNode {
	    String label;
	    TreeNode left;
	    TreeNode right;
	}

	/*
	* Graph
	*/
	private class UndirectedGraphNode {
	    String label;
	    ArrayList<UndirectedGraphNode> neighbors;
	}

	private class DirectedGraphNode {
	    String label;
	    ArrayList<DirectedGraphNode> inNeighbors;
	    ArrayList<DirectedGraphNode> outNeighbors;
	}
}
