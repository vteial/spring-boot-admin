package io.wybis.wss

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("!dev")
public class ApplicationPrd {

}