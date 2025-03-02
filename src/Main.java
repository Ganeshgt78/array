//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
       Stack<String>stack=new Stack<String>();
        System.out.println(stack.empty());
       stack.push("item");
       stack.push("bag");
       stack.push("college");
       stack.push("school");
        System.out.println(stack.peek());
        System.out.println(stack.search("bag"));
        String MyfavGame = stack.pop();
        System.out.println(MyfavGame);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.lastElement());

    }
}

