import java.util.Scanner;

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



public class Main {
    public static void main(String[] ars) {
        Solution_15 s = new Solution_15();

        System.out.println(s.solution("1234"));
    }
}