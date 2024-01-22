import java.util.*;
class String_3 {
    public String solution(String str){
        String answer="";
        int m=Integer.MIN_VALUE; // 최소값
        String[] s = str.split(" ");
        for(String x : s){ // for each문
            int len=x.length(); // split으로 짜른 배열의 키워드의 길이를 구함
            // 길이가 길면 치환
            if(len>m){ // 길이가 가장 큰 값이 answer 에 들어감
                m=len;
                answer=x;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        String_3 T = new String_3();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
}


