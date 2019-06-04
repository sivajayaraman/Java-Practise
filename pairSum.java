import java.util.*;
public class pairSum{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length=input.nextInt();
		int arr[]=new int[length],i,j,sum,total=0;
		for(i=0;i<length;i++){
			arr[i]=input.nextInt();	
		}
		System.out.println("GIVEN ARRAY IS "+ Arrays.toString(arr)+" ");
		sum=input.nextInt();
		Arrays.sort(arr);
		i=0;
		j=length-1;
		while(i<j){
			total=arr[i]+arr[j];
			if(total>sum){
				j--;
			}
			else if(total<sum){
				i++;
			}
			else break;
		}
		if(total==sum){
			System.out.println("PAIR FOUND : {"+arr[i]+","+arr[j]+"}");
		}
		else System.out.println("PAIR NOT FOUND!"); 
	}
}