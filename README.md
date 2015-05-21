# GraphHopper Tour Optimization API

## Java Client

This client is automatically created from the swagger specification.

## Usage

See [TestMain](https://github.com/karussell/directions-api-vrp-java-client/blob/master/src/main/java/io/swagger/client/TestMain.java#L27) for an example usage.

## Maven
It is not yet in the central repository, thus you need to install it locally. Just do the following

```
git clone https://github.com/karussell/directions-api-vrp-java-client.git
cd directions-api-vrp-java-client/
mvn install
```
and reference it in your pom like this

```xml
<dependency>
  <groupId>com.graphhopper</groupId>
  <artifactId>directions-api-vrp-java-client</artifactId>
  <version>0.4.1</version>
</dependency>
```

## Other Clients

The other parts of the API are currently covered in a [separate repository](https://github.com/graphhopper/directions-api-java-client) (for Java). 

Clients in other languages are listed [here](https://github.com/graphhopper/directions-api/blob/master/README.md#api-clients-and-examples).

## License

This project stands under the Apache License 2.0
