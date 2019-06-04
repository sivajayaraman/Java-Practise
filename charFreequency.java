import java.util.*;
public class charFreequency{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length=input.nextInt();
		char arr[]=new char[length];
		char decision;
		int count[]=new int[26];
		int i;
		for(i=0;i<length;i++){
			decision=input.next().charAt(0);
			arr[i]=input.next().charAt(0);
			if(decision=='i'){
				count[arr[i]-'a']++;
			}
			else if(decision=='f'){
				if(count[arr[i]-'a']>0)
					System.out.println(arr[i]+"-"+count[arr[i]-'a']);
				else System.out.println("NOT PRESENT");
			}
		}
	}
}