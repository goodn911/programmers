

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



