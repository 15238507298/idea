package ac.demo.com.ac.front.beans;

import org.springframework.context.annotation.Scope;

import javax.persistence.*;

@Entity
//@Scope("singleton")
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "ac_edit_name")})
public class ac_beans_edit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ac_edit_id;
    @Column()
    private String ac_edit_name;

    public int getAc_edit_id() {
        return ac_edit_id;
    }

    public void setAc_edit_id(int ac_edit_id) {
        this.ac_edit_id = ac_edit_id;
    }

    public String getAc_edit_name() {
        return ac_edit_name;
    }

    public void setAc_edit_name(String ac_edit_name) {
        this.ac_edit_name = ac_edit_name;
    }

    @Override
    public String toString() {
        return "ac_edit_beans{" +
                "ac_edit_id=" + ac_edit_id +
                ", ac_edit_name='" + ac_edit_name + '\'' +
                '}';
    }
}
