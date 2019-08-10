package ac.front.beans;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "ac_edit_name")})
public class ac_beans_edit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ac_edit_id;
    @Column()
    private String ac_edit_name;

}
