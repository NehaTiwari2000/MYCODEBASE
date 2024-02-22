package LEETCODE_PREMIUM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// https://leetcode.ca/all/161.html
public class OneEditDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if (s.length() - t.length() == 1 || s.length() - t.length() == 0 || s.length() - t.length() == -1) {
            String[] sArr = s.split("");
            String[] tArr = t.split("");
            List<String> listOfCharacterList = new ArrayList<>();
            if (s.length() > t.length()) {
                listOfCharacterList.addAll(Arrays.asList(sArr));
                System.out.println(listOfCharacterList);
                for (int i = 0; i <=sArr.length-1 ; i++) {
                    if(t.contains(sArr[i])){
                        listOfCharacterList.remove(sArr[i]);
                    }
                }
            } else if (s.length() < t.length()) {
                listOfCharacterList.addAll(Arrays.asList(tArr));
                System.out.println(listOfCharacterList);
                for (int i = 0; i <=tArr.length-1 ; i++) {
                    if(s.contains(tArr[i])){
                        listOfCharacterList.remove(tArr[i]);
                    }
                }
            } else if (s.length() == t.length()) {
                listOfCharacterList.addAll(Arrays.asList(sArr));
                for (int i = 0; i <=tArr.length-1 ; i++) {
                    if(s.contains(tArr[i])){
                        listOfCharacterList.remove(tArr[i]);
                    }
                }
            }
            System.out.println(listOfCharacterList);
            System.out.println(listOfCharacterList.size());
        }else{
            System.out.println("Not possible ");
        }
    }
}
