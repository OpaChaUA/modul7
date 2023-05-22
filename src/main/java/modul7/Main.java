package modul7;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        HttpStatusChecker checker = new HttpStatusChecker();
        try {
            String image200 = checker.getStatusImage(200);
            System.out.println("200: " + image200);

            String image404 = checker.getStatusImage(404);
            System.out.println("404: " + image404);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}