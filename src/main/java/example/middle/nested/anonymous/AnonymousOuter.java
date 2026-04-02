package example.middle.nested.anonymous;

import example.middle.nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // printer 인터페이스를 생성하는 것이 아니라 printer라는 인터페이스를 구현할 클래스를 정의하는 것
        Printer printer = new Printer(){
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.getClass = "+printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }

}
