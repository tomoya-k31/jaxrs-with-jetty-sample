package me.tomoya;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by tomo on 2014/07/06.
 */
@ApplicationPath("/")
public class GlobalApplication extends ResourceConfig {

    private static final String PREFIX_PACKAGE = ".controllers";

    public GlobalApplication() {
        packages(this.getClass().getPackage().getName() + PREFIX_PACKAGE);
    }
}
