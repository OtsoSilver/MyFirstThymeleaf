package ru.tonkoshkurov.myfirstthymeleaf.dao;


import ru.tonkoshkurov.myfirstthymeleaf.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
