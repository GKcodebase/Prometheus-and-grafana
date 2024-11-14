# Prometheus and Grafana Integration with Java

This project demonstrates integrating **Prometheus** and **Grafana** with a **Java** application to collect and visualize metrics. By using **Micrometer** to expose metrics and Prometheus to scrape them, you can monitor your Java application's performance in real-time and visualize critical metrics in Grafana dashboards.

## 📌 Prerequisites

Before you begin, ensure you have the following installed:

- Java 8 or higher
- Maven or Gradle
- Docker (for running Prometheus and Grafana containers)
- Prometheus
- Grafana

## 🚀 Getting Started

### 1. Clone the Repository

First, clone the repository to your local machine:

```bash
git clone https://github.com/GKcodebase/Prometheus-and-grafana.git
cd Prometheus-and-grafana
```

### 2. Run the Application
Build and run the Java application:
```
mvn clean install
mvn spring-boot:run
```
By default, the Java application will expose metrics at http://localhost:8080/actuator/prometheus.

### 3. Set Up Prometheus
You can run Prometheus in a Docker container by executing:
```
docker-compose up -d
```
This will start Prometheus and configure it to scrape metrics from your Java application.

### 4. Set Up Grafana
Once Prometheus is up, you can start Grafana using the following command:
```
docker-compose up -d grafana
```
Grafana will be accessible at http://localhost:3000. The default login credentials are:

Username: admin
Password: admin
Add Prometheus as a data source in Grafana and create dashboards to visualize the metrics exposed by your Java app.

### 5. Visualize Metrics
Create dashboards in Grafana to visualize key metrics such as:

JVM Memory Usage
Garbage Collection Metrics
Request Latency
HTTP Request Count

![Screenshot 2024-11-13 at 5 58 31 PM](https://github.com/user-attachments/assets/bec28f8b-15fc-4ebb-a90a-d0f3643b72e6)

## 🔧 Configuration
Prometheus configuration is defined in prometheus.yml, where you can adjust the scrape interval or add additional endpoints.
Grafana dashboards can be customized to visualize specific metrics from your Java application.

## 📝 Blog Post
Check out the full blog post on how to integrate Prometheus and Grafana with a Java application for better monitoring and visualization:

 [Getting Started with Prometheus and Grafana in Java](https://dev.to/gokul_gk/getting-started-with-prometheus-and-grafana-in-java-19ia )

## 📦 License
This project is open-source and available under the MIT License.

## 🔗 Resources
- Prometheus: :  [Prometheus Docs](https://prometheus.io/docs/introduction/overview/ )
- Grafana: [Grafana Docs](https://grafana.com/docs/grafana/latest/getting-started/   )
- Micrometer: [Micrometer Docs](https://micrometer.io/docs)
