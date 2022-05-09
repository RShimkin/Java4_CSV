package shimkin.lab4;

/**
 *
 * @author User
 */
public class Branch {
    public Integer id;
    public String name;

    /**
     * Основной конструктор
     * @param name Название подразделения
     */
    public Branch(Integer Id, String Name)
    {
        this.name = name;
        this.id = id;
    }
}
