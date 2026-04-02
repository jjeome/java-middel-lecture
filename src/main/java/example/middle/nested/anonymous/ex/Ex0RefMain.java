package example.middle.nested.anonymous.ex;

import example.middle.nested.local.Printer;

public class Ex0RefMain {
    public static void process(String name){
        Printer printer = new Printer() {
            @Override
            public void print() {
                System.out.println("프로그램 시작");
                System.out.println("Hello " + name);
                System.out.println("프로그램 종료");
            }
        };
        printer.print();
    }

    public static void main(String[] args) {
        process("Java");
        process("Spring");
    }
}
