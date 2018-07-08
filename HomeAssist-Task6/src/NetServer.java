import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class NetServer {
	
	public static HttpServer server;
	
	public NetServer() {
		try {
			server = HttpServer.create(new InetSocketAddress(8080), 0);
			routePath(server);
			server.setExecutor(null);
			server.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void routePath(HttpServer serv) {
		serv.createContext("/", new IndexHandler());
	}
	
	static class IndexHandler implements HttpHandler {
	    @Override
	    public void handle(HttpExchange t) throws IOException {
	    	String response;
	    	response = "Welcome to HomeAssist Service !";
	        t.sendResponseHeaders(200, response.length());
	        OutputStream os = t.getResponseBody();
	        os.write(response.getBytes());
	        os.close();
	    }
	}
	
}
