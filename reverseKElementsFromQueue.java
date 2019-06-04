import java.util.*;
public class reverseKElementsFromQueue{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t,length,k,i;
		t=input.nextInt();
		while(t-->0){
			length=input.nextInt();
			k=input.nextInt();
			Stack<Integer> stack = new Stack<>();
			Queue<Integer> queue = new LinkedList<>();
			while(length-->0){
				queue.add(input.nextInt());
			}
			for(i=0;i<k;i++){
				stack.push(queue.peek());
				queue.remove();
			}
			for(i=0;i<k;i++){
				queue.add(stack.peek());
				stack.pop();
			}
			for(i=0;i<queue.size()-k;i++){
				queue.add(queue.peek());
				queue.remove();
			}
			System.out.print("{ ");
			length=queue.size();
			for(i=0;i<length;i++){
				System.out.print(queue.peek()+" ");
				queue.remove();
			}
			System.out.print("}\n");
		}
	}
}