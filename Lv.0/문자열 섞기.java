// 문제 설명
// 길이가 같은 두 문자열 str1과 str2가 주어집니다.

// 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

// 제한사항
// 1 ≤ str1의 길이 = str2의 길이 ≤ 10
// str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
// 입출력 예
// str1	str2	result
// "aaaaa"	"bbbbb"	"ababababab"

class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i=0; i<str1.length();i++){
            answer+=str1.substring(i,i+1);
            answer+=str2.substring(i,i+1);
        }
        System.out.println(answer);
        return answer;
    }
}

//----------------------------------
//앞서 사용한 substring(int a, int b)활용

//아쉬운점
//솔루션을 스스로 생각해 내지 못했다.
//생각보다 풀이가 단순할 수 있으니, 솔루션을 찾아보기 보단 먼저 해결법을 고민하는습관을 들이기

//아래는 다른사람의 코드 중 참고할만한 코드
//----------------------------------
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        int length = str1.length();
        String[] str1arr = str1.split("");
        String[] str2arr = str2.split("");
        for (int i=0; i<length; i++) {
            answer += str1arr[i]+str2arr[i];
        }

        return answer;
    }
}

//split을 사용해 문자열 분리->배열 생성 후 그를 이용해 answer값 변경
