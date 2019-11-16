import java.util.*; 
  

class Node 
{ 
int data; 
Node leftChild; 
Node rightChild; 
Node(int data) 
{ 
    this.data = data;  
} 
} 
  
class BinaryTree { 
Node rootNode; 
  

void printEvenTraversal() { 
      
   
    if (rootNode == null) { 
    return; 
    } 
  
    
    Stack<Node> currentLevel = new Stack<>(); 
    Stack<Node> nextLevel = new Stack<>(); 
  
    
    currentLevel.push(rootNode); 
    boolean leftToRight = true; 
  
    
    while (!currentLevel.isEmpty()) { 
  
    
    Node node = currentLevel.pop(); 
      
    
    System.out.print(node.data + " "); 
  
    
    if (leftToRight) { 
        if (node.leftChild != null) { 
        nextLevel.push(node.leftChild); 
        } 
          
        if (node.rightChild != null) { 
        nextLevel.push(node.rightChild); 
        } 
    } 
    else { 
        if (node.rightChild != null) { 
        nextLevel.push(node.rightChild); 
        } 
          
        if (node.leftChild != null) { 
        nextLevel.push(node.leftChild); 
        } 
    } 
  
    if (currentLevel.isEmpty()) { 
        leftToRight = !leftToRight; 
        Stack<Node> temp = currentLevel; 
        currentLevel = nextLevel; 
        nextLevel = temp; 
    } 
    } 
} 
} 
  
public class EvenTreeTraversal { 
  

public static void main(String[] args)  
{ 
    BinaryTree tree = new BinaryTree(); 
    tree.rootNode = new Node(10); 
    tree.rootNode.leftChild = new Node(20); 
    tree.rootNode.rightChild = new Node(30); 
    tree.rootNode.leftChild.leftChild = new Node(100); 
    tree.rootNode.leftChild.rightChild = new Node(60); 
    tree.rootNode.rightChild.leftChild = new Node(50); 
    tree.rootNode.rightChild.rightChild = new Node(40); 
  
    System.out.println("Even Order traversal of binary tree is"); 
    tree.printEvenTraversal(); 
} 
} 