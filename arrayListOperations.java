import java.util.*;
public class arrayListOperations{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t=input.nextInt(),length,i,search,flag;
		char decision;
		ArrayList<Integer> charList = new ArrayList<Integer>();
		while(t-->0){
			length=input.nextInt();
			for(i=0;i<length;i++){
				decision=input.next().charAt(0);
				if(decision=='a'){
					charList.add(input.nextInt());
				}
				else if(decision=='i'){
					Collections.sort(charList);
				}
				else if(decision=='d'){
					Collections.sort(charList,Collections.reverseOrder());
				}
				else if(decision=='s'){
					search=input.nextInt();
					flag=charList.indexOf(search);
					System.out.println(flag);		
				}
			}
		}
	}
}