package ac.front.repos;

import ac.front.beans.ac_beans_edit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ac_edit extends JpaRepository<ac_beans_edit, Integer> {


}
