import java.util.*;
class String_4 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer=new ArrayList<>(); // arraylist 로 받음
        for(String x : str){
            String tmp=new StringBuilder(x).reverse().toString(); // StringBuilder의 revers 사용
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        String_4 T = new String_4();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt(); // 몇 개 받을지 입력
        String[] str=new String[n];
        for(int i=0; i<n; i++){
            str[i]=kb.next(); // 입력한 개수만큼 스트링 입력 받음.
        }
        for(String x : T.solution(n, str)){
            System.out.println(x); // print
        }
    }
}

