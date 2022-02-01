package km222pw_assign3;


public class PrintRecursive {


    public static void main(String[] args) {
        String str = "Hello Everyone!";

        print(str, 0);
        System.out.println(); // Line break
        printReverse(str, 0);
        
    }


    public static void print(String str, int plac) {
        if (plac == str.length() - 1)
            System.out.print(str.charAt(plac));
        else {
            System.out.print(str.charAt(plac));
            print(str, plac + 1);
        }

    }


    public static void printReverse(String str, int plac) {

        if(plac!=str.length()){
            printReverse(str,plac+1);
            System.out.print(str.charAt(plac));
        }



    }


}
