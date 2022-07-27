package dev.be.feigntest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TestClient testClient;

    public String TestFeign(){
        return testClient.testFeign();
    }
}
