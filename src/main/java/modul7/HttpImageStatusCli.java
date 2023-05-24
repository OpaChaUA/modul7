package modul7;


import java.util.Scanner;

public class HttpImageStatusCli {

    private static boolean isExit = false;
    private HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();

    void askStatus() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter HTTP status code, or exit to end the program");
            if (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();
                new HttpStatusChecker().getStatusImage(userInput);
                downloader.downloadStatusImage(userInput);
                continue;
            } else {
                System.out.println("Please enter valid number or exit");
            }
            String stop = scanner.nextLine();
            if (stop.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }
}

