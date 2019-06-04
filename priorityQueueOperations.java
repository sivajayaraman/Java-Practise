import java.util.*;
public class priorityQueueOperations{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t,length,searchFor;
		t=input.nextInt();
		while(t-->0){
			PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>(){
				public int compare(Integer num1, Integer num2){
					return num2.compareTo(num1);
				}
			});
			length=input.nextInt();
			while(length-->0){
				queue.add(input.nextInt());
			}
			length=input.nextInt();
			while(length-->0){
				searchFor=input.nextInt();
				if(queue.contains(searchFor)){
					System.out.println("Present! Max Deleted is "+queue.peek());
					queue.remove(queue.peek());
				}
				else System.out.println(-1);
			}
		}
	}
}