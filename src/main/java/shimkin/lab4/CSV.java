package shimkin.lab4;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Класс обработки csv-файла списка работников
 * @author User
 */
public class CSV {
    private Integer idFactory = 0;
    HashMap<String,Branch> map = new HashMap<>();

    /**
     * @param name Название подразделения
     * @return Подразделение
     */
    private Branch getBranchByName(String name){
        if (map.containsKey(name)){
            return map.get(name);
        }
        Branch branch = new Branch(++idFactory, name);
        map.put(name, branch);
        return branch;
    }

    /**
     * @param path Путь к csv-файлу
     * @return Список работников
     * @throws IOException
     */
    public ArrayList<Person> LoadFile(String path) throws IOException {
        ArrayList<Person> people = new ArrayList<>();
        CSVReader reader;
        try {
            reader = new CSVReader(new FileReader(path),';','"',1);
        }
        catch (FileNotFoundException e){
            throw new FileNotFoundException(path);
        }

        String[] lines;
        while ((lines = reader.readNext()) != null){
            DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            Person person = new Person(Integer.valueOf(lines[0]),
                    lines[1], lines[2],
                    LocalDate.parse(lines[3], dt),
                    getBranchByName(lines[4]),
                    Integer.parseInt(lines[5])
            );
            people.add(person);
        }
        return people;
    }
}
