/**
 * This package doing something for package-info.java file.
 * Test multiline
 */
package com.example;

/**
 * This is a class Greeter.
 */
public class Greeter {

  /**
   * This is a constructor of Greeter. 
   */
  public Greeter() {
  }

  /**
   * This is a simple description of the method.
   * @param someone the name of a person
   * @return greeting string
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
