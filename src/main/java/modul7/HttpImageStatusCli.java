package modul7;
import java.io.IOException;
import java.util.Scanner;

public class HttpImageStatusCli {

  private static boolean isExit =false;


            public static void main(String[] args) throws IOException {
                HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
                HelperClass helperClass = new HelperClass();
                Scanner scanner = new Scanner(System.in);
                while (!isExit) {
                    System.out.print("Enter HTTP status code");
                    String userInput = scanner.nextLine();
                    if (isNumber(userInput)) {

                        if (userInput.equals(new HttpStatusChecker().getStatusImage(Integer.parseInt(userInput)))){
                            downloader.downloadStatusImage(Integer.parseInt(userInput));
                        }
                    } else {
                        System.out.println("Please enter valid number");
                    }
                    System.out.println("Enter Exit to exit");
                    String stop = scanner.nextLine();
                    isExit =stop.equals("exit");

                }
            }

            public static boolean isNumber(String input) {
                try {
                    Double.parseDouble(input);
                    return true;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
        }

