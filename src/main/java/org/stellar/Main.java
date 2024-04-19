package org.stellar;

import org.yaml.snakeyaml.Yaml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
  public static void main(String[] args) throws SQLException {
    testYaml();
    testJdbc();
    Yaml yaml = new Yaml();
    String document = "hello: world 2";
    Object data = yaml.load(document);
    System.out.println(data);
  }

  private static void testJdbc() throws SQLException {
    String url = "jdbc:postgresql://localhost/test";
    Properties props = new Properties();
    props.setProperty("user", "fred");
    props.setProperty("password", "secret");
    props.setProperty("ssl", "true");
    DriverManager.getConnection(url, props);
  }

  private static void testYaml() {
    Yaml yaml = new Yaml();
    String document = "hello: world";
    Object data = yaml.load(document);
    System.out.println(data);
  }
}
