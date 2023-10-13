package com.startcv.startcv;
import com.startcv.api.Hello;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {

        register(Hello.class);
    }
}

