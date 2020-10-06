
class Q22{
	public static void main(String args[]){
	 int [] arr = new int [] {5, 2, 8, 7, 1, 3, 4, 6, 9, 0};   
	int a=0;

	System.out.println("Elements of array: ");    
        for (int i = 0; i < arr.length; i++)
	{     
            System.out.print(arr[i] + " ");    
        }    
	
	for (int i = 0; i < arr.length; i++) 
	{     
            for (int j = i+1; j < arr.length; j++) 			{     
               		if(arr[i] < arr[j]) 
			{    
                   		a = arr[i];    
                   		arr[i] = arr[j];    
                   		arr[j] = a;    
               		}     
            	}     
        }    

	System.out.println("Elements in descending order: ");    
        for (int i = 0; i < arr.length; i++) 
	{     
            System.out.print(arr[i] + " ");    
        }    


}
}