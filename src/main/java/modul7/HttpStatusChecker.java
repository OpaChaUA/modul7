package modul7;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public class HttpStatusChecker {
    public String getStatusImage(int code) throws IOException {
        String url = "https://http.cat/" + code + ".jpg";
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            return url;
        } else {
            throw new IOException("Failed to retrieve image. Response code: " + responseCode);
        }

    }
}
