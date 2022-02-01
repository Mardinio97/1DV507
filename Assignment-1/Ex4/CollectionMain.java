import java.util.Scanner;

public class CollectionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        System.out.println("Choose collection to test\n" + "(1) for ArrayIntList\n" + "(2) for ArrayIntStack");
        answer=scanner.nextInt();
        switch (answer){
            case 1:
                ArrayIntList arrayIntList = new ArrayIntList();
                //Add function
                arrayIntList.add(5);
                arrayIntList.add(7);
                arrayIntList.add(8);
                //Add at function
                arrayIntList.addAt(6, 1);
                // Add with resize
                for (int i = 9; i <= 15; i++) {
                    arrayIntList.add(i);
                }
                //Get function
                for (int i = 0; i <arrayIntList.size ; i++) {
                    System.out.println(arrayIntList.get(i));
                }
                //Remove
                arrayIntList.remove(1);
                System.out.println("List after removing index 1");
                for (int i = 0; i <arrayIntList.size ; i++) {

                    System.out.println(arrayIntList.get(i));
                }
                //IndexOf function
                System.out.println("Position of integer 10 (it has to be 4)");
                System.out.println("Position of integer 10: "+arrayIntList.indexOf(10));

                // //IndexOf function with integer doesn't exist
                System.out.println("Position of integer 150 (it has return -1)");
                System.out.println("Position of integer 10: "+arrayIntList.indexOf(150));
                break;
            case 2:
                ArrayIntStack arrayIntStack = new ArrayIntStack();
                //Push function
                arrayIntStack.push(5);
                arrayIntStack.push(6);
                arrayIntStack.push(7);
                System.out.println(arrayIntStack);
                //Pop function
                System.out.println(   arrayIntStack.pop());
                System.out.println("Stack after removing integer at top ");
                System.out.println(arrayIntStack);
                arrayIntStack.push(8);
                arrayIntStack.push(9);
                //Peek function
                System.out.println(arrayIntStack);
                System.out.println("Integer at top: "+ arrayIntStack.peek());
                //Pop function while stack is empty
                arrayIntStack.clear();
                System.out.println(arrayIntStack.pop());





        }



    }
}
