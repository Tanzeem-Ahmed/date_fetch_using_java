import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "https://api.chucknorris.io/jokes/random/";

        // Building Request
        HttpRequest req = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        // Client object
        HttpClient client = HttpClient.newBuilder().build();

        HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString());

        // Status code and body
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
