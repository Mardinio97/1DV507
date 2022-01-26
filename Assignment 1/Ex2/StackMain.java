public class StackMain {
    public static void main(String args[]){
        Stack stack = new Stack(5);
        stack.push("Hello");
        stack.push("World");
        System.out.println(stack.size());
        System.out.println( "Top element: "+stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.push("Java");
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());


    }
}
