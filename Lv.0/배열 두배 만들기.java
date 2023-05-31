// 제한사항
// -10,000 ≤ numbers의 원소 ≤ 10,000
// 1 ≤ numbers의 길이 ≤ 1,000
// 입출력 예
// numbers	result
// [1, 2, 3, 4, 5]	[2, 4, 6, 8, 10]
// [1, 2, 100, -99, 1, 2, 3]	[2, 4, 200, -198, 2, 4, 6]
// 입출력 예 설명
// 입출력 예 #1

// [1, 2, 3, 4, 5]의 각 원소에 두배를 한 배열 [2, 4, 6, 8, 10]을 return합니다.
// 입출력 예 #2

// [1, 2, 100, -99, 1, 2, 3]의 각 원소에 두배를 한 배열 [2, 4, 200, -198, 2, 4, 6]을 return합니다.

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
        answer[i]=numbers[i]*2;    
        }
        return answer;
    }
}

//아쉬운 점 : int[] numbers를 전달받는것을 바로 응용하지 못했음
//           배열 문법 약간 헷갈림
//--------------------다른사람 코드 참고--------------------------
import java.util.*;

class Solution {
    public ArrayList solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int num : numbers){
            answer.add(num*2);
        }

        return answer;
    }
}
