

//음양더하기
/*
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer += absolutes[i]*(signs[i]?1:-1);
        } return answer;

    }
}


public class Main {
    public static void main(String[] args) {
        // write your code here
        int x[] = {4, 7, 2};
        boolean y[]={true,false,true};

        Solution solution = new Solution();
        System.out.println(solution.solution(x,y));

    }
}*/


//핸드폰 번호 가리기
/*
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String newAnswer = "";
        String backAnswer = "";
        answer = phone_number.substring(0,phone_number.length()-4);
        for(int i = 0;i<answer.length();i++){
            newAnswer+="*";
        }
        backAnswer = phone_number.substring(phone_number.length()-4);


        return newAnswer+backAnswer;
    }
}



public class Main {
    public static void main(String[] args) {
        // write your code here
        String x = "0133334444";

        Solution solution = new Solution();
        System.out.println(solution.solution(x));
    }
}*/
//2016년 요일
/*
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int sumdays=0;
        int check=0;
        int []month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        for(int i =0;i<a-1;i++){
            if((i)==2){
                sumdays += month[i];
            }
            else if((i)%2==0){              //짝수달
                sumdays += month[i];

            }else if((i)==7){
                sumdays+=month[i];
            }else {
                sumdays+=month[i];
            }
        }
        check= sumdays;
        answer= day[(sumdays+b+4)%7];

        return check+answer;
    }
}
public class Main {
    public static void main(String[] args) {
        // write your code here

        Solution solution = new Solution();
        System.out.println(solution.solution(1, 1));
    }
}
 */
/*
//문자열다루기 기본
class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {


            char[] arr = s.toCharArray();
            int count = 0;
            char[] num = {'0', '1', '2','3','4', '5','6','7','8','9'};
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < 10; j++) {
                    if (arr[i] == num[j]) {
                        count +=1;

                    }
                }
            }
            if(count == s.length()){
                return true;
            }else{
                return false;
            }

        } else {
            return false;
        }


    }
}

public class Main {
    public static void main(String[] args) {
        // write your code here

        Solution solution = new Solution();
        System.out.println(solution.solution("a231"));
    }
}

 */
//이상한 문자만들기
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        String answer = "";
        int count = 0;
        for(int i=0; i<str.length; i++){
            count= str[i].equals(" ") ? 0 : count+1 ;
            answer+= count % 2==0 ? str[i].toLowerCase(): str[i].toUpperCase();
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        // write your code here

        Solution solution = new Solution();
        System.out.println(solution.solution("tryh ello world"));
    }
}

 */

/*
//정수제곱근 판별
class Solution {
    public long solution(long n) {
        long answer = 0;

        if(Math.sqrt(n)%1==0){
            answer = (long) Math.pow(Math.sqrt(n)+1,2);
        }else{
            answer = -1;
        }
        return answer;
    }
}
public class Main {
    public static void main(String[] args) {
        // write your code here

        Solution solution = new Solution();
        System.out.println(solution.solution(121));
    }
}

 */

//행렬의 덧셈
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i =0;i<arr1.length;i++){
            for(int j = 0;j<arr2[i].length;j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];

            }
        }
        return answer;
    }
}
public class Main {
    public static void main(String[] args) {
        // write your code here
        int[][] aa = {
                {1,2},
                {2,3}
        };
        int[][] bb = {
                {3,4},
                {5,6}
        };
        Solution solution = new Solution();
        System.out.println(solution.solution(aa,bb));
    }
}
