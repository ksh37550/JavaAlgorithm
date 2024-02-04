import java.util.*;
class String_6 {
    public String solution(String str){
        String answer="";
        for(int i=0; i<str.length(); i++){
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
            // indexOf는 제일 첫번째 문자의 위치를 리턴
            // 그리고 해당 첫번째 문자만 answer에 집어넣는다!
            // 이후에 나오는 i번째 같음 누자들은 indexof의 숫자랑 달라서 answer에 들어가지 못함..
        }
        return answer;
    }

    public static void main(String[] args){
        String_6 T = new String_6();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}