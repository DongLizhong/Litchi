package cn.litchi.upload;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableScheduling
@MapperScan("cn.litchi.model.mapper")
public class LitchiUploadServerApplication {

    @RequestMapping("/health")
    public String health() {
        return "health";
    }


    public static void main(String[] args) {
        SpringApplication.run(LitchiUploadServerApplication.class, args);
    }

}
