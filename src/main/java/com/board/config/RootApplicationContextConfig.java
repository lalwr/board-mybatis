package com.board.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "com.board.dao",
        "com.board.service"
})
@Import({DbConfig.class})
public class RootApplicationContextConfig {

}
