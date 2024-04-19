package org.stellar;

import org.yaml.snakeyaml.Yaml;

public class Main {
  public static void main(String[] args) {
    Yaml yaml = new Yaml();
    String document = "hello: world 2";
    Object data = yaml.load(document);
    System.out.println(data);
  }
}
