import java.util.*;
public class tripletProduct{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int length=input.nextInt();
		int arr[]=new int[length];
		int i,max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE,maxProduct;
		int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
		if(length>=3){
			for(i=0;i<length;i++){
				arr[i]=input.nextInt();
				if(arr[i]>=max1){
					max3=max2;
					max2=max1;
					max1=arr[i];
				}
				else if(arr[i]>=max2){
					max3=max2;
					max2=arr[i];
				}
				else if(arr[i]>=max3){
					max3=arr[i];
				}
				if(arr[i]<=min1){
					min2=min1;
					min1=arr[i];
				}
				else if(arr[i]<=min2){
					min2=arr[i];
				}
			}
			System.out.println("GIVEN ARRAY IS "+ Arrays.toString(arr)+" ");
			maxProduct=max1*max2*max3;
			if(min1*min2*max1>maxProduct){
				System.out.println("MAXIMUM PRODUCT IS "+min1+"x"+min2+"x"+max1+"="+min1*min2*max1);
			}
			else{
				System.out.println("MAXIMUM PRODUCT IS "+max1+"x"+max2+"x"+max3+"="+maxProduct);
			}
		}
		else{
			System.out.println("ENTER VALID INPUT SIZE");
		}
	}
}