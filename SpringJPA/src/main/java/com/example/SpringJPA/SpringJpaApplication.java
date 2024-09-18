package com.example.SpringJPA;

import com.example.SpringJPA.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJpaApplication.class,args);
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);

		List<Employee> employee = employeeRepository.findByName("Madhu");
		employee.forEach(System.out::println);

		List<Employee> employee1 = employeeRepository.findByNameAndId("Kapil",3);
		employee1.forEach(System.out::println);

		List<Employee> employee2 = employeeRepository.findByNameOrId("Kapil",2);
		employee2.forEach(System.out::println);

		List<Employee> allEmployee = employeeRepository.getAllEmployee();
		allEmployee.forEach(System.out::println);

		List<Employee> employeeByName = employeeRepository.getEmployeeByName("Madhu");
		employeeByName.forEach(System.out::println);

		List<Employee> employeeByNameAndId = employeeRepository.getEmployeeByNameAndId("Madhu",4);
		employeeByNameAndId.forEach(System.out::println);

		employeeRepository.getEmployees().forEach(System.out::println);

	}

}
/*
create a obj of employee
		Employee employee = new Employee();
		employee.setName("Madhu");
		employee.setId(1);

		Employee employee1 = new Employee();
		employee1.setName("Goransh");
		employee1.setId(2);

		// save multiple obj
		List<Employee> employees = List.of(employee,employee1);
		Iterable<Employee> result = employeeRepository.saveAll(employees);

		result.forEach(employee2 -> {
			System.out.println(employees);
		});
		// Saving Single User
//		Employee result = employeeRepository.save(employee1);
//		System.out.println("Employee Detail Saved"+result);

		update user
        Optional<Employee> optional = employeeRepository.findById(2); // key benefits of optional is that it forces you to handle the case where the value is absent
        Employee employee = optional.get();// if value present return it else throw NoSuchElement error
		employee.setName("Goransh Todwal");

		Employee result = employeeRepository.save(employee);
		System.out.println(result);

		to get the data
		findById(id)- return Optional containing your data
		Iterable<Employee> itr = employeeRepository.findAll();
		itr.forEach(employee ->System.out.println(employee));//lambda function
		itr.forEach(System.out::println); // reference method
		itr.forEach(new Consumer<Employee>() { // anonymous c
		lass
			@Override
			public void accept(Employee employee) {
               System.out.println(employee);
			}
		});
		Iterable<Employee> iterator = (Iterable<Employee>) itr.iterator();
		while(iterator.iterator().hasNext()){
			Employee employee = iterator.iterator().next();
			System.out.println(employee);
		}

		Delete the employee element
		employeeRepository.deleteById(1);
		System.out.println("Deleted");

		Iterable<Employee> allEmployees = employeeRepository.findAll();
		allEmployees.forEach(System.out::println);
		employeeRepository.deleteAll(allEmployees);
*/

