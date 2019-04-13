package cn.jerryshell.liveteaching;

import cn.jerryshell.liveteaching.config.LiveServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(LiveServerConfig.class)
@SpringBootApplication
public class LiveTeachingApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiveTeachingApplication.class, args);
    }

}