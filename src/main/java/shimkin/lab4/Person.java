package shimkin.lab4;

import java.time.LocalDate;

/**
 * Класс человека (id, имя, пол, подразделение, дата рождения, зарплата
 * @author User
 */
public class Person {
    public Integer id;
    public String name;
    public LocalDate birthDate;
    public String sex;
    public Branch branch;
    public Integer salary;

    /**
     * Основной конструктор
     * @param Id Идентификатор
     * @param Name Имя
     * @param Branch Подразделение
     * @param Sex Пол
     * @param Salary Зарплата
     * @param BDate Дата рождения
     */
    public Person(int Id, String Name, String Sex, LocalDate BDate, Branch Branch, Integer Salary)
    {
        this.id = Id;
        this.name = Name;
        this.sex = Sex;
        this.branch = Branch;
        this.salary = Salary;
        this.birthDate = BDate;
    }
}
