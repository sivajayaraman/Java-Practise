import java.util.*;
public class queueOperations{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t,length,frequencyFor,count;
		t=input.nextInt();
		while(t-->0){
			length=input.nextInt();
			Queue<Integer> queue = new LinkedList<>();
			while(length-->0){
				queue.add(input.nextInt());	
			}
			length=input.nextInt();
			while(length-->0){
				frequencyFor=input.nextInt();
				count=Collections.frequency(queue,frequencyFor);
				if(count==0) 
					count=-1;
				System.out.println(count);
			}
		}
	}
}