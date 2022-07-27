package dev.be.feigntest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final TestService testService;

    public TestController(TestService testService){
        this.testService = testService;
    }

    @GetMapping("/")
    public String main(){
        return  testService.TestFeign();
    }

    @GetMapping("/testfeign")
    public String testFeign(){
        return "Test Feign Client";
    }

}
