package modul7;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
      System.out.println(new HttpStatusChecker().getStatusImage(200));
       System.out.println("--------------------------------------");
        System.out.println(new HttpStatusChecker().getStatusImage(1000));
        System.out.println("--------------------------------------");
        new HttpStatusImageDownloader().downloadStatusImage(1012);
       new HttpStatusImageDownloader().downloadStatusImage(418);
//        HttpImageStatusCli cli = new HttpImageStatusCli();
//        cli.askStatus();

    }
}