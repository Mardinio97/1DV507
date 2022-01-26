import java.util.Arrays;

public class Stack implements StringStack {
    String [] stack_Array;
    int size;
    int top;
    public Stack(int size) {
        this.size = size;
        stack_Array = new String[this.size];
        top = -1;
    }



    @Override
    public int size() {
        return top +1;
    }

    @Override
    public boolean isEmpty() {
        return top ==-1;
    }

    @Override
    public void push(String element) {
        ensureCapacity(size+1);
        top = top+1;
        stack_Array[top] = element;

    }

    @Override
    public String pop() {
        if (isEmpty())

        {
            throw new IllegalStateException("Stack is empty");
        }
        size--;
        String element =  stack_Array[top];
        stack_Array[top] = null;
        top--;


        return  element;
    }

    @Override
    public String peek() {

        if (isEmpty())

    {
        throw new IllegalStateException("Stack is empty");
    }
        return stack_Array[top];
    }

    public void ensureCapacity(int minCapacity){
        int oldCapacity = stack_Array.length;

        if (oldCapacity<minCapacity){
            int newCapacity = stack_Array.length*2;
            stack_Array= Arrays.copyOf(stack_Array, newCapacity);
        }
    }
}
