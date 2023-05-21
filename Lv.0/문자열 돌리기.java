// 문제 설명
// 문자열 str이 주어집니다.
// 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.

// 제한사항
// 1 ≤ str의 길이 ≤ 10

// 입출력 예
// 입력 #1

// abcde
// 출력 #1

// a
// b
// c
// d
// e

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String [] as=a.split("");
        
        for(int i=0;i<as.length;i++)
            System.out.println(as[i]);
    }
}


//아래는 다른 사람 코드 중 이렇게 했으면 좋았겠다고 생각한 것
// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.next();
//         int n = a.length();

//         for(int i = 0; i<n; i++){
//         System.out.println(a.charAt(i));
//         }
//     }
// }
//여기서 n 사용하지 않고, charAt()을 잘 응용하면 더 간편하게 가능할 것이라 생각
