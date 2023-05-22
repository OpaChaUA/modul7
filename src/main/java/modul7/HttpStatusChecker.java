package modul7;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpStatusChecker {
    public String getStatusImage(int code) throws IOException, InterruptedException {
        String url = "https://http.cat/" + code + ".jpg";
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        HttpResponse<String> respons = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        if (respons.statusCode() == 200) {
            return url;
        } else {
            throw new IOException("Failed to retrieve image. Response code:" + respons.statusCode());
        }
    }

}
