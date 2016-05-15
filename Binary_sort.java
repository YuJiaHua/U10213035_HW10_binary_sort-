//Class TreeNode definition
class TreeNode
{   
	int data;        // Node value
	TreeNode leftNode;   // Left node
	TreeNode rightNode;  // Right node
	// Constructor
	public TreeNode(int data) {
		this.data = data;
		this.leftNode = this.rightNode = null;
	}
}
class Binary_sort {     
	public TreeNode head;   
	// Create empty binary search tree
	public Binary_sort() { 
		head = null; 
	}
 
	// Check whether the binary search tree is empty
	boolean isBSTreeEmpty() {
		if ( head == null ) 
			return true;
		else                
			return false;
	}
	// Insert new node
	public void insertBSTreeNode(int data) {
		if ( head == null ) {  
			head = new TreeNode(data);
			return;
		}	
		// Build binary search tree
		TreeNode current = head;
	while (true) {
			if ( data < current.data ) {  // In the left subtree
				if ( current.leftNode == null ) {
					current.leftNode = new TreeNode(data);
					return;
				}
				else  current = current.leftNode;
			}
			else {  // In the right subtree
			if ( current.rightNode == null ) {
	               current.rightNode = new TreeNode(data);
	               return;
            }
            else  current = current.rightNode;
			}
		}
   }

   // Inorder traversal 
   public void inOrderTraversal(TreeNode node) {
      if ( node != null ) {  
    	  inOrderTraversal(node.leftNode);  // In the left subtree
         // Print node
         System.out.print(node.data+" ");
         inOrderTraversal(node.rightNode); // In the right subtree
      }
   }
}
