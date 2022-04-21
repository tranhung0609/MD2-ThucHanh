package searchalgorithm;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi");
        String string = sc.nextLine();

        LinkedList<Character> characters = new LinkedList<>();
        for (int i = 0;i<string.length();i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i +1; j < string.length();j++){
                if (string.charAt(j) > list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if (list.size()>characters.size()){
                characters.clear();
                characters.addAll(list);
            }
            list.clear();
        }
        for (Character ch : characters){
            System.out.print(ch);
        }
        System.out.println();
    }

}

