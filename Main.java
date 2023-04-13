/*
Kod bazowy programu Commit4_0:
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {


    try {
      Service s = new Service();
      Scanner scanner = new Scanner(System.in);

   while(true){
     System.out.println("1. dodaj 2. wyświetl 3.wyjscie");
       int choice = scanner.nextInt();

     switch (choice) {
      case 1:
        System.out.println("Podaj imie: ");
        String name = scanner.nextLine();
        String a = scanner.nextLine();

        System.out.println("Podaj nazwisko: ");
       
        String c = scanner.nextLine();
         
        System.out.println("Podaj wiek: ");

        int b = scanner.nextInt();

        s.addStudent(new Student(name,c, b));
         
      break;
      case 2:
        System.out.println("Wyświetl liste");
          var students = s.getStudents();
          for (Student current : students) {
           System.out.println(current.ToString());
         }
         break;
       case 3:
         System.out.println("Wybrano wyjście");
         break;
    }
   }

        } catch (IOException e) {

    }
  }
}