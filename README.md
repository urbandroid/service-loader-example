# service-loader-example
Service Loader Example in Java

# steps to Run

```
cd service-loader-example
mvn clean install
java -p service-provider-1/target/service-provider-example-1-2.0-SNAPSHOT.jar:service-provider-2/target/service-provider-example-2-2.0-SNAPSHOT.jar:service-interface-example/target/service-interface-example-2.0-SNAPSHOT.jar:service-example/target/service-example-2.0-SNAPSHOT.jar  -m service.example.client/sukumaar.client.ServiceLoaderExample asgardThor Sukumaar
java -p service-provider-1/target/service-provider-example-1-2.0-SNAPSHOT.jar:service-provider-2/target/service-provider-example-2-2.0-SNAPSHOT.jar:service-interface-example/target/service-interface-example-2.0-SNAPSHOT.jar:service-example/target/service-example-2.0-SNAPSHOT.jar  -m service.example.client/sukumaar.client.ServiceLoaderExample earthThor Urbandroid
```
