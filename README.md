# Hello World Java Application

This is a simple Java application demonstrating basic output and object manipulation using Microsoft OpenJDK 21.

## Features

- Prints "Hello World!" to the console.
- Tests Microsoft OpenJDK 21.
- Creates and prints `ResultData` and `LoginResult` objects.
- Outputs `LoginResult` in JSON format using `ToStringBuilder`.

## Prerequisites

- Java Development Kit (JDK) 21
- Apache Commons Lang library (for `ToStringBuilder`)

## Getting Started

1. **Clone the repository:**

    ```sh
    git clone https://github.com/yourusername/helloworld-java.git
    cd helloworld-java
    ```

2. **Compile the code:**

    ```sh
    javac -cp .:commons-lang3-3.12.0.jar uk/co/utel/test/UtelHelloworld.java
    ```

3. **Run the application:**

    ```sh
    java -cp .:commons-lang3-3.12.0.jar uk.co/utel/test/UtelHelloworld
    ```

## Code Overview

```java
public class UtelHelloworld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("This is a test of Microsoft OpenJDK 21");

        System.out.println("Make some output data");
        ResultData rd = new ResultData(1, "Hello");
        System.out.println("rd=" + rd);

        LoginResult lr = new LoginResult();
        lr.setId(123L);
        lr.setFirstName("Jason");
        lr.setLastName("Thorpe");

        System.out.println("uk.co.utel.test.UtelHelloworld.main(): " + lr.toString());

        String jsonLR = ToStringBuilder.reflectionToString(lr, ToStringStyle.JSON_STYLE);
        System.out.println("uk.co.utel.test.UtelHelloworld.main(): " + jsonLR);
    }
}
