package com.monitor.prometheus.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    final static Logger logger = LoggerFactory.getLogger(controller.class);

    @GetMapping("/service/api/info")
    public ResponseEntity<String> createLogs() {
        logger.info("Info api is called.");
        return ResponseEntity.ok().body("This application is running");
    }
}
