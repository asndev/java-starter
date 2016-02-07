package de.antonstepan.hackathonstarter;

import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    Arrays.asList("foo", "xxx", "bar")
        .parallelStream()
        .filter(s -> !s.startsWith("x"))
        .map(s -> s.toUpperCase())
        .reduce((s1, s2) -> s1+s2)
        .ifPresent(System.out::println);
  }
}
