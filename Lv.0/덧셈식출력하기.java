// 문제 설명
// 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.

// a + b = c
// 제한사항
// 1 ≤ a, b ≤ 100
// 입출력 예
// 입력 #1

// 4 5
// 출력 #1

// 4 + 5 = 9

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}

// // print : 괄호안 내용을 단순히 출력. 개행문자(=줄바꿈문자=\n) 포함안됨.

// // printf : C에서의 printf와 동일. %d, %s 등을 쓰기위해 사용. 개행문자 포함X

// // println : 괄호안 내용을 출력한 후 마지막에 개행문자가 포함되어 있어 출력후 한 줄 띄워짐.
