/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package shimkin.lab4;

import java.util.List;

/**
 *
 * @author User
 */
public class Lab4 {

    public static void main(String[] args) {
        CSV reader = new CSV();
        try {
            List<Person> people = reader.LoadFile("foreign_names.csv");
            for (Person person: people) {
                System.out.println(person.toString());
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
