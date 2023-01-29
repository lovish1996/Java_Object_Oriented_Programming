package source_code.labsheet_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io package is imported for using BufferedReader class
 */
public class Example1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Enter your First Name: ");
        String name = bufferedReader.readLine();

        System.out.println("Your name is: " + name);
    }
}
