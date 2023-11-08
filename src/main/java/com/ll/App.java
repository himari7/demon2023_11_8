package com.ll;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    void run() {
        int i = 0;
        ArrayList<Famous_Write> list = new ArrayList<>();
        System.out.println("= == 염언 앱 == =");
        while(true) {
            System.out.print("명언 ) ");
            Scanner scanner = new Scanner(System.in);
            String write = scanner.nextLine();
            System.out.println(write);
            if(write.equals("등록")){
                i++;
                System.out.print("명언 : ");
                String fword = scanner.nextLine();
                System.out.print("작가 : ");
                String author = scanner.nextLine();
                Famous_Write fw = new Famous_Write(i, fword, author);
                list.add(fw);
                System.out.printf("%d번 명언이 등록되었습니다. \n" , i);
            } else if (write.equals("목록")) {
                for(int a = list.size()-1; a >= 0; a--){
                    Famous_Write fw = list.get(a);
                    System.out.printf("%d / %s / %s\n", fw.w_num, fw.fword, fw.author);
                }

            } else if (write.equals("종료")){
                break;
            }
        }
    }
}

