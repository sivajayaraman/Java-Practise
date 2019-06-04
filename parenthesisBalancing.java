import java.util.*;
import java.lang.*;
import java.io.*;
class parenthesisBalancing{
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		int t=input.nextInt(),i;
		String validate;
		while(t-->0){
		    Stack<Character> stack = new Stack<Character>();
		    int flag=0;
		    validate=input.next();
		    //System.out.println(validate);
		    for(i=0;i<validate.length();i++){
		        char element=validate.charAt(i);
		        if(element=='{' || element=='[' || element=='('){
		            stack.push(element);
		        }
		        else if(!stack.empty()){
		            char temp=(char)stack.peek();
		            if((temp=='(' && element!=')') || (temp=='[' && element!=']') || (temp=='{' && element!='}')){
		                flag=1;
		                break;
		            }
		            else{
		                stack.pop();
		            }
		        }
		        else {
		            flag=1;
		            break;
		        }
		    }
		    if(!stack.empty() || flag==1){
		        System.out.println("not balanced");
		    }
		    else System.out.println("balanced");
		}
	}
}