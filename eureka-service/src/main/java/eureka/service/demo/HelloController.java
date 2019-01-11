package eureka.service.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/index")
    public String say() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            for (ServiceInstance instance : instances) {
                LOG.info("host:{}", instance.getHost());
            }
        }
        return "Hello, Spring Boot!";
    }
}
