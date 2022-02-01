public class ArrayIntStack extends AbstractIntCollection implements IntStack {
    int top;

    public ArrayIntStack() {
        top = -1;
    }

    /* Add integer at top of stack. */
    @Override
    public void push(int n) {
        if (isFull()){
            resize();
        }
        top = top+1;
        values[top] = n;
        size++;
    }
    /* Returns and removes integer at top of stack  */
    @Override
    public int pop() throws IndexOutOfBoundsException {
        if (isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        int integer = values[top];
        top = top-1;
        size--;
        return integer;
    }
    /* Returns without removing integer at top of stack */
    @Override
    public int peek() throws IndexOutOfBoundsException {
        int integer = values[top];
        return integer;
    }
    public  Boolean isFull(){
        return (top==size-1);
    }
    //Function to clear stack to test poop while stack is empty
    public void clear() {
    for (int i = 0; i < size; i++) {
        values[i] = 0;
    }
    size = 0;
    }

}
