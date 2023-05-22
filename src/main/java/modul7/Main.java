package modul7;

import java.io.IOException;


public class Main {
    public static void main(String[] args)  {
        HttpStatusChecker httpStatusChecker = new HttpStatusChecker();
        try {
            System.out.println(httpStatusChecker.getStatusImage(418));

        System.out.println("-------------------------------");
        System.out.println(httpStatusChecker.getStatusImage(1000));
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}