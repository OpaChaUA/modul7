package modul7;

import java.util.Scanner;

public class HttpImageStatusCli {

    private static boolean isExit = false;
    private HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();

    void askStatus() {

        Scanner scanner = new Scanner(System.in);
        while (!isExit) {
            System.out.print("Enter HTTP status code, or exit to end the program");
            String userInput = scanner.nextLine();
            if ("exit".equalsIgnoreCase(userInput)) {
                isExit = true;
            } else {
                try {
                    int code = Integer.parseInt(userInput.strip());
                    String url = new HttpStatusChecker().getStatusImage((code));
                    if (url != null) {
                        downloader.downloadStatusImage((code));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter valid number or exit");
                }

            }
        }
    }
}


