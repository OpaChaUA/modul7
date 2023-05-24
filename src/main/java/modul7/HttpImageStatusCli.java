package modul7;


import java.util.Scanner;

public class HttpImageStatusCli {

    private static boolean isExit = false;
    private HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();

    void askStatus() {

        Scanner scanner = new Scanner(System.in);
        while (!isExit) {
            System.out.print("Enter HTTP status code, or exit to end the program");
            if (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();
                new HttpStatusChecker().getStatusImage(userInput);
                downloader.downloadStatusImage(userInput);
            } else {
                System.out.println("Please enter valid number or exit");
                continue;
            }
            String stop = scanner.nextLine();
            isExit = stop.equals("exit");
        }
    }
}

