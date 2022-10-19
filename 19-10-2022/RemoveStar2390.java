package problems;

import java.util.Stack;

public class RemoveStar2390 {
	 public static String removeStars(String s) {
	        Stack<Character> stack = new Stack<>();
	        for(char c: s.toCharArray()){
	            if(c == '*')
	                stack.pop();
	            else
	                stack.push(c);
	        }
	        StringBuilder str = new StringBuilder();
	        int len = stack.size();
	        for(int i= 0;i<len;i++){
	            str.append(stack.pop());
	        }
	        str.reverse();
	        return str.toString();
	    }

	public static void main(String[] args) {
		String str="leettt**codeee**";
		System.out.println(removeStars(str));
	}

}
