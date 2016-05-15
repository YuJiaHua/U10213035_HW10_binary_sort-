public class TestBinary_sort
{
	public static void main(String[] args)
	{
		 int i;         
         int[] array = { 35, 17, 4, 18, 22, 7, 6, 12, 8 };
         
         Binary_sort obj = new Binary_sort();
      
         System.out.print("Original Array:");
         // Use loop to insert a way to build a tree
         for ( i = 0; i < array.length; i++ ) {
              System.out.print(array[i]+" ");
              obj.insertBSTreeNode(array[i]);
         }

         System.out.printf("\nInOrder:");
         obj.inOrderTraversal(obj.head);
	}
}
