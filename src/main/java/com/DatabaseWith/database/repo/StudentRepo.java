package com.DatabaseWith.database.repo;
import java.util.List;
import com.DatabaseWith.database.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student,Long> {
    List<Student> findByName(String name);
}
