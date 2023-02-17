import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;


//직사각형 별찍기
class Programmers_0 {
}
class Solution_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i=0; i<b; i++){
            for (int j=0; j<a; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(a + b);
    }
}

//짝수와 홀수
class Solution_2 {
    public String solution(int num) {

        String answer = "";

        if (num == 0){
            answer = "Even";
        }
        else if (num % 2 == 0){
            answer = "Even";
        }
        else{
            answer = "Odd";
        }

        return answer;
    }
}

//가운데 글자 가져오기
class Solution_3 {
    public String solution(String s) {
        String answer = "";

        int len = s.length();

        if(len%2 == 0){
            answer = s.substring(len/2-1, len/2+1);
        }
        else {
            answer = s.substring(len/2, len/2+1);
        }

        return answer;
    }
}

// 두 정수사이의 합
class Solution_4 {
    public long solution(int a, int b) {

        long answer = 0;

        if(a>b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        for (int i=a; i<=b; i++){
            answer += i;
        }

        return answer;

    }
}

//// 너무 노가다...
//class Solution_5 {
//    public int solution_5(String s) {
//        int answer = 0;
//        int len = s.length();
//
//        if (s.charAt(0) == 75){
//            switch(len){
//                case 2: answer = s.charAt(1) -'0'; break;
//                case 3: answer = (s.charAt(1) -'0') * 10 + (s.charAt(2) - '0'); break;
//                case 4: answer = (s.charAt(1) -'0') * 100 + (s.charAt(2) - '0') * 10 + s.charAt(3); break;
//                case 5: answer = (s.charAt(1) -'0') * 1000 + (s.charAt(2) - '0') * 100 + s.charAt(3) * 10 + s.charAt(4); break;
//            }
//        }
//        else if (s.charAt(0) == 77){
//            switch(len){
//                case 2: answer = s.charAt(1) -'0'; break;
//                case 3: answer = (s.charAt(1) -'0') * 10 + (s.charAt(2) - '0'); break;
//                case 4: answer = (s.charAt(1) -'0') * 100 + (s.charAt(2) - '0') * 10 + s.charAt(3); break;
//                case 5: answer = (s.charAt(1) -'0') * 1000 + (s.charAt(2) - '0') * 100 + s.charAt(3) * 10 + s.charAt(4); break;
//            }
//        }
//        else{
//            switch(len){
//                case 1: answer = s.charAt(1) -'0'; break;
//                case 2: answer = (s.charAt(1) -'0') * 10 + (s.charAt(2) - '0'); break;
//                case 3: answer = (s.charAt(1) -'0') * 100 + (s.charAt(2) - '0') * 10 + s.charAt(3); break;
//                case 4: answer = (s.charAt(1) -'0') * 1000 + (s.charAt(2) - '0') * 100 + s.charAt(3) * 10 + s.charAt(4); break;
//                case 5: answer = (s.charAt(1) -'0') * 10000 + (s.charAt(2) - '0') * 1000 + s.charAt(3) * 100 + s.charAt(4) * 10 + s.charAt(5); break;
//            }
//        }
//
//        return answer;
//    }
//}


//// 냅따 함수 쓰는건 쫌...
//class Solution_5 {
//    public int solution_5(String s) {
//        int answer = 0;
//
//        answer = Integer.parseInt(s);
//
//        return answer;
//    }
//}



//문자열을 정수로 바꾸기
class Solution_5 {
    public int solution(String s) {
        int answer = 0;

        for (int i=0; i<s.length(); i++){
            answer = answer * 10 + (s.charAt(i)-48);
            if (answer<0)
                answer = 0;
        }

        if (s.charAt(0) == 45){
            answer *= (-1);
        }

        return answer;
    }

}



//없는 숫자 더하기
class Solution_6 {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;

        for (int i=0; i<10; i++){
            max += i;
        }

        for (int e : numbers){
            answer += e;
        }

        answer = max - answer;
        return answer;
    }
}



//음양 더하기
class Solution_7 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i=0; i<absolutes.length; i++){
            if(signs[i]){
                answer += absolutes[i];
            }
            else
                answer -= absolutes[i];
        }

        return answer;
    }
}


// 평균구하기
class Solution_8 {
    public double solution(int[] arr) {
        double answer = 0;
        double sum;

        for (double e : arr){
            answer += e;
        }

        answer = answer / arr.length;

        return answer;
    }
}


class Solution_9 {
    public String solution(String phone_number) {
        String answer = "";

        int len = phone_number.length();

        for (int i=0; i<len-4; i++){
            answer += '*';
        }

        answer += phone_number.substring(len-4);

        return answer;
    }
}

//행렬의 덧셈
class Solution_10 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}



//x만큼 간격이 있는 n개의 숫자
class Solution_11 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int cnt=0;

        for (long i=x; cnt<n ; i = i+x ){
            answer[cnt] = i;
            cnt ++;
        }

        return answer;
    }
}



//부족한 금액 계산하기
class Solution_12 {
    public long solution(int price, int money, int count) {
        long answer = money;

        for (int i=1; i<=count; i++){
            answer -= price*i;
        }

        if (answer>=0) {
            answer = 0;
        }
        else
            answer *= -1;

        return answer;
    }
}



