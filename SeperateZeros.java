
public class SeperateZeros {
	
	
	public static void main(String[] args) {
		
		  int[] num={14,0,13,0,0,5,0};
          int count=0;
         for(int i=0;i<num.length;i++)
         {
           if(num[i]!=0)
           { 
               int temp;
               temp=num[count];
               num[count]=num[i];
               num[i]=temp;
               count++;
               
           }
         }
            
         System.out.println("Array elements are :  ");
for(int i:num)
 {	
     System.out.print(" "+ i);
     
     
 }


}

}
