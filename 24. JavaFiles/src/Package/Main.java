package Package;
import java.io.*;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {
  public static void main(String[] args) {
    try {
      File archivo = new File("C:\\Users\\Javier\\Desktop\\Aghard\\Estudios\\Java\\JavaFiles\\archivo.txt");
      Scanner lectura = new Scanner(archivo);
      while (lectura.hasNextLine()) {
        String data = lectura.nextLine();
        System.out.println(data);
      }
      lectura.close();
    } catch (FileNotFoundException e) {
      System.out.println("Ha ocurrido un problema.");
      e.printStackTrace();
    }
  }
}