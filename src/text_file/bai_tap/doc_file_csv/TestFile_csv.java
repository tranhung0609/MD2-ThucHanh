package text_file.bai_tap.doc_file_csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFile_csv {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\text_file\\bai_tap\\doc_file_csv\\file.csv");
        Scanner sc = new Scanner(file);
        String[] arr;
        while (sc.hasNext()){
            arr = sc.nextLine().split(",");
            for (String i : arr) {
                System.out.println(i);
        }

        }
    }
}
