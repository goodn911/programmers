package level1;


import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                cnt++;

            }
        }
        int[] answer = new int[cnt];
        int j = 0;
        if (cnt == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    answer[j] = arr[i];
                    j++;
                }

            }
        }
        Arrays.sort(answer);
        return answer;

    }
}

public class program {
    public static void main(String[] args) {
        // write your code here
        int[] a = {5, 9, 6, 10};
        Solution solution = new Solution();
        System.out.println(solution.solution(a, 5));
    }
}


