import java.io.*;
public class InputByBufferedReader
{
    public static void main(String[] args)throws IOException
      {

        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Enter your nic name: ");

        String name = br.readLine();

        System.out.println("Enter your Address : ");

        String add = br.readLine();

        System.out.println("your Nic Name : "+name);

        System.out.println("your Address is : "+add);
}}
