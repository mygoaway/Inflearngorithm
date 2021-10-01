package com.example.algorithm.part4;

import java.util.HashMap;
import java.util.Scanner;

public class section4 {
    public static void main(String[] args) {
        section4 se1 = new section4();
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next();

        System.out.print(se1.solution(str1, str2));
    }

    public int solution(String str1, String str2) {
        int answer = 0;


        HashMap<Character, Integer> bm = new HashMap<>();
        for(int i = 0; i < str2.length(); i++) {
            bm.put(str2.charAt(i), bm.getOrDefault(str2.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> am = new HashMap<>();

        for(int i = 0; i < str2.length() - 1; i++) {
            am.put(str1.charAt(i), am.getOrDefault(str1.charAt(i), 0) + 1);
        }

        int lt = 0;
        for(int rt = str2.length()-1; rt < str1.length(); rt++) {
            am.put(str1.charAt(rt), am.getOrDefault(str1.charAt(rt), 0) + 1);

            if(am.equals(bm)) {
                answer++;
            }

            am.put(str1.charAt(lt), am.get(str1.charAt(lt)) -1);
            if(am.get(str1.charAt(lt)) == 0) {
                am.remove(str1.charAt(lt));
            }

            lt++;
        }


        return answer;
    }
}
