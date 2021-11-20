package no1;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer += absolutes[i]*(signs[i]?1:-1);
        } return answer;

    }

    public static void main(String[] args) {
        // write your code here
        int x[] = {4, 7, 2};
        boolean y[] = {true, false, true};

        Solution solution = new Solution();
        System.out.println(solution.solution(x, y));

    }
}