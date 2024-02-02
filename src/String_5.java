import java.util.*;
class String_5 {
    public String solution(String str){
        String answer;
        char[] s=str.toCharArray(); // 배열 생성
        int lt=0, rt=str.length()-1; // while 문 변수

        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++;  // 문자가 해당 배열문자가 맞으면 왼쪽 lt 증가시킴
            else if(!Character.isAlphabetic(s[rt])) rt--; // 문자가 해당 배열문자가 아니면 오른쪽 rt 감소
            else{
                char tmp=s[lt]; // 치환
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(s);
        return answer;
    }

    public static void main(String[] args){
        String_5 T = new String_5();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}