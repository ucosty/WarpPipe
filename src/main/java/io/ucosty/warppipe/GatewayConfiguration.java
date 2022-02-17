package io.ucosty.warppipe;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.path("/test").uri("http://localhost:5000/"))
                .route(p -> p.host("test.warppipe.local:8080").and().path("/**").uri("http://localhost:5000/"))
                .build();
    }
}
