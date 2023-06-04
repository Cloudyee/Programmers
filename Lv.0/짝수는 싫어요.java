// 문제 설명
// 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

// 제한사항
// 1 ≤ n ≤ 100
// 입출력 예
// n	result
// 10	[1, 3, 5, 7, 9]
// 15	[1, 3, 5, 7, 9, 11, 13, 15]
// 입출력 예 설명
// 입출력 #1

// 10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.
// 입출력 #1

// 15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다.

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int j = 0; //인덱싱할 값 지정
        for(int i=1;i<=n;i++){
            if(i%2==1){
                answer[j]=i;
                j++; //오류일 경우에만 인덱스 값 추가
            }
        }
        return answer;
    }
}

//----------------다른 사람 코드 중 참고할 만한 것----------------
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}

/*느낀점
* : Stream에 대해 공부해야겠다고 생각함
* : 배열의 길이를 결정하는데 이썽 (n+1)/2를 생각해내지 못해 슬펐다...
*/
