package test;

import java.util.Arrays;

public class Main {
    public static String solution(int n) {
        int result = 0;
        String str = Integer.toString(n);
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        char[] arr = new char[str.length()];
        String answer = "";

        for (int i = 0; i < reverse.length(); i++) {
            arr[i] = reverse.charAt(i);
            result += arr[i] - 48;  //각 인덱스 더한 결과값


            answer += Character.toString(arr[i]) + "+";
        }
        answer = answer.substring(0, answer.length() - 1) + "=" + result;


        return answer;
    }

    public static void main(String[] args) {
        int n = 718253;
        System.out.println(solution(n));
    }
}

class Solution {
    static String solution(int number) {
        String answer = "";
        int sum = 0;
        char[] num = Integer.toString(number).toCharArray();//받은 number를 char[] 로 치환
         for (int i = num.length - 1; i >= 0; i--) {
                                                            //answer에 맨 뒤의 원소와 +를 함께 더함
        answer += num[i] + "+";
        sum += num[i] - '0';
                                                            //char를 연산식에 넣으면 아스키 코드값으로 변하기 때문에 '0' 만큼의 아스키 코드 값을 빼준다
        }
        answer = answer.substring(0, answer.length() - 1) + "=" + sum;
                                                            //마지막에 위치하게된 +를 제거하고 = 과 결과값 sum을 더한다.String + int를 하면 int가 자동으로 String으로 바뀐다.
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(718253));
    }
}
