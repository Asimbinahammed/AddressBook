package bridgelabz;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class AddressBookIO {
    public static void readAddressBook() throws IOException {
        String message;
        File file=new File("IOAddressBook.csv" +
                "");
        if(!file.exists()){
            System.out.println("file doesnt exists");
        }
        try{
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            while ((message = bufferedReader.readLine()) != null) {
                System.out.println(message);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writeAddressBook(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Writing into Persons contact");
        String userInput=sc.nextLine();
        File file=new File("IOAddressBook.csv");
        if(!file.exists()){
            System.out.println("file doesnt exists");
        }
        try{
            FileWriter fileWriter=new FileWriter(file,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            fileWriter.write(userInput);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
