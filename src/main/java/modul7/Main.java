package modul7;


public class Main {
    public static void main(String[] args) {
        HttpStatusChecker checker = new HttpStatusChecker();
        HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
        HttpImageStatusCli cli = new HttpImageStatusCli();
        System.out.println(checker.getStatusImage(200));
        System.out.println("-----------------------");
        System.out.println(checker.getStatusImage(1000));
        System.out.println("$#####################$");
        downloader.downloadStatusImage(404);
        System.out.println("-----------------------");
        downloader.downloadStatusImage(1000);
        System.out.println("$#####################$");
        cli.askStatus();
    }
}