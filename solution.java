package practice;

import java.util.Stack;

public class solution {

    public static void main(String[] args) {
        solution s=new solution();
        System.out.println(s.lengthOfLastWord("Hello World"));

    }
    int reverse(int x){
        long mn=-2147483648;
        long mx=2147483647;
        if(x<mn||x>mx){
            return 0;
        }
        long d=0;
        while(x!=0){
            d*=10;
            d+=x%10;
            x=x/10;
        }
        if(d<mn || d>mx){
            return 0;
        }
        int o=(int)d;
        return o;
    }
    boolean isValid(String s){
        Stack<Character> stack=new Stack();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            if(c==')'){
                char x=stack.pop();
                if(x=='{'||x=='['){
                    return false;
                }
            }
            if(c=='}'){
                char x=stack.pop();
                if(x=='('||x=='['){
                    return false;
                }
            }
            if(c==']'){
                char x=stack.pop();
                if(x=='{'||x=='('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    int lengthOfLastWord(String s){
        String[] st=s.split(" ");
        int l=st.length;
        if(l==0){
            return 0;
        }

        return st[l-1].length();
    }
}
