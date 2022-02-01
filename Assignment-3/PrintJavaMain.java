package km222pw_assign3;

import javax.swing.*;
import java.io.File;
import java.io.IOException;


public class PrintJavaMain {
    static int counter = 0;
    static String ext = "";

    public static void main(String[] args) throws IOException {

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {

            File file = new File(String.valueOf(fileChooser.getSelectedFile()));
            if (file.exists() && file.isDirectory()) {
                File listFiles[] = file.listFiles();

                try {
                    System.out.println(listFiles[0].getParent());
                    printAllJavaFiles(listFiles, 0);
                }
                catch (Exception e) {
                    e.printStackTrace();


                }
            }


        }
    }

    static void printAllJavaFiles(File[] files_arr, int index) {
        int i = 0;
        if (index == files_arr.length) {
            return;
        }
        try {

            if (files_arr[index].isFile()) {
                i = files_arr[index].getName().lastIndexOf('.');
            }

            if (i >= 0) {
                ext = files_arr[index].getName().substring(i + 1);

            }

            try {

                if (ext.equals("java")) {
                    counter++;
                    System.out.println("- " + "File " + counter + " : " + files_arr[index].getName() + " File size: " + files_arr[index].length() + " Bytes");

                }
            } catch (NullPointerException e) {
                e.printStackTrace();

            }

            if (files_arr[index].isDirectory()) {
                printAllJavaFiles(files_arr[index].listFiles(), 0);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
        printAllJavaFiles(files_arr, ++index);
    }
}