package com.soutwind.repository;

import com.soutwind.entity.Student;

import java.util.Collection;

/**
 * @author cgy
 * @version 1.0
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
