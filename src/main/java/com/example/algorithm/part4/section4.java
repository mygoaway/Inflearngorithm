package com.example.algorithm.part4;

import java.util.HashMap;
import java.util.Map;
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

        Map<Character, Integer> map2 = new HashMap<>();
        for(char ch : str2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> map1 = new HashMap<>();
        for(int i = 0; i < str2.length() - 1; i++) {
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
        }

        int lt = 0;
        for(int rt = str2.length() - 1; rt < str1.length(); rt++) {
            map1.put(str1.charAt(rt), map1.getOrDefault(str1.charAt(rt), 0) + 1);

            if(map1.equals(map2)) {
                answer++;
            }

            map1.put(str1.charAt(lt), map1.get(str1.charAt(lt)) - 1);
            if(map1.get(str1.charAt(lt)) == 0) {
                map1.remove(str1.charAt(lt));
            }
            lt++;
        }

        return answer;
    }
}
