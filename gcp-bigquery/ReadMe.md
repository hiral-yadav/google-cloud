## BOM Dependencies

### Java - https://cloud.google.com/bigquery/docs/reference/libraries#client-libraries-install-java

[//]: # (libraries-bom does not support spring boot)

```<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.google.cloud</groupId>
      **<artifactId>libraries-bom</artifactId>**
      <version>26.43.0</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency>
  </dependencies>
</dependencyManagement>
```
### Spring Boot 

[//]: # (Dependencies for Spring Boot are managed by Spring Boot itself.)

```<dependency>
        <groupId>com.google.cloud</groupId>
        <artifactId>spring-cloud-gcp-dependencies</artifactId>
        <version>6.0.0</version>
        <scope>import</scope>
        <type>pom</type>
    </dependency>```

