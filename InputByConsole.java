import java.io.*;
public class InputByConsole{
  public static void main(String[] args) {
    Console con= System.console();
    System.out.println("Enter your name");
    String name = con.readLine();
    System.out.println("Your name is :"+name);
  }
}