// 2016년
class Solution_13 {
    public String solution(int a, int b) {
        String answer = "";

        String week[] = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int days[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int daysum = 0;

        for (int i=0; i<a-1; i++){
            daysum += days[i];
        }
        daysum += b;

        answer = week[daysum%7];


        return answer;
    }
}

//나누어 떨어지는 숫자 배열
class Solution_14 {
    public int[] solution(int[] arr, int divisor) {

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                cnt++;
            }
        }

        if (cnt == 0) {
            int[] answer = {-1};
            return answer;
        }


        int[] answer = new int[cnt];
        cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        Arrays.sort(answer);

        return answer;
    }
}


//내적
class Solution_15 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i=0; i<a.length; i++){
            answer += a[i]*b[i];
        }

        return answer;
    }
}



//문자열 내 p와 y의 개수
class Solution_16 {
    boolean solution(String s) {
        boolean answer = true;

        int p = 0;
        int y = 0;

        for (int i=0; i<s.length(); i++){
          if (s.charAt(i) == 'p' || s.charAt(i) == 'P'){
              p++;
            }
          else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
              y++;
          }
        }

        if(p!=y){
            answer = false;
        }

        return answer;
    }
}



//문자열 다루기 기본
class Solution_17 {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6){
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) <= '0' || s.charAt(i) >= '9') {
                    answer = false;
                }
            }
        }
        else
            answer = false;

        return answer;
    }
}



// 서울에서 김서방 찾기
class Solution_18 {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i=0; i<seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }
}



// 수박수박수박수박수박수?
class Solution_19 {
    public String solution(int n) {
        String answer = "";
        for (int i=0; i<n; i++){
            if (i%2 == 0){
                answer += "수";
            }
            else
                answer += "박";
        }
        return answer;
    }
}


//완주하지 못한 선수
class Solution_20 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int cnt = 0;

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i=0; i<completion.length; i++){
            if (participant[i].equals(completion[i]) == false){
                answer = participant[i];
                cnt ++;
                break;
            }
        }

        if (cnt == 0){
            answer = participant[participant.length-1];
        }

        return answer;
    }
}


//이상한 문자 만들기
class Solution_21 {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;

        s = s.toLowerCase();
        System.out.println(s);
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == ' ' ){
                cnt = 0;
                answer += " ";
            }
            else {
                if (cnt % 2 == 0){
                    answer += (char)(s.charAt(i) - 32);
                }
                else {
                    answer += s.charAt(i);
                }
                cnt++;
            }
        }
        return answer;
    }
}



//자릴수 더하기
class Solution_22 {
    public int solution(int n) {
        int answer = 0;

        while (n > 0){
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}

//자연수 뒤집기
class Solution_23 {
    public int[] solution(long n) {

        String tmp = "";
        for (int i=0; n>0 ; i++){
            tmp += n%10;
            n /= 10;
        }

        int [] answer = new int[tmp.length()];

        for (int j=0; j<tmp.length(); j++){
            answer[j] = tmp.charAt(j)-'0';
        }

        return answer;
    }
}



//정수 내림차순으로 배치하기
class Solution_24 {
    public long solution(long n) {
        long answer = 0;

        String tmp = ""+n;
        char[] answer_arr = tmp.toCharArray();

        Arrays.sort(answer_arr);



        for (int i=0; i<answer_arr.length; i++){
            answer += answer_arr[answer_arr.length-1-i]-'0';
            answer *= 10;
        }
        answer /= 10;

        return answer;
    }
}


class Solution_25 {
    public long solution(long n) {
        long answer = 0;

        long sqrt_ans = (long)Math.sqrt(n);
        if (sqrt_ans * sqrt_ans == n){
            answer = (sqrt_ans+1) * (sqrt_ans+1);
        }
        else
            answer = -1;

        return answer;
    }
}


//제일 작은수 제거하기
class Solution_26 {
    public int[] solution(int[] arr) {

        int[] answer;
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }

        if (arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[arr.length-1];
        }

        for (int j=0, k=0; k<arr.length; j++, k++){
            if (arr[k] == min){
                j--;
            }
            else{
                answer[j] = arr[k];
            }
        }
        return answer;
    }
}




public class Main {
    public static void main(String[] ars) {
        Solution_26 s = new Solution_26();

        int a[] = {4,3,2,1};
        int b[] = {10};

        //String ss = "try hello world abcd DDDkdkdkdk ";
        //String[] completion = {"eden", "kiki"};

        //System.out.println(s.solution(10));
        System.out.println(Arrays.toString(s.solution(a)));

    }
}

//콜라츠 추측
class Solution_27 {
    public int solution(int num) {

        long tmp = num;
        int answer = -1;
            int i;
            for (i = 0; i < 500; i++) {
                if (tmp == 1) {
                    answer = i;
                    break;
                } else if (tmp % 2 == 0) {
                    tmp /= 2;
                } else
                    tmp = tmp * 3 + 1;
            }
        return answer;
    }
}


class Solution_28 {
    public boolean solution(int x) {
        boolean answer = true;

        String x_str = Integer.toString(x);
        int x_sum = 0;

        for (int i=0; i<x_str.length(); i++){
            x_sum += x_str.charAt(i)-'0';
        }

        if (x % x_sum != 0){
            answer = false;
        }

        return answer;
    }
}





