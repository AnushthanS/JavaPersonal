package Problems;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayDeque;

// https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true
//While we can use stack, deque implements stack way better and faster

public class BalancedBracketStack {
    public static void main(String[] args) {
        //Stack has been deprecated in java, we use deque instead of stack
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        while(sc.hasNext()){
            String text = sc.next();
            System.out.println(isBalanced(text, map));
        }
        sc.close();
    }

    private static boolean isBalanced(String input, HashMap<Character, Character> map){
        if(input.length()%2!=0) return false;
        ArrayDeque<Character> stackDq = new ArrayDeque<>();

        for(int i=0; i<input.length(); i++){
            Character ch = input.charAt(i);
            if(map.containsKey(ch)){
                stackDq.push(ch);
            } else if(stackDq.isEmpty() || ch != map.get(stackDq.pop())){
                return false;
            }
        }
        return stackDq.isEmpty();
    }
}
