package me.tomoya;

import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

/**
 * Created by tomo on 2014/07/06.
 */
public class Main {

    private static final int DEFAULT_PORT = 58080;
    public static final URI BASE_URI = getBaseURI();

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost/").port(DEFAULT_PORT).build();
    }

    public static void main(String[] args) throws Exception {

        // ResourceConfig config = new ResourceConfig(HelloWorld.class);
        ResourceConfig config = ResourceConfig.forApplicationClass(GlobalApplication.class);


        // JerseyでJacksonを使うには初期パラメータ com.sun.jersey.api.json.POJOMappingFeature を true に設定します。
        // http://backpaper0.github.io/2013/05/02/jaxrs.html
        // config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, true);

        Server server = JettyHttpContainerFactory.createServer(getBaseURI(), config);


        server.start();

        System.in.read();
        System.out.println("Stopping server");
        server.stop();
        System.out.println("Server stopped");
    }
}
