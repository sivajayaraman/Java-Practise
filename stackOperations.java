import java.util.*;
public class stackOperations{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t=input.nextInt(),length;
		char decision;
		while(t-->0){
			length=input.nextInt();
			Stack<Integer> stack = new Stack<Integer>();
			while(length-->0){
				decision=input.next().charAt(0);
				if(decision=='i'){
					stack.push(input.nextInt());
				}
				else if(decision=='r'){
					System.out.println("Element Deleted is "+stack.peek());
					stack.pop();
				}
				else if(decision=='h'){
					System.out.println(stack.peek());
				}
				else if(decision=='f'){
					if(stack.contains(input.nextInt())){
						System.out.println("Yes");
					}
					else System.out.println("No");
				}
			}
		}
	}
}