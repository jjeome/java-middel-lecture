package example.middle.exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
//        NetworkServiceV1_1 service = new NetworkServiceV1_1();
        NetworkServiceV1_2 service = new NetworkServiceV1_2();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }
            service.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
