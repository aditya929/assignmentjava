class Node  
{ 
    int data; 
    Node left, right; 
       
    Node(int item)  
    { 
        data = item; 
        left = right; 
    } 
} 
   
class descending  
{ 
    Node root; 
   
    
    void reverseLevelOrder(Node node)  
    { 
        int h = height(node); 
        int i; 
        for (i = h; i >= 1; i--)  
        
        { 
            printGivenLevel(node, i); 
        } 
    } 
   
    
    void printGivenLevel(Node node, int level)  
    { 
        if (node == null) 
            return; 
        if (level == 1) 
            System.out.print(node.data + " "); 
        else if (level > 1)  
        { 
            printGivenLevel(node.left, level - 1); 
            printGivenLevel(node.right, level - 1); 
        } 
    } 
   
    
    int height(Node node)  
    { 
        if (node == null) 
            return 0; 
        else
        { 
            
            int lheight = height(node.left); 
            int rheight = height(node.right); 
   
          
            if (lheight > rheight) 
                return (lheight + 1); 
            else
                return (rheight + 1); 
        } 
    } 
   
    
    public static void main(String args[])  
    { 
        descending tree = new descending(); 
   
      
        tree.root = new Node(15); 
        tree.root.left = new Node(20); 
        tree.root.right = new Node(35); 
        tree.root.left.left = new Node(40); 
        tree.root.left.right = new Node(55); 
           
        System.out.println("BST in Descending Order  "); 
        tree.reverseLevelOrder(tree.root); 
    } 
} 
   