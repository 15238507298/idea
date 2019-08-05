package ac.demo.com.ac.front.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
public class acl_beans_user implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uid;
    @Column
    private String uname;
    @Column
    private String upass;
    @Column
    private String sex;
    @Column
    private String email;
    @Column
    private String address;
    @Column
    private String logintime;
    @Column
    private String headpic;
}
