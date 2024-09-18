package com.example.SpringJPA.repository;

import com.example.SpringJPA.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public List<Employee> findByName(String name); // find-->introducer
    public List<Employee> findByNameAndId(String name, int id);
    public List<Employee> findByNameOrId(String name, int id);

    @Query("select e FROM Employee e")
    public List<Employee> getAllEmployee();

    @Query("select e FROM Employee e WHERE e.name =:n")
    public List<Employee> getEmployeeByName(@Param("n") String name);

    @Query("select e FROM Employee e WHERE e.name =:n and e.id=:i")
    public List<Employee> getEmployeeByNameAndId(@Param("n") String name, @Param("i") int id);

    @Query(value = "select * from employee" , nativeQuery = true)
    public List<Employee> getEmployees();
}
