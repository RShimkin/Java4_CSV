package shimkin.lab4;

import java.util.Objects;

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
    public Branch(Integer id, String name)
    {
        this.name = name;
        this.id = id;
    }
    
    public Branch() {}
    
    @Override
    public String toString() {
        return "Division{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch division = (Branch) o;
        return Objects.equals(id, division.id) &&
                Objects.equals(name, division.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
