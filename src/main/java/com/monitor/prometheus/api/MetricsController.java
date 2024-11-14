package com.monitor.prometheus.api;

import io.micrometer.prometheus.PrometheusMeterRegistry;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The Metrics controller.
 */
@RestController
public class MetricsController {
    private final PrometheusMeterRegistry registry;

    /**
     * Instantiates a new Metrics controller.
     *
     * @param registry the registry
     */
    public MetricsController(PrometheusMeterRegistry registry) {
        this.registry = registry;
    }

    /**
     * Gets metrics.
     *
     * @return the metrics
     */
    @GetMapping("/service/api/metrics")
    public String getMetrics() {
        return registry.scrape();
    }
}
